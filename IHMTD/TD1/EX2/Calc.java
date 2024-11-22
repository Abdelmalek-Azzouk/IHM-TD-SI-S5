package EX2;

import java.awt.FlowLayout;

import javax.swing.*;

public class Calc {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Calc");
		f.setSize(150, 100);
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		JTextField t = new JTextField(10);
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		p.add(t);
		p.add(b1);
		p.add(b2);
		f.getContentPane().add(p);
		f.setVisible(true);
	} 
	
}

