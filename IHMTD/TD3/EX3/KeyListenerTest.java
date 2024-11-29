package EX3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class KeyListenerTest implements KeyListener, ActionListener{

JFrame frame;
JTextField tf;
JLabel lbl;
JButton btn;

public KeyListenerTest() {
	frame = new JFrame();
	lbl = new JLabel();
	tf= new JTextField(15);
	tf.addKeyListener(this);

	btn = new JButton("Clear");
	btn.addActionListener(this);

	JPanel panel = new JPanel();
	panel.add(tf);		
	panel.add(btn);

	frame.setLayout(new BorderLayout());
	frame.add(lbl, BorderLayout.NORTH);
	frame.add(panel, BorderLayout.SOUTH);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600, 200);
	frame.setVisible(true);
}


@Override
public void keyTyped(KeyEvent ke) {
	lbl.setText("You have typed: "+ke.getKeyChar());
}

@Override
public void keyPressed(KeyEvent ke) {
	lbl.setText("You have pressed: "+ke.getKeyChar());
}

@Override
public void keyReleased(KeyEvent ke) {
	lbl.setText("You have released: "+ke.getKeyChar());
}

@Override
public void actionPerformed(ActionEvent ae) {
	tf.setText("");
}

public static void main(String args[]) {
	new KeyListenerTest();
}}