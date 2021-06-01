package graphique.i;

import java.util.List;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class ALRadio implements ItemListener {
	
	private List<JTextField> tf_lst;
	private List<JLabel> full_lst;
	
	public ALRadio(List<JTextField> tf_lst, List<JLabel> full_lst) {
		this.tf_lst = tf_lst;
		this.full_lst = full_lst;
	}
	
	public void emptyFields(List<JLabel> full_lst) {
		for(JLabel elem: full_lst) {
			((JTextField)elem.getLabelFor()).setText("");
		}
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		emptyFields(full_lst);

		JRadioButton btn = ((JRadioButton)e.getSource());
		if(btn.isSelected()) {
			for(JTextField elem: tf_lst) {
				elem.setEditable(false);
				elem.setEnabled(false);
			}			
		} else {
			for(JTextField elem: tf_lst) {
				elem.setEditable(true);
				elem.setEnabled(true);
			}
		}

	}

}