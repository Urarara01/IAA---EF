package panelesSistema;

import javax.swing.JPanel;

import clasesUtiles.TabbedForm;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listar extends TabbedForm {

	/**
	 * Create the panel.
	 */
	public Listar() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CListar");
		lblNewLabel.setBounds(158, 127, 46, 14);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(189, 182, 89, 23);
		add(btnNewButton);

	}

}
