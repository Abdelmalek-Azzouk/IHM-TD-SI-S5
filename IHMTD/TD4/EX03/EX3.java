package EX03;

import javax.swing.*;

import EX3.EXo3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EX3 extends JFrame implements ActionListener{
	private JTextArea text;
	private JMenuBar mb;
	private JMenu file, edit, help;
	private JMenuItem cut, copy, paste, select;
	
	public EX3() {
		
		setTitle("Editor");
		setSize(new Dimension(500,500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		text = new JTextArea();
		mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		select = new JMenuItem("Select All");
		
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(select);
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		add(text);
		
		setJMenuBar(mb);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		select.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==cut) text.cut();
		if(ev.getSource()==copy) text.copy();
		if(ev.getSource()==paste) text.paste();
		if(ev.getSource()==select) text.selectAll();
	}

	public static void main(String args[]) {
		EX3 obj = new EX3();
		obj.setVisible(true);

	}
}	
	
