package fr.test.java.modele;

import java.util.List;

import javax.swing.JTextField;

public class Voiture extends Vehicule {
	private int annee;
	private String couleur;
	
	public Voiture() {
		
	}
	
	public Voiture(String marque, String modele, int annee, String couleur) {
		super(marque, modele, 4);
		this.annee = annee;
		this.couleur = couleur;
	}
	
	public Voiture(String marque, String modele, String immatriculation, int annee, String couleur) {
		super(marque, modele, 4, immatriculation);
		this.annee = annee;
		this.couleur = couleur;
	}
	
//	public Voiture(List<JTextField> tf_lst) {
//		for(JTextField tf: tf_lst) {
//			
//		}
//	}
	
	public int getAnnee() {return annee;}
	public String getCouleur() {return couleur;}
	public void setAnnee(int annee) { this.annee = annee; }
	public void setCouleur(String couleur) {this.couleur = couleur;}

	@Override
	public String toString() {
		return "Voiture [annee=" + annee + ", couleur=" + couleur + ", marque=" + marque + ", modele=" + modele
				+ ", nombreRoues=" + nombreRoues + ", immatriculation=" + immatriculation + "]";
	}
	
	public String formatString(char c) {
		return immatriculation + c + marque + c + modele + c + nombreRoues + c + couleur + c + annee;
	}
	
	public Object[] toArray() {
		Object[] arr = {marque, modele, nombreRoues, immatriculation, annee, couleur};
		return arr;
	}
	
}
