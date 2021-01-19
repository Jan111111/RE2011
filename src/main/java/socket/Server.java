package socket;

import java.io.*;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
    聊天室服务端
 */
public class Server {
    /*
        java.net.ServerSocket是运行在服务端的，如果我们把Socket
        比喻成“电话”，那么ServerSocket则比喻成“总机”
        ServerSocket主要有两个工作：
        1：向服务器端的操作系统申请服务端口，客户端就是通过这个端口与
        ServerSocket建立链接的。
        2：监听服务端口，一旦一个客户端尝试建立链接，此时会立即创建一个
        Socket（相当于电话），然后通过这个Socket就可以与建立链接的客户
        端交互了。
     */
    private ServerSocket serverSocket;
    /*
    该数组用于保存所有ClientHandler对应的客户端的输出流
    便于他们之前互相广播消息使用。
     */
    //private PrintWriter[] allout={};
    private Collection<PrintWriter> allout=new ArrayList<>();


    public Server(){
        try {
            System.out.println("正在启动服务端..");
            /*
                创建ServerSocket时要指定服务端口，该端口不能与系统
                中其他程序的端口冲突，否则会抛出异常：
                java.net.BindException:address already in use
             */
            serverSocket=new ServerSocket(8088);
            System.out.println("服务器启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        /*
            ServerSocket提供的方法：
            Socket accept（）
            该方法是一个阻塞方法，调用后程序“卡住”，直到一个客户端
            与服务端建立链接，此时accept方法会立即返回一个Socket
            通过这个Socket就可以和该客户端交互了。
            多次调用这个方法就可以与让多个客户端建立链接。
         */
        try {
            while(true) {
                System.out.println("等待客户端链接..");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户链接了！");

                ClientHandler clientHandler=new ClientHandler(socket);
                Thread t=new Thread(clientHandler);
                t.start();
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server=new Server();
        server.start();
    }
    /*
        该线程任务是负责与指定的客户端进行交互
     */
    private class ClientHandler implements  Runnable{
        private Socket socket;
        private String host;//远端计算机地址信息（客户端）
        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取客户端的IP地址的字节串格式
            host=socket.getInetAddress().getHostAddress();
        }
        public void run(){
            PrintWriter pw=null;
            try{
                 /*
                InputStream getInputStream()
                通过Socket的这个方法可以获取一个字节输入流，读取的就是
                远端计算机发送过来的数据。
             */
                InputStream in =socket.getInputStream();
                InputStreamReader isr=new InputStreamReader(in,"UTF-8");
                BufferedReader br=new BufferedReader(isr);

                //通过socket获取输出流，用于给客户端发送消息
                OutputStream out=socket.getOutputStream();
                OutputStreamWriter osw=new OutputStreamWriter(out);
                BufferedWriter bw=new BufferedWriter(osw);
                pw=new PrintWriter(bw,true);
                /*
                  将当前客户端的输出流存入allOut，以便其他ClientHandler可以
                  将消息转发给当前客户端.
                 */

                /*
                    this不行，因为这里的this是ClientHandler实例
                    每个线程都有自己的ClientHandler,因此看到的不是
                    同一个对象
                 */
                /*
                    allOut数组不可以，是因为我们的数组扩容过，扩容会产生新对象
                    这样其他线程看到的allOut不一定是当前线程之前锁定的数组对象，
                    很有可能看到的是扩容后的新数组对象（没有锁的）.
                 */
                //用这些内部类所属的外部类Server的实例
                synchronized (Server.this) {

//                   // 1.先对allOut数组扩容、
//                    //allout=allout.add();
//                    //2.将对应当前客户端的输出流存入该数组
//                    //allout.addAll(pw);
                    allout.add(pw);
                }
                    System.out.println(host + "上线了，当前在线人数" + allout.size());


                String line;
                while((line=br.readLine())!=null) {
                    System.out.println(host+"说：" + line);
                    synchronized (Server.this) {
                        for (PrintWriter p:allout){
                            p.println(host + "说" + line);
                        }
                    }
                }
            }catch(IOException e){
 //                e.printStackTrace();
            }finally{
                //当客户端断开后要进行的相关处理
                synchronized (Server.this) {
                    //将当前客户端的输出流从allout数组中删除
//                    for (int i = 0; i < allout.length; i++) {
//                        if (allout[i] == pw) {
//                            allout[i] = allout[allout.length - 1];
//                            allout = Arrays.copyOf(allout, allout.length - 1);
//                            break;
//                        }
//                    }
                    allout.remove(pw);
                }
                System.out.println(host+"下线了，当前在线人数"+allout.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
