package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import static variables.ProductoInventario.*;

import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Color;

public class modal_modificar_producto extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JSeparator separator;
	private JLabel lblCodigo;
	private JLabel lblMarca;
	private JLabel lblDescripcion;
	private JTextField textField;
	private JComboBox cBModelo;
	private JLabel lblCantidad;
	private JLabel lblPrecio;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnGuardar;
	private JButton btnCerrar;
	private JTextField txtIntel;
	private JLabel etiqueta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_modificar_producto frame = new modal_modificar_producto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public modal_modificar_producto() {
		setTitle("Modificar producto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Modificar Productos");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(18, 11, 193, 34);
		contentPane.add(lblNewLabel_3);
		
		separator = new JSeparator();
		separator.setBounds(16, 56, 408, 2);
		contentPane.add(separator);
		
		lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setOpaque(true);
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setBackground(new Color(51, 102, 153));
		lblCodigo.setBounds(31, 79, 85, 22);
		contentPane.add(lblCodigo);
		
		lblMarca = new JLabel("Marca:");
		lblMarca.setOpaque(true);
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBackground(new Color(51, 102, 153));
		lblMarca.setBounds(31, 119, 85, 22);
		contentPane.add(lblMarca);
		
		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setOpaque(true);
		lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBackground(new Color(51, 102, 153));
		lblDescripcion.setBounds(31, 159, 85, 22);
		contentPane.add(lblDescripcion);
		
		textField = new JTextField();
		textField.setText("PROCESADOR INTEL CORE I3 10105F 3.7GHZ");
		textField.setColumns(10);
		textField.setBounds(115, 159, 284, 22);
		contentPane.add(textField);
		
		cBModelo = new JComboBox();
		cBModelo.setModel(new DefaultComboBoxModel(new String[] {"014030", "017657", "016850", "016532", "019503", "011167", "011657", "012939"}));
		cBModelo.setBounds(115, 79, 85, 22);
		contentPane.add(cBModelo);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setOpaque(true);
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBackground(new Color(51, 102, 153));
		lblCantidad.setBounds(230, 79, 85, 22);
		contentPane.add(lblCantidad);
		
		lblPrecio = new JLabel("Precio Unt.:");
		lblPrecio.setOpaque(true);
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setBackground(new Color(51, 102, 153));
		lblPrecio.setBounds(230, 119, 85, 22);
		contentPane.add(lblPrecio);
		
		textField_1 = new JTextField();
		textField_1.setText("279.0");
		textField_1.setColumns(10);
		textField_1.setBounds(314, 119, 85, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("24");
		textField_2.setColumns(10);
		textField_2.setBounds(314, 79, 85, 22);
		contentPane.add(textField_2);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBackground(new Color(31, 64, 96));
		btnGuardar.setBounds(115, 216, 105, 30);
		contentPane.add(btnGuardar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setBackground(new Color(31, 64, 96));
		btnCerrar.setBounds(237, 216, 105, 30);
		contentPane.add(btnCerrar);
		
		txtIntel = new JTextField();
		txtIntel.setText("Intel");
		txtIntel.setColumns(10);
		txtIntel.setBounds(115, 119, 85, 22);
		contentPane.add(txtIntel);
		
		ImageIcon imagen = new ImageIcon("iconmodificar.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(208, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta2);
		
	
	}
}
