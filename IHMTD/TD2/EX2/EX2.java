package EX2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8822688714193172618L;
	private JPanel cardPanel, jp1, jp2, buttonPanel;
	private JLabel jl1, jl2;
	private JButton btn1, btn2;
	private CardLayout cardLayout = new CardLayout();

	public EX2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Test med CardLayout");
		setBounds(450, 200, 400, 400);
		
		cardPanel = new JPanel();
		buttonPanel = new JPanel();
		cardPanel.setLayout(cardLayout);
		jp1 = new JPanel();
		jp2 = new JPanel();
		jl1 = new JLabel("Card 1");
		jl2 = new JLabel("Card 2");
		
		jp1.add(jl1);
		jp2.add(jl2);
		cardPanel.add(jp1,"1");
		cardPanel.add(jp2,"2");
		
		btn1 = new JButton("Show Card 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel , "1");
			}
		});
		
		btn2 = new JButton("Show Card 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel , "2");
			}
		});
		
		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		add(cardPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
	EX2 frame = new EX2();
	}	
}