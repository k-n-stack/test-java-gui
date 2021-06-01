package graphique.i;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.test.java.exo5.Exercice5Etape2;
import fr.test.java.modele.ListeVehiculeXml;

public class ALSave implements ActionListener {
	
	private String fileName;
	private ListeVehiculeXml vx_lst;
	
	public ALSave(String fileName, ListeVehiculeXml vx_lst) {
		this.fileName = fileName;
		this.vx_lst = vx_lst;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Saving model's data in " + fileName);
		Exercice5Etape2.ecrireFichierXml(vx_lst, fileName);
	}

}
