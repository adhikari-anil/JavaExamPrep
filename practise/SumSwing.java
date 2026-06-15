
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SumSwing extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton btn;

    public SumSwing() {
        l1 = new JLabel("First number: ");
        l1.setBounds(50, 50, 100, 20);
        t1 = new JTextField();
        t1.setBounds(150, 50, 100, 20);

        l2 = new JLabel("Second Number: ");
        l2.setBounds(50, 90, 100, 20);
        t2 = new JTextField();
        t2.setBounds(160, 90, 100, 20);

        l3 = new JLabel("Result: ");
        l3.setBounds(50, 130, 100, 20);
        t3 = new JTextField();
        t3.setBounds(160, 130, 100, 20);

        btn = new JButton("Sum");
        btn.setBounds(100, 170, 80, 30);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(btn);

        btn.addActionListener(this);

        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int sum = a + b;
        t3.setText(String.valueOf(sum));
        t1.setText("");
        t2.setText("");
    }

    public static void main(String[] args) {
        new SumSwing();
    }
}
