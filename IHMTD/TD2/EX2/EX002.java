package EX2;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class EX002 extends JFrame implements ActionListener{
	private JLabel l1, l2, l3, l4;
	private JTextField t1, t2, t3, t4;
	private JButton R, C;
	private JPanel p, p1, p2, p3, p4, p5;
	
	public EX002() throws IOException{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("EX2");
		setSize(500,500);
		File bdd = new File ("./bdd.txt");
		R = new JButton("Register"); C = new JButton("Clear");
		
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}		
		});
		R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedWriter bf = null;
				try {
					bf = new BufferedWriter(new FileWriter(bdd,true));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					bf.write(t1.getText()+ "/t"+t2.getText()+ "/t"+t3.getText()+ "/t"+t4.getText()+"\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					bf.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					bf.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}		
		});
		
		
		R.addActionListener(this);
		
		
		
		l1 = new JLabel("First Name"); l2 = new JLabel("Last Name"); l3 = new JLabel("Email ID"); l4 = new JLabel("Phone NO.");
		
		t1 = new JTextField(); t2 = new JTextField(); t3 = new JTextField(); t4 = new JTextField();
		
		
		
		p1 = new JPanel(); p2 = new JPanel(); p3 = new JPanel(); p4 = new JPanel(); p5 = new JPanel(); p = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS)); p1.add(l1); p1.add(t1);
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS)); p2.add(l2); p2.add(t2);
		p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS)); p3.add(l3); p3.add(t3);
		p4.setLayout(new BoxLayout(p4, BoxLayout.X_AXIS)); p4.add(l4); p4.add(t4);
		p5.setLayout(new BoxLayout(p5, BoxLayout.X_AXIS)); p5.add(R); p5.add(C);
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS)); p.add(p1); p.add(p2); p.add(p3); p.add(p4); p.add(p5);
		
		add(p);
        pack();
        setVisible(true);
	}
	
	

	
		
	

	public static void main(String args[]) throws IOException {
		EX002 frame = new EX002	();
		
	}







	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}