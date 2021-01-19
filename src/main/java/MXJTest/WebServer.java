package MXJTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    private ServerSocket serverSocket;

    public WebServer(){
        try{
            System.out.println("服务端连接中..");
            serverSocket=new ServerSocket(8088);
            System.out.println("服务端连接成功");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void start(){
        try{
            System.out.println("等待客户连接..");
            Socket socket =serverSocket.accept();
            System.out.println("一个客户连接！！");
            InputStream in=socket.getInputStream();
            int d;
            while((d=in.read())!=-1){
                System.out.print((char)d);
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        WebServer server=new WebServer();
        server.start();
    }
}
