import java.io.*;
import java.util.Scanner;

public class 字符集转换程序 {
    public static void main(String[] args) throws IOException {
        String utf = "utf.txt";
        String gbk = "gbk.txt";

        try(Reader reader = new InputStreamReader(new FileInputStream(utf),"UTF-8")){
            try(Writer writer = new OutputStreamWriter(new FileOutputStream(gbk),"GBK")) {
                char[] buffer = new char[4096];
                int len;
                while((len = reader.read(buffer)) != -1){
                    writer.write(buffer,0,4096);
                }
                writer.flush();
            }
        }
    }


}
