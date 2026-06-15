// Yesma whole screen lai 5 region ma divide gareko hunxah i.e E,W,N,S,C....


import javax.swing.*;

public class BorderLayout {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JButton btn1 = new JButton("East");
        JButton btn2 = new JButton("West");
        JButton btn3 = new JButton("North");
        JButton btn4 = new JButton("South");
        JButton btn5 = new JButton("Center");

        frame.add(btn1, java.awt.BorderLayout.EAST);
        frame.add(btn2, java.awt.BorderLayout.WEST);
        frame.add(btn3, java.awt.BorderLayout.NORTH);
        frame.add(btn4, java.awt.BorderLayout.SOUTH);
        frame.add(btn5, java.awt.BorderLayout.CENTER);

        // frame.setLayout(new java.awt.BorderLayout());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
