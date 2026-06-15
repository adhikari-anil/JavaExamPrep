// yesma chai harek element ya labels haru horizontally aligned hunxan... Any yesle wrap pani garxah...

import javax.swing.*;

public class FlowLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel label1 = new JLabel("Oe K xah Kta....");
        JLabel label2 = new JLabel("Mero tah jhakas yrr....");

        frame.add(label1);
        frame.add(label2);

        frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
