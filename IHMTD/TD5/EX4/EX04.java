package EX4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EX04 extends JFrame implements ActionListener, ItemListener{
	JComboBox<String> cb;
	JLabel l, l1;
	JButton b, b1;
	JTextField tf;
	
	public EX04() {
		setTitle("Liste De???");
		String s[] = {"Alger", "Chlef", "Legouat", "Oumelbouaghi"};
		tf = new JTextField();
		b = new JButton("Ajouter");
		b1 = new JButton("Supprimer");
		l = new JLabel("Selectionner");
		l1 = new JLabel("Adrar selectionner");
		cb = new JComboBox(s);
		JPanel p = new JPanel();
		b.addActionListener(this);
		b1.addActionListener(this);
		cb.addItemListener(this);
		p.add(l); p.add(cb); p.add(l1); p.add(tf); p.add(b); p.add(b1);
		add(p);
		setVisible(true);
	}

	
	public static void main(String args[]) {
		new EX04();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Ajouter")) {
			cb.addItem(tf.getText());
		}else {
			cb.removeItem(tf.getText());
		}
	}
	
	public void ItemStateChanged(ItemEvent ev){
		if(ev.getSource() == cb) {
			l1.setText(cb.getSelectedItem() + " Selectionner");
		}
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	
	
	
	
	
