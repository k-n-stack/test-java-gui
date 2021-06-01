package graphique.i;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import fr.test.java.modele.Motocyclette;
import fr.test.java.modele.Vehicule;
import fr.test.java.modele.Voiture;

public class FinalModel extends AbstractTableModel {
	
	private List<Vehicule> v_lst;
	private String[] columnNames = {
			"Marque", 
			"Modele", 
			"NombreRoues", 
			"Immatriculation", 
			"Couleur", 
			"Puissance", 
			"Annee"
	};
	
	public FinalModel(List<Vehicule> v_lst) {
		this.v_lst = v_lst;
	}
	
	public int getRowCount() {
		return v_lst.size();
	}
	
	public int getColumnCount() {
		return columnNames.length;
	}
	
	public List<Vehicule> get_v_lst() {return v_lst;}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0:
			return v_lst.get(rowIndex).getMarque();
		case 1:
			return v_lst.get(rowIndex).getModele();
		case 2:
			return v_lst.get(rowIndex).getNombreRoues();
		case 3:
			return v_lst.get(rowIndex).getImmatriculation();
		case 4:
			if(v_lst.get(rowIndex) instanceof Voiture) {
				return ((Voiture)v_lst.get(rowIndex)).getCouleur();
			}
			return null;
		case 5:
			if(v_lst.get(rowIndex) instanceof Voiture) {
				return ((Voiture)v_lst.get(rowIndex)).getAnnee();
			}
			return null;
		case 6:
			if(v_lst.get(rowIndex) instanceof Motocyclette) {
				return ((Motocyclette)v_lst.get(rowIndex)).getPuissance();
			}
		default:
			return null;
		}
	}
	
	public void removeRow(int row) {
		if(v_lst.size() > 1) {
			v_lst.remove(row);
		}
	}
	
	public void addRow(Vehicule v) {
		v_lst.add(v);
	}

}
