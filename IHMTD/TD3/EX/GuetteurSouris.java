package EX;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class GuetteurSouris implements MouseListener {
	public void mousePressed(MouseEvent e) {
		System.out.println("Clic en (" + e.getX()+","+e.getY()+")");
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}