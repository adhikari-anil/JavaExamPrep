
import java.io.*;
import java.net.*;
import java.util.*;

public class FactoClient {

    public static void main(String[] args) throws IOException {

        // Socket call garnu parxah
        Socket soc = new Socket("localhost", 6969);

        // Server le pathako msg receive garxah....
        Scanner ins = new Scanner(soc.getInputStream());

        // 17,18 le client bata server ma Message pathauxah...
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        out.println(5);

        // Server bata aako msg lai client ma temp save gareko...
        int fact = ins.nextInt();

        System.out.println("Pathako Number: " + 5);
        System.out.println("Factorial from server: " + fact);

        ins.close();
        out.close();
        soc.close();
    }
}
