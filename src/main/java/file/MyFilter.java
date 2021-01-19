package file;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        String fileName=file.getName();
//        int index=fileName.indexOf("s");
//        return index!=-1;

        //String的contains方法是判断字符串是否包含给定的内容
        return  fileName.contains("s");
    }
}
