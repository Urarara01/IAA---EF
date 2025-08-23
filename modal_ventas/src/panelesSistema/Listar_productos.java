package panelesSistema;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesUtiles.FlatLab;
import clasesUtiles.TabbedForm;
import clasesUtiles.centrarTabbedForm;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import static variables.ProductoInventario.*;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class Listar_productos extends TabbedForm {


	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnListar;
	private JSeparator separator;
	private JLabel lblLista;
	private JLabel etiqueta2;

	/**
	 * Create the frame.
	 */
	public Listar_productos() {
		setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 75, 414, 208);
		add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnListar = new JButton("Listar");
		btnListar.setForeground(Color.WHITE);
		btnListar.setBackground(new Color(31, 64, 96));
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstablecerAreaTexto();
				configurarAreaTexto();
				
			}
		});
		btnListar.setBounds(176, 304, 105, 30);
		add(btnListar);
		
		separator = new JSeparator();
		separator.setBounds(16, 56, 408, 2);
		add(separator);
		
		lblLista = new JLabel("Lista de Productos");
		lblLista.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLista.setBounds(18, 11, 182, 34);
		add(lblLista);
		
		
		
		ImageIcon imagen = new ImageIcon("iconlistar.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(190, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		add(etiqueta2);
	}

	void EstablecerAreaTexto() {
		textArea.setText("=== INVENTARIO DE PRODUCTOS ===\n\n" +
						"Codigo: " + codigo1 + "\n" +
						"Producto: " + producto1 + "\n" +
						"Stock: " + stock1 + "\n" +
						"Descripcion: " + descripcion1 + "\n" +
						"Precio: " + precio1 + "\n" +
						"----------------------------------------\n\n" +
						"Codigo: " + codigo2 + "\n" +
						"Producto: " + producto2 + "\n" +
						"Stock: " + stock2 + "\n" +
						"Descripcion: " + descripcion2 + "\n" +
						"Precio: " + precio2 + "\n" +
						"----------------------------------------\n\n" +
						"Codigo: " + codigo3 + "\n" +
						"Producto: " + producto3 + "\n" +
						"Stock: " + stock3 + "\n" +
						"Descripcion: " + descripcion3 + "\n" +
						"Precio: " + precio3 + "\n" +
						"----------------------------------------\n\n" +
						"Codigo: " + codigo4 + "\n" +
						"Producto: " + producto4 + "\n" +
						"Stock: " + stock4 + "\n" +
						"Descripcion: " + descripcion4 + "\n" +
						"Precio: " + precio4 + "\n" +
						"----------------------------------------\n\n" +
						"Codigo: " + codigo5 + "\n" +
						"Producto: " + producto5 + "\n" +
						"Stock: " + stock5 + "\n" +
						"Descripcion: " + descripcion5 + "\n" +
						"Precio: " + precio5 + "\n" +
						"----------------------------------------\n\n" +
						"Codigo: " + codigo6 + "\n" +
						"Producto: " + producto6 + "\n" +
						"Stock: " + stock6 + "\n" +
						"Descripcion: " + descripcion6 + "\n" +
						"Precio: " + precio6 + "\n" +
						"----------------------------------------\n\n" +
						"Codigo: " + codigo7 + "\n" +
						"Producto: " + producto7 + "\n" +
						"Stock: " + stock7 + "\n" +
						"Descripcion: " + descripcion7 + "\n" +
						"Precio: " + precio7 + "\n" +
						"----------------------------------------\n\n" +
						"Codigo: " + codigo8 + "\n" +
						"Producto: " + producto8 + "\n" +
						"Stock: " + stock8 + "\n" +
						"Descripcion: " + descripcion8 + "\n" +
						"Precio: " + precio8);
	}

	void configurarAreaTexto() {
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
	}

	@Override
	public void formOpen() {
		super.formOpen();
		// Centrar el contenido cuando el formulario se abre
		centrarTabbedForm.centerContent(this);
	}
}
