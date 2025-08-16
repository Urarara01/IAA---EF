package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class modal_modificar_producto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JSeparator separator;
	private JLabel lblCodigo;
	private JLabel lblMarca;
	private JLabel lblDescripcion;
	private JComboBox cBModelo;
	private JLabel lblCantidad;
	private JLabel lblPrecio;
	private JTextField tFprecio;
	private JTextField tFCantidad;
	private JButton btnGuardar;
	private JButton btnConsultar;
	private JTextField tFMarca;
	private JLabel etiqueta2;
	private JButton btnCerrar;
	private JTextArea tFDescripcion;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		lblMarca = new JLabel("Producto:");
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
		
		tFprecio = new JTextField();
		tFprecio.setText("279.0");
		tFprecio.setColumns(10);
		tFprecio.setBounds(314, 119, 85, 22);
		contentPane.add(tFprecio);
		
		tFCantidad = new JTextField();
		tFCantidad.setText("24");
		tFCantidad.setColumns(10);
		tFCantidad.setBounds(314, 79, 85, 22);
		contentPane.add(tFCantidad);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBackground(new Color(31, 64, 96));
		btnGuardar.setBounds(31, 255, 105, 30);
		contentPane.add(btnGuardar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(new Color(31, 64, 96));
		btnConsultar.setBounds(160, 255, 105, 30);
		contentPane.add(btnConsultar);
		
		tFMarca = new JTextField();
		tFMarca.setText("Intel");
		tFMarca.setColumns(10);
		tFMarca.setBounds(115, 119, 85, 22);
		contentPane.add(tFMarca);
		
		ImageIcon imagen = new ImageIcon("iconmodificar.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(208, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta2);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setBackground(new Color(31, 64, 96));
		btnCerrar.setBounds(294, 255, 105, 30);
		contentPane.add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(115, 159, 284, 85);
		contentPane.add(scrollPane);
		
		tFDescripcion = new JTextArea();
		tFDescripcion.setText("PROCESADOR INTEL CORE I3 12100F 3.3GHZ HASTA 4.3GHZ 12MB (BX8071512100F) LGA 170");
		scrollPane.setViewportView(tFDescripcion);
		tFDescripcion.setLineWrap(true);
		
	
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(e);
		}
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		String codigoSeleccionado = (String) cBModelo.getSelectedItem();
		int codigo = Integer.parseInt(codigoSeleccionado);
		String marca = tFMarca.getText();
		String descripcion = tFDescripcion.getText();
		int cantidad = Integer.parseInt(tFCantidad.getText());
		double precio = Double.parseDouble(tFprecio.getText());
	
		switch (codigo) {
			case 14030:
				codigo1 = codigo;
				producto1 = marca;
				stock1 = cantidad;
				descripcion1 = descripcion;
				precio1 = precio;
				break;
			case 17657:
				codigo2 = codigo;
				producto2 = marca;
				stock2 = cantidad;
				descripcion2 = descripcion;
				precio2 = precio;
				break;
			case 16850:
				codigo3 = codigo;
				producto3 = marca;
				stock3 = cantidad;
				descripcion3 = descripcion;
				precio3 = precio;
				break;
			case 16532:
				codigo4 = codigo;
				producto4 = marca;
				stock4 = cantidad;
				descripcion4 = descripcion;
				precio4 = precio;
				break;
			case 19503:
				codigo5 = codigo;
				producto5 = marca;
				stock5 = cantidad;
				descripcion5 = descripcion;
				precio5 = precio;
				break;
			case 11167:
				codigo6 = codigo;
				producto6 = marca;
				stock6 = cantidad;
				descripcion6 = descripcion;
				precio6 = precio;
				break;
			case 11657:
				codigo7 = codigo;
				producto7 = marca;
				stock7 = cantidad;
				descripcion7 = descripcion;
				precio7 = precio;
				break;
			case 12939:
				codigo8 = codigo;
				producto8 = marca;
				stock8 = cantidad;
				descripcion8 = descripcion;
				precio8 = precio;
				break;
			default:
				JOptionPane.showMessageDialog(this, "Codigo de producto no reconocido", "Error", JOptionPane.ERROR_MESSAGE);
				return;
		}
	
		JOptionPane.showMessageDialog(this, "Producto modificado exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
	}
	protected void actionPerformedBtnConsultar(ActionEvent e) {
	    String codigoSeleccionado = (String) cBModelo.getSelectedItem();
	    int codigo = Integer.parseInt(codigoSeleccionado);

	    switch (codigo) {
	        case 14030:
	            tFMarca.setText(producto1);
	            tFDescripcion.setText(descripcion1);
	            tFCantidad.setText(String.valueOf(stock1));
	            tFprecio.setText(String.valueOf(precio1));
	            break;
	        case 17657:
	            tFMarca.setText(producto2);
	            tFDescripcion.setText(descripcion2);
	            tFCantidad.setText(String.valueOf(stock2));
	            tFprecio.setText(String.valueOf(precio2));
	            break;
	        case 16850:
	            tFMarca.setText(producto3);
	            tFDescripcion.setText(descripcion3);
	            tFCantidad.setText(String.valueOf(stock3));
	            tFprecio.setText(String.valueOf(precio3));
	            break;
	        case 16532:
	            tFMarca.setText(producto4);
	            tFDescripcion.setText(descripcion4);
	            tFCantidad.setText(String.valueOf(stock4));
	            tFprecio.setText(String.valueOf(precio4));
	            break;
	        case 19503:
	            tFMarca.setText(producto5);
	            tFDescripcion.setText(descripcion5);
	            tFCantidad.setText(String.valueOf(stock5));
	            tFprecio.setText(String.valueOf(precio5));
	            break;
	        case 11167:
	            tFMarca.setText(producto6);
	            tFDescripcion.setText(descripcion6);
	            tFCantidad.setText(String.valueOf(stock6));
	            tFprecio.setText(String.valueOf(precio6));
	            break;
	        case 11657:
	            tFMarca.setText(producto7);
	            tFDescripcion.setText(descripcion7);
	            tFCantidad.setText(String.valueOf(stock7));
	            tFprecio.setText(String.valueOf(precio7));
	            break;
	        case 12939:
	            tFMarca.setText(producto8);
	            tFDescripcion.setText(descripcion8);
	            tFCantidad.setText(String.valueOf(stock8));
	            tFprecio.setText(String.valueOf(precio8));
	            break;
	        default:
	            JOptionPane.showMessageDialog(this, "Codigo de producto no reconocido", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	    }
	    
	    tFDescripcion.setLineWrap(true);
	    JOptionPane.showMessageDialog(this, "Producto consultado exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
	}
}
