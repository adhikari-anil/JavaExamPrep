
import java.io.*;
import javax.swing.*;

public class Dialog {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello tere ma sala!");
        String name = JOptionPane.showInputDialog(null, "Enter your name sir: ");
        System.out.println(name);
        JOptionPane.showConfirmDialog(null, "Are you fucking sure?");

        // File chooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.showOpenDialog(null);
    }
}
