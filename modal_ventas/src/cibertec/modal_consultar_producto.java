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
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import static variables.ProductoInventario.*;

import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modal_consultar_producto extends JFrame {

	private JPanel contentPane;
	private JButton btnConsultar;
	private JButton btnNuevo;
	private JButton btnCerrar;
	private JLabel lblCodigo;
	private JComboBox cBModelo;
	private JLabel lblCantidad;
	private JTextField tFCantidad;
	private JLabel lblDescripcion;
	private JTextField tFDescripcion;
	private JLabel lblMarca;
	private JLabel lblPrecio;
	private JTextField tFPrecio;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JTextField txtIntel;
	private JLabel etiqueta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_consultar_producto frame = new modal_consultar_producto();
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
	public modal_consultar_producto() {
		setTitle("Consultar Producto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarProducto(cBModelo);
			}
		});
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(new Color(31, 64, 96));
		btnConsultar.setBounds(162, 214, 105, 30);
		contentPane.add(btnConsultar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setForeground(Color.WHITE);
		btnNuevo.setBackground(new Color(31, 64, 96));
		btnNuevo.setBounds(284, 214, 105, 30);
		contentPane.add(btnNuevo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setBackground(new Color(31, 64, 96));
		btnCerrar.setBounds(40, 214, 105, 30);
		contentPane.add(btnCerrar);
		
		lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setBackground(new Color(51, 102, 153));
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setBounds(30, 77, 85, 22);
		lblCodigo.setOpaque(true);
		contentPane.add(lblCodigo);
		
		cBModelo = new JComboBox();
		cBModelo.setModel(new DefaultComboBoxModel(new String[] {"14030", "17657", "16850", "16532", "19503", "11167", "11657", "12939"}));
		cBModelo.setBounds(114, 77, 85, 22);
		contentPane.add(cBModelo);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBackground(new Color(51, 102, 153));
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setBounds(229, 77, 85, 22);
		lblCantidad.setOpaque(true);
		contentPane.add(lblCantidad);
		
		tFCantidad = new JTextField();
		tFCantidad.setEnabled(false);
		tFCantidad.setText("24");
		tFCantidad.setColumns(10);
		tFCantidad.setBounds(313, 77, 85, 22);
		contentPane.add(tFCantidad);
		
		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBackground(new Color(51, 102, 153));
		lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion.setBounds(30, 157, 85, 22);
		lblDescripcion.setOpaque(true);
		contentPane.add(lblDescripcion);
		
		tFDescripcion = new JTextField();
		tFDescripcion.setEnabled(false);
		tFDescripcion.setText("PROCESADOR INTEL CORE I3 10105F 3.7GHZ");
		tFDescripcion.setColumns(10);
		tFDescripcion.setBounds(114, 157, 284, 22);
		contentPane.add(tFDescripcion);
		
		lblMarca = new JLabel("Producto:");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBackground(new Color(51, 102, 153));
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setBounds(30, 117, 85, 22);
		lblMarca.setOpaque(true);
		contentPane.add(lblMarca);
		
		lblPrecio = new JLabel("Precio Unt.:");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setBackground(new Color(51, 102, 153));
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setBounds(229, 117, 85, 22);
		lblPrecio.setOpaque(true);
		contentPane.add(lblPrecio);
		
		tFPrecio = new JTextField();
		tFPrecio.setEnabled(false);
		tFPrecio.setText("279.0");
		tFPrecio.setColumns(10);
		tFPrecio.setBounds(313, 117, 85, 22);
		contentPane.add(tFPrecio);
		
		lblNewLabel = new JLabel("Consultar Productos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(18, 11, 197, 34);
		contentPane.add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(16, 56, 408, 2);
		contentPane.add(separator);
		
		txtIntel = new JTextField();
		txtIntel.setText("Intel");
		txtIntel.setEnabled(false);
		txtIntel.setColumns(10);
		txtIntel.setBounds(114, 117, 85, 22);
		contentPane.add(txtIntel);
		
		
		ImageIcon imagen = new ImageIcon("iconconsultar.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(220, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta2);
	}
	String ObtenerIdProducto(JComboBox idProducto){
		return idProducto.getSelectedItem().toString();
	}
	// Add action listeners for buttons
	public void ConsultarProducto(JComboBox idProducto) {
		String id_producto;
		// tFCantidad.setText("");
		id_producto = ObtenerIdProducto(idProducto);
		switch (id_producto) {
			case "14030":
				tFCantidad.setText(String.valueOf(stock1));
				tFDescripcion.setText(descripcion1);
				tFPrecio.setText(String.valueOf(precio1));
				txtIntel.setText(String.valueOf(producto1));
				break;
			case "17657":
				tFCantidad.setText(String.valueOf(stock2));
				tFDescripcion.setText(descripcion2);
				tFPrecio.setText(String.valueOf(precio2));
				txtIntel.setText(String.valueOf(producto2));
				break;
			case "16850":
				tFCantidad.setText(String.valueOf(stock3));
				tFDescripcion.setText(descripcion3);
				tFPrecio.setText(String.valueOf(precio3));
				txtIntel.setText(String.valueOf(producto3));
				break;
			case "16532":
				tFCantidad.setText(String.valueOf(stock4));
				tFDescripcion.setText(descripcion4);
				tFPrecio.setText(String.valueOf(precio4));
				txtIntel.setText(String.valueOf(producto4));
				break;
			case "19503":
				tFCantidad.setText(String.valueOf(stock5));
				tFDescripcion.setText(descripcion5);
				tFPrecio.setText(String.valueOf(precio5));
				txtIntel.setText(String.valueOf(producto5));
				break;
			case "11167":
				tFCantidad.setText(String.valueOf(stock6));
				tFDescripcion.setText(descripcion6);
				tFPrecio.setText(String.valueOf(precio6));
				txtIntel.setText(String.valueOf(producto6));
				break;
			case "11657":
				tFCantidad.setText(String.valueOf(stock7));
				tFDescripcion.setText(descripcion7);
				tFPrecio.setText(String.valueOf(precio7));
				txtIntel.setText(String.valueOf(producto7));
				break;
			case "12939":
				tFCantidad.setText(String.valueOf(stock8));
				tFDescripcion.setText(descripcion8);
				tFPrecio.setText(String.valueOf(precio8));
				txtIntel.setText(String.valueOf(producto8));
				break;
			default:
		}
		
	}
}
