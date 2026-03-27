import java.net.Socket;
import java.util.*;

public class ClientHandler implements Runnable, observer {

    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        System.out.println("Handling client in separate thread");

    }

    @Override
    public void update(String message) {
        System.out.println("Message received: " + message);
}
}