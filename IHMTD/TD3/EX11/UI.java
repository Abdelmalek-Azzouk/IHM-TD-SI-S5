package EX11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UI extends JFrame{
	public UI() {
		setTitle("EX1");
		setSize(new Dimension(400, 400));
		addMouseListener(new Ecouteur());
		setVisible(true);
	}
	public static void main(String[] args) {
		UI obj = new UI();
	}
}