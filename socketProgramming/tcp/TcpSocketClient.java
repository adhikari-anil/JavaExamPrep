
import java.net.*;
import java.io.*;
import java.util.*;

public class TcpSocketClient {

    public static void main(String[] args) throws IOException {
        // socket creation...
        try (Socket sc = new Socket("localhost", 4455);
             // implement getInputStream()...
             Scanner in = new Scanner(sc.getInputStream());
             // implement PrintWriter
             PrintWriter out = new PrintWriter(sc.getOutputStream(), true)) {

            out.println("Hello Server!");

            String s = in.nextLine();

            System.out.println("From Server: " + s);
        }
    }
}
