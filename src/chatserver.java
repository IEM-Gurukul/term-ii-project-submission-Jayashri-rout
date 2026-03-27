import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    private List<Observer> clients = new ArrayList<>();

    public void startServer() {

        try {

            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server started...");

            while (true) {

                Socket socket = server.accept();
                System.out.println("New client connected");

                ClientHandler handler = new ClientHandler(socket);
                addObserver(handler);

                Thread t = new Thread(handler);
                t.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void addObserver(Observer o) {
        clients.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        clients.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : clients) {
            o.update(message);
    }
}
}