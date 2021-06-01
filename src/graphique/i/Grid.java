package graphique.i;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

import fr.test.java.exo5.Exercice5Etape2;
import fr.test.java.modele.ListeVehiculeXml;
import fr.test.java.modele.Vehicule;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid extends JFrame {

	public Grid() {
		
		JPanel mainPanel = new JPanel(new GridLayout(1, 2));
		JPanel leftPanel = new JPanel(new GridLayout(9, 1));
		JPanel rightPanel = new JPanel(new GridLayout(3, 1));
		mainPanel.add(leftPanel);
		mainPanel.add(rightPanel);
		
		// left Panel
		JPanel radioLine_p = new JPanel(new GridLayout(1, 2));
		JPanel immat_p = new JPanel(new GridLayout(1, 2));
		JPanel nbRoues_p = new JPanel(new GridLayout(1, 2));
		JPanel couleur_p = new JPanel(new GridLayout(1, 2));
		JPanel marque_p = new JPanel(new GridLayout(1, 2));
		JPanel modele_p = new JPanel(new GridLayout(1, 2));
		JPanel puissance_p = new JPanel(new GridLayout(1, 2));
		JPanel annee_p = new JPanel(new GridLayout(1, 2));
		JPanel buttonLine_p = new JPanel(new GridLayout(1, 2));
		leftPanel.add(radioLine_p);
		leftPanel.add(immat_p);
		leftPanel.add(nbRoues_p);
		leftPanel.add(couleur_p);
		leftPanel.add(marque_p);
		leftPanel.add(modele_p);
		leftPanel.add(puissance_p);
		leftPanel.add(annee_p);
		leftPanel.add(buttonLine_p);
		
		// "child"'s left Panel
		JLabel immat_l = new JLabel("Immatriculation:");
		JTextField immat_tf = new JTextField();
		immat_l.setLabelFor(immat_tf);
		System.out.println(immat_l.getLabelFor());
		immat_p.add(immat_l);
		immat_p.add(immat_tf);
		
		JLabel nbRoues_l = new JLabel("Nombre de roues:");
		JTextField nbRoues_tf = new JTextField();
		nbRoues_l.setLabelFor(nbRoues_tf);
		nbRoues_p.add(nbRoues_l);
		nbRoues_p.add(nbRoues_tf);
		
		JLabel couleur_l = new JLabel("Couleur:");
		JTextField couleur_tf = new JTextField();
		couleur_l.setLabelFor(couleur_tf);
		couleur_p.add(couleur_l);
		couleur_p.add(couleur_tf);
		
		JLabel marque_l = new JLabel("Marque:");
		JTextField marque_tf = new JTextField();
		marque_l.setLabelFor(couleur_tf);
		marque_p.add(marque_l);
		marque_p.add(marque_tf);
		
		JLabel modele_l = new JLabel("Modele:");
		JTextField modele_tf = new JTextField();
		modele_l.setLabelFor(modele_tf);
		modele_p.add(modele_l);
		modele_p.add(modele_tf);
		
		JLabel puissance_l = new JLabel("Puissance:");
		JTextField puissance_tf = new JTextField();
		puissance_l.setLabelFor(puissance_tf);
		puissance_p.add(puissance_l);
		puissance_p.add(puissance_tf);
		
		JLabel annee_l = new JLabel("Annee:");
		JTextField annee_tf = new JTextField();
		annee_l.setLabelFor(annee_tf);
		annee_p.add(annee_l);
		annee_p.add(annee_tf);
		
		JButton ajouter_b = new JButton("Ajouter");
		JButton sauvegarder_b = new JButton("Sauvegarder");
		buttonLine_p.add(ajouter_b);
		buttonLine_p.add(sauvegarder_b);		
		
		ButtonGroup radio_bg = new ButtonGroup();
		JRadioButton voiture_r = new JRadioButton("Voiture");
		voiture_r.setActionCommand("Voiture");
		JRadioButton moto_r = new JRadioButton("Motocyclette");	
		moto_r.setActionCommand("Motocyclette");
		radio_bg.add(voiture_r);
		radio_bg.add(moto_r);
		radioLine_p.add(voiture_r);
		radioLine_p.add(moto_r);

		// right Panel
		JPanel title_p = new JPanel();
		JPanel data_p = new JPanel();
		JPanel delete_p = new JPanel();
		rightPanel.add(title_p);
		rightPanel.add(data_p);
		rightPanel.add(delete_p);
		
		// title Table (right Panel)
		String[] titleName = {
				"Marque", 
				"Modele", 
				"NombreRoues", 
				"Immatriculation", 
				"Couleur", 
				"Annee",
				"Puissance"};
		String[][] data_title = {titleName};
		JTable title_t = new JTable(data_title, titleName);
		title_p.add(title_t);
		
		// delete button (right Panel)
		JButton delete_b = new JButton("Delete");
		delete_p.add(delete_b);
		
		// starting State
		voiture_r.setSelected(true);
		puissance_tf.setEditable(false);
		
		
		// data Table (right Panel)
		
			// create xml if no xml
			// new created xml will be added with one empty Vehicule
		String fileName = "gridXml.xml";
		File file = new File(fileName);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File created: " + file.getName());
				List<Vehicule> vl_temp = new ArrayList<Vehicule>();
				vl_temp.add(new Vehicule("null", "null", 0, "null"));
				vl_temp.add(new Vehicule("null", "null", 0, "null"));
				vl_temp.add(new Vehicule("null", "null", 0, "null"));
				vl_temp.add(new Vehicule("null", "null", 0, "null"));
				vl_temp.add(new Vehicule("null", "null", 0, "null"));
				vl_temp.add(new Vehicule("null", "null", 0, "null"));
				vl_temp.add(new Vehicule("null", "null", 0, "null"));
				vl_temp.add(new Vehicule("null", "null", 0, "null"));
				ListeVehiculeXml vxl_temp = new ListeVehiculeXml(vl_temp);
				Exercice5Etape2.ecrireFichierXml(vxl_temp, file.getName());
			} else {
				System.out.println("File already exist.");
			}
		} catch(IOException e) {
			System.out.println("An error occured.");
		}
		
		ListeVehiculeXml vx_lst = Exercice5Etape2.lireFichierXml(fileName);
		List<Vehicule> v_lst = vx_lst.getVehicules();
		
		FinalModel model = new FinalModel(v_lst);
		JTable data_t = new JTable(model);
		data_p.add(data_t);
		// ** End data Table ** //
		
		List<JLabel> label_list = Arrays.asList(
				immat_l, 
				nbRoues_l, 
				couleur_l, 
				marque_l,
				modele_l,
				puissance_l,
				annee_l
				);
		
		// Listener
		List<JTextField> m_param_lst = Arrays.asList(puissance_tf);
		voiture_r.addItemListener(new ALRadio(m_param_lst, label_list));
		List<JTextField> v_param_lst = Arrays.asList(annee_tf, couleur_tf);
		moto_r.addItemListener(new ALRadio(v_param_lst, label_list));
		
		delete_b.addActionListener(new ALDelete(model, data_t));
		sauvegarder_b.addActionListener(new ALSave(fileName, new ListeVehiculeXml(model.get_v_lst())));
		
		ajouter_b.addActionListener(new ALAdd(radio_bg, label_list, model));
		
		// JFrame properties
		this.setMinimumSize(new Dimension(500, 250));
		this.setTitle("Grid example");
		this.getContentPane().add(mainPanel);
		
	}
	
	public static void main(String args[]) {
		Grid grid = new Grid();
		grid.pack();
		grid.setVisible(true);
	}

}
