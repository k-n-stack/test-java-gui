package graphique.i;

import java.awt.*;
import javax.swing.*;

public class Listener extends JFrame {
	
	public Listener() {
		
		JButton button = new JButton("click me.");
		button.addActionListener(new AL());
		
		JPanel mainPanel = new JPanel(new FlowLayout());
		
		mainPanel.add(button);
		
		for(int i = 1; i <= 3; ++i) {
			mainPanel.add(new JButton(Integer.toString(i)));
		}
		
		for(Component component: mainPanel.getComponents()) {
			if(component instanceof JButton) {
				switch(((JButton)component).getText()) {
				case "1":
					((JButton)component).addActionListener(new ALButton("Un"));
					break;
				case "2":
					((JButton)component).addActionListener(new ALButton("Deux"));
					break;
				case "3":
					((JButton)component).addActionListener(new ALButton("Trois"));
					break;
				default:
					System.out.println("switch case default");
				}
			}
		}
		
		this.setTitle("event listener.");
		this.setMinimumSize(new Dimension(1000, 500));
		this.getContentPane().add(mainPanel);
		
	}
	
	public static void main(String args[]) {
		Listener listener = new Listener();
		listener.pack();
		listener.setVisible(true);
		
	}

}
