import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8090);
        System.out.println("Listening for connection on port 8090...");

        while (true) {
            try (Socket clientSocket = server.accept()) {
                System.out.println("Client connected!");

                // Read request
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null && !line.isEmpty()) {
                    System.out.println(line);
                }

                // Prepare response
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n" +
                        "Content-Type: text/plain\r\n" +
                        "Connection: close\r\n" +
                        "\r\n" +
                        today.toString();
                
                clientSocket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
        }
    }
}
