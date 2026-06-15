// yesma setBounds() method le absolute position define garera item ya element lai place garxah...


import javax.swing.*;

public class NoLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel label1 = new JLabel("Hello K xah Khabara!!!!");
        JLabel label2 = new JLabel("Hi thikxah mero tah!!!!");

        label1.setBounds(100, 100, 400, 50);
        label2.setBounds(100, 150, 400, 50);

        frame.add(label1);
        frame.add(label2);

        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
