package panelesSistema;

import javax.swing.JPanel;

import clasesUtiles.TabbedForm;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Consultar_productos extends TabbedForm {

	/**
	 * Create the panel.
	 */
	public Consultar_productos() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(281, 167, 46, 14);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(274, 222, 89, 23);
		add(btnNewButton);

	}
}
