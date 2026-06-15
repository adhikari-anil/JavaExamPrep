
import java.io.*;

public class FileWrite {

    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("student.txt")) {
            fw.write("Hello JAVA WORLD");
            fw.close();
        }
        System.out.println("Data is written!!!");
    }
}
