package EX1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EX01 implements ActionListener{
	public static void main(String args[]) {
		JFrame f = new JFrame();
		f.setTitle("ex1");
		f.setSize(200,200);
		JButton b = new JButton("Afficher JDialog !");
		JButton a = new JButton("Warning !");
		JButton c = new JButton("ERROR!");
		JButton d = new JButton("Confirm!");
		JButton g = new JButton("Boite entre avec liste");
		JButton h = new JButton("Boite entre avec champs de texte");
		JLabel label = new JLabel("xdddddd");
		JPanel p = new JPanel();
		
		 p.add(b);
		 p.add(a);
		 p.add(c);
		 p.add(d);
		 p.add(label);
		 p.add(g);
		 p.add(h);
		 f.add(p);
	    
	     f.setVisible(true);
	        
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Welcome to Swing!");
			}	
		});
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Please Ensure Compliance!", "Swing Tester", JOptionPane.WARNING_MESSAGE);
			}	
		});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Please Ensure Compliance!", "Swing Tester", JOptionPane.ERROR_MESSAGE);
			}	
		});
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(f,"Sure? You want to exit? xdd", "Swing Tester", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION) {
					label.setText("You selected: Yes");
				}else if(result == JOptionPane.NO_OPTION) {
					label.setText("You selected: No");
				}else {
					label.setText("None selected");
				}
			}	
		});
		g.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] options = {"Red", "Green", "Blue"};
				String result = (String)JOptionPane.showInputDialog(f, "Choose a Color", "Swing Tester", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
				if(result == "Red" || result == "Green" || result == "Blue") {
					label.setText("You selected: " + result);
				}else {
					label.setText("None selected");
				}
			}	
		});
		h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = (String)JOptionPane.showInputDialog(f, "Input a Color", "Swing Tester", JOptionPane.PLAIN_MESSAGE, null, null, "RED");
				if(result != null && result.length() > 0) {
					label.setText("You inserted: " + result);
				}else {
					label.setText("None inserted");
				}
			}	
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}	