package panelesSistema;

import javax.swing.JPanel;

import clasesUtiles.TabbedForm;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Listar extends TabbedForm {

	/**
	 * Create the panel.
	 */
	public Listar() {
		setLayout(new GridBagLayout());
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("CListar");
		lblNewLabel.setBounds(158, 127, 46, 14);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		btnNewButton.setBounds(189, 182, 89, 23);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		add(btnNewButton, gbc_btnNewButton);

	}

}
