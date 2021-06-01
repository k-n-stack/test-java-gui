package graphique.i;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import fr.test.java.modele.Motocyclette;
import fr.test.java.modele.Vehicule;
import fr.test.java.modele.Voiture;

public class ALAdd implements ActionListener {
	
	private FinalModel model;
	private List<JLabel> label_lst;
	private ButtonGroup bg;
	
	public ALAdd(ButtonGroup bg, List<JLabel> label_lst, FinalModel model) {
		this.bg = bg;
		this.label_lst = label_lst;
		this.model = model;
	}
	
	public boolean hasEmptyFields(List<JLabel> label_lst) {
		for(JLabel label: label_lst) {			
			if(((JTextComponent)label.getLabelFor()).isEditable()) {
				if(((JTextComponent)label.getLabelFor()).getText().trim().isEmpty()) {
					System.out.println("There is at least one empty fields.");
					return true;
				}
			}
		}
		System.out.println("There are no empty fields.");
		return false;
	}
	
	public boolean isNumeric(List<JLabel> label_lst) {
		
		boolean isNum = true;
		
		for(JLabel label: label_lst) {
			if(((JTextComponent)label.getLabelFor()).isEditable()) {
				if(label.getText().trim().equals("Annee:")) {
					isNum = ((JTextComponent)label.getLabelFor()).getText().matches("[0-9]+");
				}
				if(label.getText().trim().equals("Puissance:")) {
					isNum = ((JTextComponent)label.getLabelFor()).getText().matches("[0-9]+");
				}
			}
		}
//		isNum = false;
		return isNum;
	}
	
	public Voiture buildVoiture(List<JLabel> label_lst) {
		
		String marque = "";
		String modele = "";
		String immat = "";
		int annee = 0;
		String couleur = "";
		
		for(JLabel label: label_lst) {
			switch(label.getText().trim()) {
			case "Immatriculation:":
				immat = ((JTextComponent)label.getLabelFor()).getText();
				break;
			case "Couleur:":
				couleur = ((JTextComponent)label.getLabelFor()).getText();
				break;
			case "Marque:":
				marque = ((JTextComponent)label.getLabelFor()).getText();
				break;
			case "Modele:":
				modele = ((JTextComponent)label.getLabelFor()).getText();
				break;
			case "Annee:":
				String str = ((JTextComponent)label.getLabelFor()).getText();
				annee = Integer.valueOf(str);
			}
		}
		
		Voiture v = new Voiture(marque, modele, immat, annee, couleur);
		return v;
	}
	
	public Motocyclette buildMotocyclette(List<JLabel> label_lst) {
		
		String marque = "";
		String modele = "";
		String immat = "";
		int puissance = 0;
		
		for(JLabel label: label_lst) {
			switch(label.getText().trim()) {
			case "Immatriculation:":
				immat = ((JTextComponent)label.getLabelFor()).getText();
				break;
			case "Marque:":
				marque = ((JTextComponent)label.getLabelFor()).getText();
				break;
			case "Modele:":
				modele = ((JTextComponent)label.getLabelFor()).getText();
				break;
			case "Puissance:":
				String str = ((JTextComponent)label.getLabelFor()).getText();
				puissance = Integer.valueOf(str);
			}
		}
		
		Motocyclette m = new Motocyclette(marque, modele, immat, puissance);
		return m;
	}
	
	public void actionPerformed(ActionEvent e) {
			System.out.println(bg.getElements());
			System.out.println(bg.getSelection().getActionCommand());
			System.out.println("######");
			
			if(!hasEmptyFields(label_lst)) {
				if(isNumeric(label_lst)) {
					if(bg.getSelection().getActionCommand().equals("Voiture")) {
						model.addRow(buildVoiture(label_lst));
						model.fireTableDataChanged();
					}
					if(bg.getSelection().getActionCommand().equals("Motocyclette")) {
						model.addRow(buildMotocyclette(label_lst));
						model.fireTableDataChanged();
					}
				} else {
					System.out.println("Error: Set \"Annee\" or \"Puissance\" to a numberic value.");
				}
			} else {
				System.out.println("Error: Fill all field.");
			}
	}

}
