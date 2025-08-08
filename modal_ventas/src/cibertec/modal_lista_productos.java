package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class modal_lista_productos extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnCerrar;
	private JButton btnListar;
	private JSeparator separator;
	private JLabel lblLista;
	private JLabel etiqueta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_lista_productos frame = new modal_lista_productos();
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
	public modal_lista_productos() {
		setTitle("Lista de productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 75, 414, 208);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setBackground(new Color(31, 64, 96));
		btnCerrar.setBounds(105, 301, 105, 30);
		contentPane.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.setForeground(Color.WHITE);
		btnListar.setBackground(new Color(31, 64, 96));
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnListar.setBounds(242, 301, 105, 30);
		contentPane.add(btnListar);
		
		separator = new JSeparator();
		separator.setBounds(16, 56, 408, 2);
		contentPane.add(separator);
		
		lblLista = new JLabel("Lista de Productos");
		lblLista.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLista.setBounds(18, 11, 182, 34);
		contentPane.add(lblLista);
		
		
		
		ImageIcon imagen = new ImageIcon("iconlistar.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(190, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta2);
	}
}
