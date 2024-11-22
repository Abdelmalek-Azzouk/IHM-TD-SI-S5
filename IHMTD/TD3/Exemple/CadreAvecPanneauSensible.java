package Exemple;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class CadreAvecPanneauSensible {
	public static void main(String[] args) {
		JFrame fen = new JFrame();
		JPanel p = new JPanel();
		p.setBackground(Color.WHITE);
		
		GuetteurSouris felix = new GuetteurSouris();
		p.addMouseListener(felix);
		fen.getContentPane().add(p);
		fen.setSize(250, 150);
		fen.setVisible(true);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
