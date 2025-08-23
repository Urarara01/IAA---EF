package cibertec;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import clasesUtiles.TabbedForm;
import raven.alerts.MessageAlerts;
import raven.popup.component.PopupCallbackAction;
import raven.popup.component.PopupController;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;

public class test_consultar_producto extends TabbedForm {
	private JTextField tFCategoria;

	/**
	 * Create the panel.
	 */
	public test_consultar_producto() {
		setLayout(new GridBagLayout());
		
		JLabel lblNewLabel = new JLabel("Consultar por ID");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(377, 265, 201, 14);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Categoría:");
		lblNewLabel_1.setBounds(377, 332, 64, 14);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tFCategoria = new JTextField();
		tFCategoria.setBounds(444, 332, 107, 20);
		GridBagConstraints gbc_tFCategoria = new GridBagConstraints();
		gbc_tFCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFCategoria.gridwidth = 2;
		gbc_tFCategoria.insets = new Insets(0, 0, 5, 0);
		gbc_tFCategoria.gridx = 3;
		gbc_tFCategoria.gridy = 2;
		add(tFCategoria, gbc_tFCategoria);
		tFCategoria.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Código:");
		lblNewLabel_1_1.setBounds(377, 303, 64, 14);
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.gridwidth = 2;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 1;
		gbc_lblNewLabel_1_1.gridy = 3;
		add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"12386", "64863", "31356", "41564"}));
		comboBox.setBounds(444, 299, 107, 22);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 3;
		add(comboBox, gbc_comboBox);
		
		JButton btnAlert = new JButton("Alerta");
		btnAlert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageAlerts.getInstance().showMessage("Hecho", "Datos guardados correctamente", 
				MessageAlerts.MessageType.SUCCESS,
				MessageAlerts.OK_CANCEL_OPTION,
				new PopupCallbackAction() {
					
					@Override
					public void action(PopupController arg0, int arg1) {
						if (arg1 == MessageAlerts.OK_OPTION) {
							System.out.println("Ok Clicked");
						}
						
					}
				});
			}
		});
		btnAlert.setBounds(422, 178, 89, 23);
		GridBagConstraints gbc_btnAlert = new GridBagConstraints();
		gbc_btnAlert.gridwidth = 2;
		gbc_btnAlert.insets = new Insets(0, 0, 0, 5);
		gbc_btnAlert.gridx = 2;
		gbc_btnAlert.gridy = 4;
		add(btnAlert, gbc_btnAlert);

	}
	@Override
	public boolean formClose() {
		if(tFCategoria.getText().trim().equals("")){
			return true;}
		int opt = JOptionPane.showConfirmDialog(this, "Hay texto en el área de texto. ¿Seguro que quieres cerrar?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
		System.out.println("Opción seleccionada: " + opt);
		return opt == JOptionPane.YES_OPTION;
	}

	@Override
	public void formOpen() {
		System.out.println("Formulario "+ this.getClass().getName()+" abierto");
	}
}
