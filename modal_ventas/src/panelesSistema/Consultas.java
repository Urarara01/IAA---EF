package panelesSistema;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesUtiles.TabbedForm;
import clasesUtiles.centrarTabbedForm;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Consultas extends TabbedForm {

	private JButton btnConsultar;
	private JLabel lblCodigo;
	private JComboBox cBModelo;
	private JLabel lblCantidad;
	private JTextField tFCantidad;
	private JLabel lblDescripcion;
	private JLabel lblMarca;
	private JLabel lblPrecio;
	private JTextField tFPrecio;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JTextField txtIntel;
	private JLabel etiqueta2;
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public Consultas() {
		setLayout(null);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarProducto(cBModelo);
			}
		});
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(new Color(31, 64, 96));
		btnConsultar.setBounds(198, 259, 105, 30);
		add(btnConsultar);
		
		lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setBackground(new Color(51, 102, 153));
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setBounds(30, 77, 85, 22);
		lblCodigo.setOpaque(true);
		add(lblCodigo);
		
		cBModelo = new JComboBox();
		cBModelo.setModel(new DefaultComboBoxModel(new String[] {"14030", "17657", "16850", "16532", "19503", "11167", "11657", "12939"}));
		cBModelo.setBounds(114, 77, 135, 22);
		add(cBModelo);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBackground(new Color(51, 102, 153));
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setBounds(312, 77, 85, 22);
		lblCantidad.setOpaque(true);
		add(lblCantidad);
		
		tFCantidad = new JTextField();
		tFCantidad.setEnabled(false);
		tFCantidad.setText("24");
		tFCantidad.setColumns(10);
		tFCantidad.setBounds(396, 77, 85, 22);
		add(tFCantidad);
		
		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBackground(new Color(51, 102, 153));
		lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion.setBounds(30, 157, 85, 22);
		lblDescripcion.setOpaque(true);
		add(lblDescripcion);
		
		lblMarca = new JLabel("Producto:");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBackground(new Color(51, 102, 153));
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setBounds(30, 117, 85, 22);
		lblMarca.setOpaque(true);
		add(lblMarca);
		
		lblPrecio = new JLabel("Precio Unt.:");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setBackground(new Color(51, 102, 153));
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setBounds(312, 117, 85, 22);
		lblPrecio.setOpaque(true);
		add(lblPrecio);
		
		tFPrecio = new JTextField();
		tFPrecio.setEnabled(false);
		tFPrecio.setText("279.0");
		tFPrecio.setColumns(10);
		tFPrecio.setBounds(396, 117, 85, 22);
		add(tFPrecio);
		
		lblNewLabel = new JLabel("Consultar Productos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(18, 11, 197, 34);
		add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(16, 56, 408, 2);
		add(separator);
		
		txtIntel = new JTextField();
		txtIntel.setText("Intel");
		txtIntel.setEnabled(false);
		txtIntel.setColumns(10);
		txtIntel.setBounds(114, 117, 135, 22);
		add(txtIntel);
		
		
		ImageIcon imagen = new ImageIcon("iconconsultar.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(220, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		add(etiqueta2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(114, 157, 367, 91);
		add(scrollPane);
		
		//JTextArea textArea;
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
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
				textArea.setText(String.valueOf(descripcion1));
				tFPrecio.setText(String.valueOf(precio1));
				txtIntel.setText(String.valueOf(producto1));
				break;
			case "17657":
				tFCantidad.setText(String.valueOf(stock2));
				textArea.setText(descripcion2);
				tFPrecio.setText(String.valueOf(precio2));
				txtIntel.setText(String.valueOf(producto2));
				break;
			case "16850":
				tFCantidad.setText(String.valueOf(stock3));
				textArea.setText(descripcion3);
				tFPrecio.setText(String.valueOf(precio3));
				txtIntel.setText(String.valueOf(producto3));
				break;
			case "16532":
				tFCantidad.setText(String.valueOf(stock4));
				textArea.setText(descripcion4);
				tFPrecio.setText(String.valueOf(precio4));
				txtIntel.setText(String.valueOf(producto4));
				break;
			case "19503":
				tFCantidad.setText(String.valueOf(stock5));
				textArea.setText(descripcion5);
				tFPrecio.setText(String.valueOf(precio5));
				txtIntel.setText(String.valueOf(producto5));
				break;
			case "11167":
				tFCantidad.setText(String.valueOf(stock6));
				textArea.setText(descripcion6);
				tFPrecio.setText(String.valueOf(precio6));
				txtIntel.setText(String.valueOf(producto6));
				break;
			case "11657":
				tFCantidad.setText(String.valueOf(stock7));
				textArea.setText(descripcion7);
				tFPrecio.setText(String.valueOf(precio7));
				txtIntel.setText(String.valueOf(producto7));
				break;
			case "12939":
				tFCantidad.setText(String.valueOf(stock8));
				textArea.setText(descripcion8);
				tFPrecio.setText(String.valueOf(precio8));
				txtIntel.setText(String.valueOf(producto8));
				break;
			default:
		}
		
	}
	@Override
	public void formOpen() {
		super.formOpen();
		// Centrar el contenido cuando el formulario se abre
		centrarTabbedForm.centerContent(this);
	}
}
