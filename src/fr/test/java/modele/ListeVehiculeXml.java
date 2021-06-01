package fr.test.java.modele;

import java.util.List;

public class ListeVehiculeXml {
	
	private List<Vehicule> vehicules;
	
	public ListeVehiculeXml() {}
	
	public ListeVehiculeXml(List<Vehicule> v_lst) {
		vehicules = v_lst;
	}

	public List<Vehicule> getVehicules() { return vehicules; }

	public void setVehicules(List<Vehicule> list) { vehicules = list; }
	
}