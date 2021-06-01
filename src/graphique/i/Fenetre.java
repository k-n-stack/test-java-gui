package graphique.i;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Fenetre extends JFrame {
	
	public Fenetre() {
		
		JLabel label = new JLabel("Un label");
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JButton button = new JButton("Un boutton");
		label.setHorizontalAlignment(JButton.CENTER);
		
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(label);
		
		JPanel mainPanel = new JPanel(new FlowLayout());
		mainPanel.add(button);
		
		this.setTitle("Un Titre");
		this.setMinimumSize(new Dimension(1000, 500));
//		this.getContentPane().add(label, BorderLayout.NORTH);
//		this.getContentPane().add(button, BorderLayout.NORTH);
		this.getContentPane().add(panel, BorderLayout.NORTH);
		this.getContentPane().add(mainPanel, BorderLayout.SOUTH);
		
	}
	
	public static void main(String args[]) {
		Fenetre fenetre = new Fenetre();
		fenetre.pack();
		fenetre.setVisible(true);
	}
	
}
