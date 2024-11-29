package EX01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SOLUTION2_interface extends JFrame{
	public SOLUTION2_interface() {
		setTitle("EX1");
		setSize(new Dimension(400, 400));
		addMouseListener(new SOLUTION2_Ecouteur());
		setVisible(true);
	}
	public static void main(String[] args) {
		SOLUTION2_interface obj = new SOLUTION2_interface();
	}
}