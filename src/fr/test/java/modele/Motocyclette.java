package fr.test.java.modele;

public class Motocyclette extends Vehicule {
	private int puissance;
	
	public Motocyclette() {}
	
	public Motocyclette(String marque, String modele, int puissance) {
		super(marque, modele, 2);
		this.puissance = puissance;
	}
	
	public Motocyclette(String marque, String modele, String immatriculation, int puissance) {
		super(marque, modele, 2, immatriculation);
		this.puissance = puissance;
	}
	
	public int getPuissance() { return puissance; }
	public void setPuissance(int puissance) { this.puissance = puissance; }

	@Override
	public String toString() {
		return "Motocyclette [puissance=" + puissance + ", marque=" + marque + ", modele=" + modele + ", nombreRoues="
				+ nombreRoues + ", immatriculation=" + immatriculation + "]";
	}
	
	public String formatString(char c) {
		return immatriculation + c + marque + c + modele + c + nombreRoues + c + puissance;
	}
	
	public Object[] toArray() {
		Object[] arr = {marque, modele, nombreRoues, immatriculation, puissance};
		return arr;
	}
	
}
