package EX11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EX11 extends JFrame implements MouseListener{
	public void mousePressed(MouseEvent e) {
		System.out.println("Clic appui en (" + e.getX()+","+e.getY()+")");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("Clic relachée en (" + e.getX()+","+e.getY()+")");
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
		
	public EX11() {
		setTitle("EX11");
		setSize(new Dimension(400, 400));
		addMouseListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		EX11 obj = new EX11();
	}
}