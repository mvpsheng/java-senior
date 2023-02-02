package nio;

import org.omg.CORBA.portable.UnknownException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;

/**
 * FileName: HeavySocketClient
 * author: gxs
 * Date: 2021/10/31  15:06
 */
public class HeavySocketClient {
    private static ExecutorService tp = Executors.newCachedThreadPool();
    private static final int sleep_time = 1000 * 1000 * 1000;
    public static class EchoClient implements Runnable {
        @Override
        public void run() {
            Socket client = null;
            PrintWriter writer = null;
            BufferedReader reader = null;
            try {
                client = new Socket();
                client.connect(new InetSocketAddress("localhost",8080));
                writer = new PrintWriter(client.getOutputStream(),true);
                writer.print("h");
                LockSupport.parkNanos(sleep_time);
                writer.print("e");
                LockSupport.parkNanos(sleep_time); writer.print("l");
                LockSupport.parkNanos(sleep_time); writer.print("l");
                LockSupport.parkNanos(sleep_time); writer.print("0");
                LockSupport.parkNanos(sleep_time);
                writer.println();
                writer.flush();

                reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                System.out.println("from remoteDesktop.server: " + reader.readLine());
            } catch (UnknownException | IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                    if (reader != null) {
                        reader.close();
                    }
                    if (client != null) {
                        client.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        EchoClient ec = new EchoClient();
        for (int i = 0; i < 10; i++) {
            tp.execute(ec);
        }
    }
}
