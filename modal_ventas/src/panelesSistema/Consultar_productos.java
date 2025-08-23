package panelesSistema;

import clasesUtiles.TabbedForm;
import clasesUtiles.centrarTabbedForm;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Consultar_productos extends TabbedForm {

	private JLabel lblNewLabel;
	private JButton btnNewButton;
	
	/**
	 * Create the panel.
	 */
	public Consultar_productos() {
		setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(250, 207, 46, 14);
		add(lblNewLabel);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(274, 222, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(306, 188, 89, 23);
		add(btnNewButton_1);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(365, 222, 30, 22);
		add(comboBox);
	}
	
	@Override
	public void formOpen() {
		super.formOpen();
		// Centrar el contenido cuando el formulario se abre
		centrarTabbedForm.centerContent(this);
	}
}
