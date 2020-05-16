import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_HOST = "49.233.172.121";
    private static final int SERVER_PORT = 9393;

    public static void main(String[] args) throws IOException {
        Scanner stdinScanner = new Scanner(System.in);

        try (Socket socket = new Socket(SERVER_HOST, SERVER_PORT)) {
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            Scanner socketScanner = new Scanner(inputStream, "UTF-8");

            System.out.print("请输入> ");
            while (stdinScanner.hasNextLine()) {
                String request = stdinScanner.nextLine();
                outputStream.write(request.getBytes("UTF-8"));
                outputStream.write("\r\n".getBytes("UTF-8"));
                outputStream.flush();

                String response = socketScanner.nextLine();
                System.out.println("  服务器返回消息: " + response);

                System.out.print("请输入> ");
            }
        }
    }
}
