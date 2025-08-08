package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import static variables.variables.*;

public class example extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					example frame = new example();
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
	public example() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 53, 380, 180);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(147, 19, 89, 23);
		contentPane.add(btnNewButton);
	}
}
