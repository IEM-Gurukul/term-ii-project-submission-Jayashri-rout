import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

    public static void startClient() {

        try {

            Socket socket = new Socket("localhost", 5000);

            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(System.in));

            BufferedReader serverIn =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));

            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);

            Thread readThread = new Thread(() -> {

                try {

                    String msg;

                    while ((msg = serverIn.readLine()) != null) {
                        System.out.println(msg);
                    }

                } catch (Exception e) {
                }

            });

            readThread.start();

            String userMsg;

            while ((userMsg = input.readLine()) != null) {
                out.println(userMsg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}