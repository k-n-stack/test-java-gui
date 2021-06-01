package fr.test.java.modele;

public class Vehicule {
	protected String marque;
	protected String modele;
	protected int nombreRoues;
	protected String immatriculation;
	
	public Vehicule() {
		
	}
	
	public Vehicule(Vehicule v) {
		this.marque = v.marque;
		this.modele = v.modele;
		this.nombreRoues = v.nombreRoues;
		this.immatriculation = v.immatriculation;
	}
	
	public Vehicule(String marque, String modele, int nombreRoues) {
		this.marque = marque;
		this.modele = modele;
		this.nombreRoues = nombreRoues;
	}
	
	public Vehicule(String marque, String modele, int nombreRoues, String immatriculation) {
		this.marque = marque;
		this.modele = modele;
		this.nombreRoues = nombreRoues;
		this.immatriculation = immatriculation;
	}
	
	public String getMarque() {return this.marque;}
	public String getModele() {return this.modele;}
	public int getNombreRoues() {return this.nombreRoues;}
	public String getImmatriculation() {return this.immatriculation;}
	
	public void setMarque(String marque) {this.marque = marque;}
	public void setModele(String modele) {this.modele = modele;}
	public void setNombreRoues(int nombreRoues) {this.nombreRoues = nombreRoues;}
	public void setImmatriculation(String immatriculation) {this.immatriculation = immatriculation;}
	
	
	@Override
	public String toString() {
		return "Vehicule [marque=" + marque + ", modele=" + modele + ", nombreRoues=" + nombreRoues
				+ ", immatriculation=" + immatriculation + "]";
	}
	
	public String formatString(char c) {
		return immatriculation + c + marque + c + modele + c + nombreRoues;
	}

	public Object[] toArray() {
		Object[] arr = {marque, modele, nombreRoues, immatriculation};
		return arr;
	}
}
