
import java.io.*;
import java.net.*;
import java.util.*;

public class TcpSocketServer {

    public static void main(String[] args) throws IOException {
        System.out.println("Server is listening on port :"+ 4455);
        try (ServerSocket ss = new ServerSocket(4455); 
            Socket client = ss.accept(); 
            Scanner in = new Scanner(client.getInputStream()); 
            PrintWriter out = new PrintWriter(client.getOutputStream(), true)) {
            String msg = in.nextLine();
            System.out.println("From client: " + msg);
            out.println("Hello Client");
        }
    }
}
