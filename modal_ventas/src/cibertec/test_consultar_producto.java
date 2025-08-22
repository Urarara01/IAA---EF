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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test_consultar_producto extends TabbedForm {
	private JTextField tFCategoria;

	/**
	 * Create the panel.
	 */
	public test_consultar_producto() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(444, 299, 107, 22);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Consultar por ID");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(377, 265, 201, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Categoría:");
		lblNewLabel_1.setBounds(377, 332, 64, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Código:");
		lblNewLabel_1_1.setBounds(377, 303, 64, 14);
		add(lblNewLabel_1_1);
		
		tFCategoria = new JTextField();
		tFCategoria.setBounds(444, 332, 107, 20);
		add(tFCategoria);
		tFCategoria.setColumns(10);
		
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
		add(btnAlert);

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
