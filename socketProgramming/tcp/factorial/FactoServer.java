
import java.io.*;
import java.net.*;
import java.util.*;

public class FactoServer {

    static int fact(int a) {
        if (a == 0) {
            return 1;
        }
        return a * fact(a - 1);
    }

    public static void main(String[] args) throws IOException {
        //1. Create Server Socket...
        ServerSocket s = new ServerSocket(6969);

        // 2. Client socket tanne server ma... accept client..
        Socket client = s.accept();

        // 3. Create Input and output handler...
        Scanner ins = new Scanner(client.getInputStream());
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        // Receive value from client...
        int value = ins.nextInt();

        // Send result back to client...
        out.println(fact(value));

        // Close all the open connections...
        ins.close();
        out.close();
        s.close();
    }
}
