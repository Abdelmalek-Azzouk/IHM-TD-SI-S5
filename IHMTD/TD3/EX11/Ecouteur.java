package EX11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ecouteur implements MouseListener{
	public void mousePressed(MouseEvent e) {
		System.out.println("Clic appui en (" + e.getX()+","+e.getY()+")");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("Clic relachée en (" + e.getX()+","+e.getY()+")");
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}