package panelesSistema;

import clasesUtiles.TabbedForm;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Consultar_productos_responsive extends TabbedForm {

	private JLabel lblNewLabel;
	private JButton btnNewButton;
	
	/**
	 * Create the panel.
	 */
	public Consultar_productos_responsive() {
		setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		// Listener para redimensionamiento
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				centerComponents();
			}
		});
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
		
		// Solo proceder si el panel tiene dimensiones válidas
		if (panelWidth > 0 && panelHeight > 0) {
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
}
