package EX4;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class EX44 extends JFrame {
	private JButton L1, L2, L3, L4, L5, L6, L7, L8, L9;
	private JPanel p;
	public EX44(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("testtesttesttest");
		setBounds(700, 250, 500, 1000);
		p = new JPanel();
		p.setLayout(new GridLayout(3, 3, 20, 25));
		
		L1 = new JButton("1");
		L2 = new JButton("2");
		L3 = new JButton("3");
		L4 = new JButton("4");
		L5 = new JButton("5");
		L6 = new JButton("6");
		L7 = new JButton("7");
		L8 = new JButton("8");
		L9 = new JButton("9");
		
		p.add(L1);
		p.add(L2);
		p.add(L3);
		p.add(L4);
		p.add(L5);
		p.add(L6);
		p.add(L7); 		
		p.add(L8);
		p.add(L9);
		
		add(p);
        pack();
        setVisible(true);		
	}
	public static void main(String args[]) {
		EX44 frame = new EX44();
	}
	
}
