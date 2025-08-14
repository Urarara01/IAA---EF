package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import static variables.ProductoInventario.*;

import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Color;

public class modal_ventas_re extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblCodigo;
	private JComboBox cBModelo;
	private JLabel lblCantidad;
	private JTextField textField;
	private JLabel lblMarca;
	private JLabel lblDescripcion;
	private JTextField textField_2;
	private JButton btnCerrar;
	private JButton btnRealizarVenta;
	private JLabel lblPrecioUnts;
	private JTextField textField_3;
	private JLabel lblPrecio_2;
	private JTextField textField_4;
	private JTextField txtIntel;
	private JLabel etiqueta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_ventas_re frame = new modal_ventas_re();
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
	public modal_ventas_re() {
		setTitle("vender producto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 252, 368, 167);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lblNewLabel = new JLabel("Vender Productos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(18, 11, 179, 34);
		contentPane.add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(16, 56, 408, 2);
		contentPane.add(separator);
		
		lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setOpaque(true);
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setBackground(new Color(51, 102, 153));
		lblCodigo.setBounds(30, 77, 85, 22);
		contentPane.add(lblCodigo);
		
		cBModelo = new JComboBox();
		cBModelo.setModel(new DefaultComboBoxModel(new String[] {"014030", "017657", "016850", "016532", "019503", "011167", "011657", "012939"}));
		cBModelo.setBounds(114, 77, 85, 22);
		contentPane.add(cBModelo);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setOpaque(true);
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBackground(new Color(51, 102, 153));
		lblCantidad.setBounds(229, 77, 85, 22);
		contentPane.add(lblCantidad);
		
		textField = new JTextField();
		textField.setText("24");
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(313, 77, 85, 22);
		contentPane.add(textField);
		
		lblMarca = new JLabel("Marca:");
		lblMarca.setOpaque(true);
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBackground(new Color(51, 102, 153));
		lblMarca.setBounds(30, 117, 85, 22);
		contentPane.add(lblMarca);
		
		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setOpaque(true);
		lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBackground(new Color(51, 102, 153));
		lblDescripcion.setBounds(30, 157, 85, 22);
		contentPane.add(lblDescripcion);
		
		textField_2 = new JTextField();
		textField_2.setText("PROCESADOR INTEL CORE I3 10105F 3.7GHZ");
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(114, 157, 284, 22);
		contentPane.add(textField_2);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setBackground(new Color(31, 64, 96));
		btnCerrar.setBounds(96, 446, 105, 30);
		contentPane.add(btnCerrar);
		
		btnRealizarVenta = new JButton("Realizar venta");
		btnRealizarVenta.setForeground(Color.WHITE);
		btnRealizarVenta.setBackground(new Color(31, 64, 96));
		btnRealizarVenta.setBounds(218, 446, 120, 30);
		contentPane.add(btnRealizarVenta);
		
		lblPrecioUnts = new JLabel("Precio (S/):");
		lblPrecioUnts.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecioUnts.setOpaque(true);
		lblPrecioUnts.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioUnts.setForeground(Color.WHITE);
		lblPrecioUnts.setBackground(new Color(51, 102, 153));
		lblPrecioUnts.setBounds(30, 198, 99, 22);
		contentPane.add(lblPrecioUnts);
		
		textField_3 = new JTextField();
		textField_3.setText("279.0");
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(129, 198, 70, 22);
		contentPane.add(textField_3);
		
		lblPrecio_2 = new JLabel("Total (S/):");
		lblPrecio_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio_2.setOpaque(true);
		lblPrecio_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio_2.setForeground(Color.WHITE);
		lblPrecio_2.setBackground(new Color(51, 102, 153));
		lblPrecio_2.setBounds(229, 198, 99, 22);
		contentPane.add(lblPrecio_2);
		
		textField_4 = new JTextField();
		textField_4.setText("279.0");
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(327, 198, 70, 22);
		contentPane.add(textField_4);
		
		txtIntel = new JTextField();
		txtIntel.setText("Intel");
		txtIntel.setEnabled(false);
		txtIntel.setColumns(10);
		txtIntel.setBounds(114, 117, 284, 22);
		contentPane.add(txtIntel);
		
		
		ImageIcon imagen = new ImageIcon("iconvender.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(180, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta2);
	}
}
