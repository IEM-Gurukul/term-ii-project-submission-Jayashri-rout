import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable, Observer {

    private Socket socket;
    private ChatServer server;
    private BufferedReader in;
    private PrintWriter out;
    private String name;

    public ClientHandler(Socket socket,ChatServer server) {

        this.socket = socket;
        this.server = server;

        try {
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            out = new PrintWriter(
                    socket.getOutputStream(), true);

            out.println("Enter your name:");
            name = in.readLine();
            server.notifyObservers(name + " joined the chat");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    }

    @Override
    public void run() {

    try {
        String msg;

        while ((msg = in.readLine()) != null) {
            server.notifyObservers(name + ": " + msg);
        }

    } catch (Exception e) {
        System.out.println(name + " disconnected");

    } finally {
        server.notifyObservers(name + " left the chat");
    }
}

    @Override
    public void update(String message) {
        out.println(message);
    }
}