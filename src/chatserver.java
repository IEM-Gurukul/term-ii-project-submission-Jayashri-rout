import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public void startServer() {

        try {

            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server started...");

            while (true) {

                Socket socket = server.accept();
                System.out.println("New client connected");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}