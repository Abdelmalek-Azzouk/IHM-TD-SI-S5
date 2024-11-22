package EX1;

import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class EX1 {
public static void main(String[] args) {
		JFrame f = new JFrame("Fenetre en BorderLayout");
		f.setSize(new Dimension(600, 400));
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//--------------panneau
		f.add(new JTree(new DefaultMutableTreeNode("Arbre de navigation")), BorderLayout.WEST);
		f.add(new JMenuBar().add(new JMenu("LE MENU")), BorderLayout.NORTH);
		JPanel panneau = new JPanel();
		panneau.setBorder(BorderFactory.createTitledBorder("Espace principale"));
		panneau.setBackground(Color.white);
		
		f.setVisible(true);
		f.getContentPane().add(panneau);
		
		JLabel BarreVisualisation = new JLabel("Barre visualisation");
		BarreVisualisation.setVerticalAlignment(SwingConstants.TOP);
		BarreVisualisation.setHorizontalAlignment(SwingConstants.CENTER);
		f.add(BarreVisualisation, BorderLayout.EAST);
		
		
	}
}
