package fr.test.java.exo5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.IOException;

import fr.test.java.modele.Motocyclette;
import fr.test.java.modele.Vehicule;
import fr.test.java.modele.Voiture;
import fr.test.java.modele.ListeVehiculeXml;


public class Exercice5Etape2 {

	public static List<Vehicule> initialiserCollection() {
		List<Vehicule> v_lst = new ArrayList<Vehicule>();
		v_lst.add(new Voiture("Renault", "Express", "EE-285-TW", 1992, "blanche"));
		v_lst.add(new Voiture("Renault", "R5", "HS-699-TW", 1988, "verte"));
		v_lst.add(new Motocyclette("Honda", "PtiteMoto", "EG-234-UI", 150));
		v_lst.add(new Motocyclette("Suzuki", "GrandMoto", "OI-556-TR", 300));
		
		return v_lst;
	}
	
	public static void afficherVehicule(Collection<Vehicule> v_lst) {
		Iterator<Vehicule> itr = v_lst.iterator();
		while(itr.hasNext()) {
			Vehicule elem = itr.next();
			System.out.println(elem.toString());
		}
	}
	
	public static void ecrireFichierXml(ListeVehiculeXml vx_lst, String filename) {
		try {
			XMLEncoder e = new XMLEncoder(
					new BufferedOutputStream(
							new FileOutputStream(filename)));
			e.writeObject(vx_lst);
			e.close();
			
		} catch(IOException e) {}
	}
	
	public static ListeVehiculeXml lireFichierXml(String filename) {
		try {
			XMLDecoder d = new XMLDecoder(
					new BufferedInputStream(
							new FileInputStream(filename)));
			ListeVehiculeXml result = (ListeVehiculeXml)d.readObject();
//			System.out.println(result);
//			System.out.println(d);
			d.close();
			return result;
			
		} catch(IOException e) {
			return null;
		}
	}
	
	public static void main(String arg[]) {
		List<Vehicule> v_lst = initialiserCollection();
		afficherVehicule(v_lst);
		System.out.println("***********");
		ListeVehiculeXml vx_lst = new ListeVehiculeXml(v_lst);
		ecrireFichierXml(vx_lst, "testoo.xml");
		afficherVehicule(lireFichierXml("testoo.xml").getVehicules());
	}
	
}
