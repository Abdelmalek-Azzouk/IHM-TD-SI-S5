package EX3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EX3 {
    
    public static void main(String args[]) {
        JFrame f = new JFrame("Carres");
        f.setSize(new Dimension(200, 400));
        
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        
        JLabel l1, l2;		
        
        l1 = new JLabel("Nombre:");
        
        JTextField t = new JTextField(20);
        JButton b = new JButton("Calculer");
        l2 = new JLabel("Carre: ");
        
        p.add(l1);
        p.add(t);
        p.add(b);
        p.add(l2);
        
        f.getContentPane().add(p);
        f.pack();
        f.setVisible(true);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = t.getText();
                int x = Integer.parseInt(input);
                l2.setText("Carre: " + (x * x));
            }
        });
    }
}