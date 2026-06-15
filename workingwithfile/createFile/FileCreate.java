
import java.io.*;

public class FileCreate {

    public static void main(String[] args) throws IOException {
        System.out.println("Working with Files...... \n");

        // For File Creation....
        File f = new File("student.txt");

        if (f.createNewFile()) {
            System.out.println("File created!");
        } else {
            System.out.println("Already exist!");
        }
    }
}
