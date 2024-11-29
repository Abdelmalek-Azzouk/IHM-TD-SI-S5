package EX4;

import javax.swing.*;
import java.awt.*;

public class EX4 {
	public static void main(String args[]) {
        JFrame f = new JFrame("Identification");
        f.setSize(new Dimension(200, 400));
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        JLabel l1, l2;
        l1 = new JLabel("Login: ");
        l2 = new JLabel("Password: ");
        JTextField t = new JTextField(20);
        JPasswordField pw = new JPasswordField(20);
        JButton b = new JButton("Entrer");
        p.add(l1);
        p.add(t);
        p.add(l2);
        p.add(pw);
        p.add(b);
        f.getContentPane().add(p);
        f.pack();
        f.setVisible(true);
	}
	
}
