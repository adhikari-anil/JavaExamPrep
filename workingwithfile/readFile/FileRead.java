
import java.io.*;

public class FileRead {

    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("student.txt")) {
            int ch;

            System.out.println(fr.read());
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }

            fr.close();

        }

    }
}
