// similar to GridLayout but we have the power to manupulate elements in rows and columns..

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class GridbagLayout {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new Button("btn1"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new Button("btn2"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new Button("btn3"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(new Button("btn4"), gbc);

        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}
