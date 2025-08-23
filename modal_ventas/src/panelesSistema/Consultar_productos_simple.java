package panelesSistema;

import clasesUtiles.TabbedForm;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Consultar_productos_simple extends TabbedForm {

	private JLabel lblNewLabel;
	private JButton btnNewButton;
	
	/**
	 * Create the panel.
	 */
	public Consultar_productos_simple() {
		setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		btnNewButton = new JButton("New button");
		add(btnNewButton);
	}
	
	@Override
	public void formOpen() {
		super.formOpen();
		// Centrar el contenido cuando el formulario se abre
		centerComponents();
	}
	
	/**
	 * Centra los componentes manualmente
	 */
	private void centerComponents() {
		// Obtener el tamaño del panel
		int panelWidth = getWidth();
		int panelHeight = getHeight();
		
		// Si el panel aún no tiene dimensiones, usar las del padre
		if (panelWidth == 0 || panelHeight == 0 && getParent() != null) {
			panelWidth = getParent().getWidth();
			panelHeight = getParent().getHeight();
		}
		
		// Centrar el label
		int labelWidth = lblNewLabel.getPreferredSize().width;
		int labelHeight = lblNewLabel.getPreferredSize().height;
		lblNewLabel.setBounds(
			(panelWidth - labelWidth) / 2, 
			(panelHeight - labelHeight) / 2 - 30, 
			labelWidth, 
			labelHeight
		);
		
		// Centrar el botón debajo del label
		int buttonWidth = btnNewButton.getPreferredSize().width;
		int buttonHeight = btnNewButton.getPreferredSize().height;
		btnNewButton.setBounds(
			(panelWidth - buttonWidth) / 2, 
			lblNewLabel.getY() + lblNewLabel.getHeight() + 20, 
			buttonWidth, 
			buttonHeight
		);
	}
}
