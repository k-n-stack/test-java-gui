package exemple;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Exemple extends JFrame {
	
	public Exemple() {
		
		JButton ecrireBouton = new JButton("ecrire");
		JButton finBouton = new JButton("terminer");
		JTextArea zoneTextuelle = new JTextArea();
		
		zoneTextuelle.setText("Ceci est un example IHM Java");
		
		finBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JPanel commandBar = new JPanel(new FlowLayout());
		commandBar.add(ecrireBouton);
		commandBar.add(finBouton);
		
		this.getContentPane().setLayout(new BorderLayout());
		this.setTitle("Example IHM");
		this.getContentPane().add(commandBar, BorderLayout.SOUTH);
		this.getContentPane().add(zoneTextuelle, BorderLayout.CENTER);
	}
	
	public static void main(String args[]) {
		Exemple fenetre = new Exemple();
		fenetre.pack();
		fenetre.setVisible(true);
	}
}
