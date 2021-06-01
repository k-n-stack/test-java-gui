package graphique.i;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class ALButton implements ActionListener {
	
	private String param;
	
	public ALButton(String param) {
		this.param = param;
	}
	
	public void actionPerformed(ActionEvent e) {
		((JButton) e.getSource()).setText(param);
		((Frame)SwingUtilities.getRoot((JButton)e.getSource())).setTitle(param);
	}

}
