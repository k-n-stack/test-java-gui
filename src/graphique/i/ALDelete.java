package graphique.i;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

public class ALDelete implements ActionListener {
	
	private FinalModel model;
	private JTable table;
	
	public ALDelete(FinalModel model, JTable table) {
		this.model = model;
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(this.table.getSelectedRow() != -1) {
			System.out.println("1 row deleted from model.");
			this.model.removeRow(table.getSelectedRow());
			model.fireTableDataChanged();
		}
	}

}
