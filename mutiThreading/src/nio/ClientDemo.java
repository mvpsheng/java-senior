package nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * FileName: ClientDemo
 * author: gxs
 * Date: 2021/10/31  14:55
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket client1 = null;
        PrintWriter writer = null;
        BufferedReader reader = null;
//        try {
//            client1 = new Socket();
//            client1.connect(new InetSocketAddress("localhost",8080));
//            writer = new PrintWriter(client1.getOutputStream(),true);
//            writer.println("hello gxs");
//            writer.flush();
//
//            reader = new BufferedReader(new InputStreamReader(client1.getInputStream()));
//            System.out.println("from remoteDesktop.server: " + reader.readLine());
//        } catch (UnknownException | IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (writer != null) {
//                writer.close();
//            }
//            if (reader != null) {
//                reader.close();
//            }
//            if (client1 != null) {
//                client1.close();
//            }
//        }
    }
}
