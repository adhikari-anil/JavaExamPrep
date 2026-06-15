// yesma hami le elements haru same size ko hunxa ra teslai lai 2D grid ma rakhna milxah i.e 
// GridLayout(rows,column,hgap,vgap);


import javax.swing.*;

public class GridLayout {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JButton label1 = new JButton("AI1!!!");
        JButton label2 = new JButton("AI2!!!");
        JButton label3 = new JButton("AI3!!!");
        JButton label4 = new JButton("AI4!!!");
        JButton label5 = new JButton("AI5!!!");

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);

        frame.setLayout(new java.awt.GridLayout(2, 3,10,10));
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}
