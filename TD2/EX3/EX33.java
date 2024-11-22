package EX3;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class EX33 extends JFrame {
	private JButton L1, L2, L3, L4, L5;
	private JPanel p;
	public EX33(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("test");
		setBounds(700, 250, 500, 1000);
		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		
		L1 = new JButton("Nord");
		L2 = new JButton("Ouest");
		L3 = new JButton("Sud");
		L4 = new JButton("Centre");
		L5 = new JButton("Est");
		
		p.add(L1);
		p.add(L2);
		p.add(L3);
		p.add(L4);
		p.add(L5);
		
		add(p);
        pack();
        setVisible(true);		
	}
	public static void main(String args[]) {
		EX33 frame = new EX33();
	}
	
}
