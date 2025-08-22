package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modal_ventas_re extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblCodigo;
	private JComboBox cBModelo;
	private JLabel lblCantidad;
	private JTextField tFcantidad;
	private JLabel lblMarca;
	private JLabel lblDescripcion;
	private JTextField tFdescripcion;
	private JButton btnCerrar;
	private JButton btnRealizarVenta;
	private JLabel lblPrecioUnts;
	private JTextField tFprecio;
	private JLabel lblPrecio_2;
	private JTextField tFtotal;
	private JTextField tFproducto;
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		cBModelo.setModel(new DefaultComboBoxModel(new String[] {"14030", "17657", "16850", "16532", "19503", "11167", "11657", "12939"}));
		cBModelo.setBounds(114, 77, 85, 22);
		contentPane.add(cBModelo);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setOpaque(true);
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBackground(new Color(51, 102, 153));
		lblCantidad.setBounds(229, 77, 85, 22);
		contentPane.add(lblCantidad);
		
		tFcantidad = new JTextField();
		tFcantidad.setText("24");
		tFcantidad.setColumns(10);
		tFcantidad.setBounds(313, 77, 85, 22);
		contentPane.add(tFcantidad);
		
		lblMarca = new JLabel("Producto:");
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
		
		tFdescripcion = new JTextField();
		tFdescripcion.setText("PROCESADOR INTEL CORE I3 10105F 3.7GHZ");
		tFdescripcion.setEnabled(false);
		tFdescripcion.setColumns(10);
		tFdescripcion.setBounds(114, 157, 284, 22);
		contentPane.add(tFdescripcion);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setBackground(new Color(31, 64, 96));
		btnCerrar.setBounds(30, 446, 105, 30);
		contentPane.add(btnCerrar);
		
		btnRealizarVenta = new JButton("Realizar venta");
		btnRealizarVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int cantidad = Integer.parseInt(tFcantidad.getText());
				double precioUnitario = Double.parseDouble(tFprecio.getText());
				double total = cantidad * precioUnitario;
				double importeDescuento = 0.0;
				double importe_pagar = 0.0;
				String ObsequioParaDar = "";
				
				String total_formateado = FormatearAdos(total);
				tFtotal.setText(String.valueOf(total_formateado));

				// Aplicar los descuentos y los obsequios
				if (cantidad >= 1 && cantidad <= 5) {
					total = cantidad * precioUnitario;
					importeDescuento = total * descuento1;
					importe_pagar = total - importeDescuento;
					cantidadVentas++;
					ImporteGeneral += importe_pagar;

				} else if (cantidad >= 6 && cantidad <= 10) {
					total = cantidad * precioUnitario;
					importeDescuento = total * descuento2;
					importe_pagar = total - importeDescuento;
					cantidadVentas++;
					ImporteGeneral += importe_pagar;

				} else if (cantidad >= 11 && cantidad <= 15) {
					total = cantidad * precioUnitario;
					importeDescuento = total * descuento3;
					importe_pagar = total - importeDescuento;
					cantidadVentas++;
					ImporteGeneral += importe_pagar;

				} else if (cantidad > 15) {
					total = cantidad * precioUnitario;
					importeDescuento = total * descuento4;
					importe_pagar = total - importeDescuento;
					cantidadVentas++;
					ImporteGeneral += importe_pagar;
				}
				if (cantidad == 1) {
					ObsequioParaDar = obsequio1;
				} else if (cantidad >= 2 && cantidad <= 5) {
					ObsequioParaDar = obsequio2a5;
				} else if (cantidad >= 6) {
					ObsequioParaDar = obsequio6amas;
				} else {
					ObsequioParaDar = "No aplica obsequio";
				}
				
				/*
				JOptionPane.showMessageDialog(null,
						"Comun�quese con el soporte",
						"Usuario bloqueado",
						JOptionPane.ERROR_MESSAGE);
				modal_login.this.dispose(); */
				
				// Temporal, mostrar datos detallados como una boleta en el textArea
				textArea.setText(""); // Limpiar el área de texto antes de mostrar los datos
				textArea.setFont(new Font("Roboto", Font.PLAIN, 12));
				textArea.append("---- Boleta de venta ----\n\n");
				textArea.append("C\u00F3digo: " + cBModelo.getSelectedItem() + "\n");
				textArea.append("Producto: " + tFproducto.getText() + "\n");
				textArea.append("Cantidad: " + tFcantidad.getText() + "\n");
				textArea.append("Precio Unitario: S/ " + tFprecio.getText() + "\n");
				textArea.append("Importe compra: S/ " + FormatearAdos(total) + "\n");
				textArea.append("Descuento aplicado: S/ " + FormatearAdos(importeDescuento) + "\n");
				textArea.append("Importe a pagar: S/ " + FormatearAdos(importe_pagar) + "\n");
				textArea.append("Obsequio: " + ObsequioParaDar + "\n");
				// falta el obsequio

				Comprobar5ventas(cantidadVentas);


			}
		});
		btnRealizarVenta.setForeground(Color.WHITE);
		btnRealizarVenta.setBackground(new Color(31, 64, 96));
		btnRealizarVenta.setBounds(278, 446, 120, 30);
		contentPane.add(btnRealizarVenta);
		
		lblPrecioUnts = new JLabel("Precio (S/):");
		lblPrecioUnts.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecioUnts.setOpaque(true);
		lblPrecioUnts.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioUnts.setForeground(Color.WHITE);
		lblPrecioUnts.setBackground(new Color(51, 102, 153));
		lblPrecioUnts.setBounds(30, 198, 99, 22);
		contentPane.add(lblPrecioUnts);
		
		tFprecio = new JTextField();
		tFprecio.setText("279.0");
		tFprecio.setEnabled(false);
		tFprecio.setColumns(10);
		tFprecio.setBounds(129, 198, 70, 22);
		contentPane.add(tFprecio);
		
		lblPrecio_2 = new JLabel("Total (S/):");
		lblPrecio_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio_2.setOpaque(true);
		lblPrecio_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio_2.setForeground(Color.WHITE);
		lblPrecio_2.setBackground(new Color(51, 102, 153));
		lblPrecio_2.setBounds(229, 198, 99, 22);
		contentPane.add(lblPrecio_2);
		
		tFtotal = new JTextField();
		tFtotal.setText("279.0");
		tFtotal.setEnabled(false);
		tFtotal.setColumns(10);
		tFtotal.setBounds(327, 198, 70, 22);
		contentPane.add(tFtotal);
		
		tFproducto = new JTextField();
		tFproducto.setText("Intel");
		tFproducto.setEnabled(false);
		tFproducto.setColumns(10);
		tFproducto.setBounds(114, 117, 284, 22);
		contentPane.add(tFproducto);
		
		
		ImageIcon imagen = new ImageIcon("iconvender.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(180, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta2);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Inicio
				String codigo = cBModelo.getSelectedItem().toString();
				
				
				switch (codigo) {
					case "14030":
						tFproducto.setText(String.valueOf(producto1));
						tFdescripcion.setText(String.valueOf(descripcion1));
						tFprecio.setText(String.valueOf(precio1));
						break;
					
					case "17657":
						tFproducto.setText(String.valueOf(producto2));
						tFdescripcion.setText(String.valueOf(descripcion2));
						tFprecio.setText(String.valueOf(precio2));
						break;

					case "16850":
						tFproducto.setText(String.valueOf(producto3));
						tFdescripcion.setText(String.valueOf(descripcion3));
						tFprecio.setText(String.valueOf(precio3));
						break;
					
					case "16532":
						tFproducto.setText(String.valueOf(producto4));
						tFdescripcion.setText(String.valueOf(descripcion4));
						tFprecio.setText(String.valueOf(precio4));
						
					case "19503":
						tFproducto.setText(String.valueOf(producto5));
						tFdescripcion.setText(String.valueOf(descripcion5));
						tFprecio.setText(String.valueOf(precio5));
						break;
						
					case "11167":
						tFproducto.setText(String.valueOf(producto6));
						tFdescripcion.setText(String.valueOf(descripcion6));
						tFprecio.setText(String.valueOf(precio6));
						break;
					
					case "11657":
						tFproducto.setText(String.valueOf(producto7));
						tFdescripcion.setText(String.valueOf(descripcion7));
						tFprecio.setText(String.valueOf(precio7));
						break;

					case "12939":
						tFproducto.setText(String.valueOf(producto8));
						tFdescripcion.setText(String.valueOf(descripcion8));
						tFprecio.setText(String.valueOf(precio8));
						break;
				}
			}
		});
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(new Color(31, 64, 96));
		btnConsultar.setBounds(145, 446, 120, 30);
		contentPane.add(btnConsultar);
	}
	String FormatearAdos(double numero) {
		return String.format("%.2f", numero);
	}

// Numero de venta
// Total acumulado
// Porcentaje de cuota diaria

	void Comprobar5ventas(int numero) {
		if (numero % 5 == 0) {
			JOptionPane.showMessageDialog(null, "Felicidades, ha realizado " + cantidadVentas + " ventas"+
				"\n Ventas acumuladas: " + FormatearAdos(ImporteGeneral) + 
				"\n Pocentaje de la cuota diaria: " + FormatearAdos((ImporteGeneral / cuotaDiaria) * 100) + "%");
		} 
	}
}
