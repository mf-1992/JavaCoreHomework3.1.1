import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8081;
        String message = "mf-1992";

        try (Socket socket = new Socket(host, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            out.println(message);
            String msg = in.readLine();
            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}