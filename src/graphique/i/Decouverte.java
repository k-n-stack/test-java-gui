package graphique.i;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Decouverte extends JFrame {
	
	public Decouverte() {
		
		JButton button = new JButton("Un boutton");
		button.setToolTipText("button help");
		button.setForeground(Color.green);
		button.setBackground(Color.pink);
		
		JTextField tf = new JTextField("text field");
		tf.setEditable(false);
		
		JTextArea ta = new JTextArea("text Area");
		ta.setEditable(false);
		
		JPanel mainPanel = new JPanel(new FlowLayout());
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
		mainPanel.add(button);
		mainPanel.add(tf);
		mainPanel.add(ta);
		
		this.setTitle("Decouverte");
		this.setMinimumSize(new Dimension(1000, 500));
		
		this.getContentPane().add(mainPanel);
		
	}
	
	
	public static void main(String args[]) {
		Decouverte decouverte = new Decouverte();
		decouverte.pack();
		decouverte.setVisible(true);
	}
}
