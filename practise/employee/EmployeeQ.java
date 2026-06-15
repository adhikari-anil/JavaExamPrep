
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeeQ extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton btn1, btn2;

    public EmployeeQ() {

        l1 = new JLabel("EmployeeId: ");
        l2 = new JLabel("EmployeeName: ");
        l3 = new JLabel("EmploeeSalary: ");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        btn1 = new JButton("Add");
        btn2 = new JButton("Cancel");

        l1.setBounds(50, 50, 100, 20);
        t1.setBounds(150, 50, 100, 20);
        l2.setBounds(50, 80, 100, 20);
        t2.setBounds(150, 80, 100, 20);
        l3.setBounds(50, 110, 100, 20);
        t3.setBounds(150, 110, 100, 20);

        btn1.setBounds(50, 150, 100, 30);
        btn2.setBounds(150, 150, 100, 30);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(btn1);
        add(btn2);

        setLayout(null);
        setSize(400, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        btn1.setBackground(Color.BLACK);
        btn2.setBackground(Color.BLUE);
        btn1.setForeground(Color.WHITE);
    }

    public static void main(String[] args) {
        new EmployeeQ();
    }
}
