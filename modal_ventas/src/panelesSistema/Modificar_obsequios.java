package panelesSistema;

import static variables.ProductoInventario.obsequio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesUtiles.TabbedForm;
import clasesUtiles.centrarTabbedForm;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import static variables.ProductoInventario.*;

public class Modificar_obsequios extends TabbedForm {

	private JLabel lblObsequios;
	private JSeparator separator;
	private JButton btnAceptar;
	private JTextField tFobsequio1;
	private JTextField tFobsequio2a5;
	private JTextField tFobsequio6amas;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblUnidad;
	private JLabel etiqueta2;

	
	/**
	 * Create the frame.
	 */
	public Modificar_obsequios() {
		
		setLayout(null);
		
		lblObsequios = new JLabel("Obsequios");
		lblObsequios.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblObsequios.setBounds(18, 11, 241, 34);
		add(lblObsequios);
		
		separator = new JSeparator();
		separator.setBounds(16, 56, 408, 2);
		add(separator);
		
		btnAceptar = new JButton("Consultar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarObsequios();
			}
		});
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setBackground(new Color(31, 64, 96));
		btnAceptar.setBounds(309, 72, 105, 30);
		add(btnAceptar);
		
		tFobsequio1 = new JTextField();

		tFobsequio1.setText(obsequio1);
		tFobsequio1.setColumns(10);
		tFobsequio1.setBounds(171, 76, 86, 22);
		add(tFobsequio1);
		
		tFobsequio2a5 = new JTextField();
		tFobsequio2a5.setText(obsequio2a5);
		tFobsequio2a5.setColumns(10);
		tFobsequio2a5.setBounds(171, 113, 86, 22);
		add(tFobsequio2a5);
		
		tFobsequio6amas = new JTextField();
		tFobsequio6amas.setText(obsequio6amas);
		tFobsequio6amas.setColumns(10);
		tFobsequio6amas.setBounds(171, 150, 86, 22);
		add(tFobsequio6amas);
		
		lblNewLabel_2 = new JLabel("6 a m\u00E1s unidades");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBackground(new Color(51, 102, 153));
		lblNewLabel_2.setBounds(38, 150, 134, 22);
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("2 a 5 unidades");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBackground(new Color(51, 102, 153));
		lblNewLabel_3.setBounds(38, 113, 134, 22);
		add(lblNewLabel_3);
		
		lblUnidad = new JLabel("1 unidad");
		lblUnidad.setOpaque(true);
		lblUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidad.setForeground(Color.WHITE);
		lblUnidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUnidad.setBackground(new Color(51, 102, 153));
		lblUnidad.setBounds(38, 76, 134, 22);
		add(lblUnidad);
		
		
		ImageIcon imagen = new ImageIcon("iconobsequios.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(120, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		add(etiqueta2);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarObsequios(tFobsequio1, tFobsequio2a5, tFobsequio6amas);
			}
		});
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBackground(new Color(31, 64, 96));
		btnModificar.setBounds(309, 109, 105, 30);
		add(btnModificar);
	}

	String ObtenerValorDeTextField(JTextField textField) {
		return textField.getText();
	}

	void ConsultarObsequios() {
		tFobsequio1.setText(obsequio1);
		tFobsequio2a5.setText(obsequio2a5);
		tFobsequio6amas.setText(obsequio6amas);
	}
		
	void ModificarObsequios() {
		obsequio1 = ObtenerValorDeTextField(tFobsequio1);
		obsequio2a5 = ObtenerValorDeTextField(tFobsequio2a5);
		obsequio6amas = ObtenerValorDeTextField(tFobsequio6amas);
	}

	void ModificarObsequios(JTextField tFobsequio1, JTextField tFobsequio2a5, JTextField tFobsequio6amas) {
		ModificarObsequios();
	}
	@Override
	public void formOpen() {
		super.formOpen();
		// Centrar el contenido cuando el formulario se abre
		centrarTabbedForm.centerContent(this);
	}
}
