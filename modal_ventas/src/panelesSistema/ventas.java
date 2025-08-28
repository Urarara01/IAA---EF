package panelesSistema;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesUtiles.TabbedForm;
import clasesUtiles.centrarTabbedForm;
import raven.alerts.MessageAlerts;
import raven.popup.component.PopupCallbackAction;
import raven.popup.component.PopupController;

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

public class ventas extends TabbedForm {
	// Variables globales
	int stock_actual = 0;
	double importeDescuento = 0.0;
	String obsequio;

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
	private JButton btnRealizarVenta;
	private JLabel lblPrecioUnts;
	private JTextField tFprecio;
	private JLabel lblPrecio_2;
	private JTextField tFtotal;
	private JTextField tFproducto;
	private JLabel etiqueta2;
	/**
	 * Create the frame.
	 */
	public ventas() {
		setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 252, 368, 167);
		add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lblNewLabel = new JLabel("Vender Productos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(18, 11, 179, 34);
		add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(16, 56, 408, 2);
		add(separator);
		
		lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setOpaque(true);
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setBackground(new Color(51, 102, 153));
		lblCodigo.setBounds(30, 77, 85, 22);
		add(lblCodigo);
		
		cBModelo = new JComboBox();
		cBModelo.setModel(new DefaultComboBoxModel(new String[] {"14030", "17657", "16850", "16532", "19503", "11167", "11657", "12939"}));
		cBModelo.setBounds(114, 77, 85, 22);
		add(cBModelo);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setOpaque(true);
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBackground(new Color(51, 102, 153));
		lblCantidad.setBounds(229, 77, 85, 22);
		add(lblCantidad);
		
		tFcantidad = new JTextField();
		tFcantidad.setText("24");
		tFcantidad.setColumns(10);
		tFcantidad.setBounds(313, 77, 85, 22);
		add(tFcantidad);
		
		lblMarca = new JLabel("Producto:");
		lblMarca.setOpaque(true);
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBackground(new Color(51, 102, 153));
		lblMarca.setBounds(30, 117, 85, 22);
		add(lblMarca);
		
		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setOpaque(true);
		lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBackground(new Color(51, 102, 153));
		lblDescripcion.setBounds(30, 157, 85, 22);
		add(lblDescripcion);
		
		tFdescripcion = new JTextField();
		tFdescripcion.setText("PROCESADOR INTEL CORE I3 10105F 3.7GHZ");
		tFdescripcion.setEnabled(false);
		tFdescripcion.setColumns(10);
		tFdescripcion.setBounds(114, 157, 284, 22);
		add(tFdescripcion);
		
		

		btnRealizarVenta = new JButton("Realizar venta");
		btnRealizarVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Obtener datos de la venta
				// int cantidad = Integer.parseInt(tFcantidad.getText());
				int cantidad = ObtenerInt(tFcantidad);				
				double precioUnitario = ObtenerDouble(tFprecio);

				double total = cantidad * precioUnitario;

				// Validar stock suficiente antes de proceder
				if (!ValidarYReducirStock(cantidad)) {
					return;
				}

				// Calcular descuento según cantidad
				
				if (cantidad >= 1 && cantidad <= 5) {
					importeDescuento = total * descuento1;
				} else if (cantidad >= 6 && cantidad <= 10) {
					importeDescuento = total * descuento2;
				} else if (cantidad >= 11 && cantidad <= 15) {
					importeDescuento = total * descuento3;
				} else if (cantidad > 15) {
					importeDescuento = total * descuento4;
				}

				// Calcular importe final
				double importePagar = total - importeDescuento;
				String totalFormateado = FormatearAdos(total);
				String descuentoFormateado = FormatearAdos(importeDescuento);
				String importePagarFormateado = FormatearAdos(importePagar);
				tFtotal.setText(totalFormateado);

				// Actualizar contadores
				cantidadVentas++;
				ImporteGeneral += importePagar;

				// Determinar obsequio
				
				if (cantidad == 1) {
					obsequio = obsequio1;
				} else if (cantidad >= 2 && cantidad <= 5) {
					obsequio = obsequio2a5;
				} else if (cantidad >= 6) {
					obsequio = obsequio6amas;
				} else {
					obsequio = "No aplica obsequio";
				}

				// Mostrar boleta en el área de texto
				MostrarDatosDeVenta();

				// Comprobar si corresponde mostrar felicitación por ventas
				Comprobar5ventas(cantidadVentas);


			}

			void MostrarDatosDeVenta() {
			// Mostrar datos de la venta
			textArea.setText(""); // Limpiar
			textArea.setFont(new Font("Roboto", Font.PLAIN, 12));
			textArea.append("---- Boleta de venta ---- 000"+cantidadVentas+"\n\n");
			textArea.append("Código: " + cBModelo.getSelectedItem() + "\n");
			textArea.append("Producto: " + tFproducto.getText() + "\n");
			textArea.append("Cantidad: " + tFcantidad.getText() + "\n");
			textArea.append("Precio Unitario: S/ " + tFprecio.getText() + "\n");
			textArea.append("Importe compra: S/ " + tFtotal.getText() + "\n");
			textArea.append("Descuento aplicado: S/ " + FormatearAdos(importeDescuento) + "\n");
			textArea.append("Importe a pagar: S/ " + FormatearAdos(ObtenerDouble(tFtotal) - importeDescuento) + "\n");
			textArea.append("Obsequio: " + obsequio);
		}
		});

		

		btnRealizarVenta.setForeground(Color.WHITE);
		btnRealizarVenta.setBackground(new Color(31, 64, 96));
		btnRealizarVenta.setBounds(242, 446, 120, 30);
		add(btnRealizarVenta);
		
		lblPrecioUnts = new JLabel("Precio (S/):");
		lblPrecioUnts.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecioUnts.setOpaque(true);
		lblPrecioUnts.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioUnts.setForeground(Color.WHITE);
		lblPrecioUnts.setBackground(new Color(51, 102, 153));
		lblPrecioUnts.setBounds(30, 198, 99, 22);
		add(lblPrecioUnts);
		
		tFprecio = new JTextField();
		tFprecio.setText("279.0");
		tFprecio.setEnabled(false);
		tFprecio.setColumns(10);
		tFprecio.setBounds(129, 198, 70, 22);
		add(tFprecio);
		
		lblPrecio_2 = new JLabel("Total (S/):");
		lblPrecio_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio_2.setOpaque(true);
		lblPrecio_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio_2.setForeground(Color.WHITE);
		lblPrecio_2.setBackground(new Color(51, 102, 153));
		lblPrecio_2.setBounds(229, 198, 99, 22);
		add(lblPrecio_2);
		
		tFtotal = new JTextField();
		tFtotal.setText("279.0");
		tFtotal.setEnabled(false);
		tFtotal.setColumns(10);
		tFtotal.setBounds(327, 198, 70, 22);
		add(tFtotal);
		
		tFproducto = new JTextField();
		tFproducto.setText("Intel");
		tFproducto.setEnabled(false);
		tFproducto.setColumns(10);
		tFproducto.setBounds(114, 117, 284, 22);
		add(tFproducto);
		
		
		ImageIcon imagen = new ImageIcon("iconvender.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(180, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		add(etiqueta2);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Inicio
				ConsultarPorCodigo();
				// Fin
			}
		});
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(new Color(31, 64, 96));
		btnConsultar.setBounds(91, 446, 120, 30);
		add(btnConsultar);
	}
	String FormatearAdos(double numero) {
		return String.format("%.2f", numero);
	}

// Numero de venta
// Total acumulado
// Porcentaje de cuota diaria

	void Comprobar5ventas(int numero) {
		if (numero % 5 == 0) {

			String linea_a_mostrar = "Felicidades, ha realizado " + cantidadVentas + " ventas"+
				"\n Ventas acumuladas: " + FormatearAdos(ImporteGeneral) + 
				"\n Pocentaje de la cuota diaria: " + FormatearAdos((ImporteGeneral / cuotaDiaria) * 100) + "%";
			MessageAlerts.getInstance().showMessage("Felicidades!", linea_a_mostrar, 
				MessageAlerts.MessageType.SUCCESS,
				MessageAlerts.OK_CANCEL_OPTION,
				new PopupCallbackAction() {
					
					@Override
					public void action(PopupController arg0, int arg1) {
						if (arg1 == MessageAlerts.OK_OPTION) {
							System.out.println("Ok Clicked");
						}
						
					}
				});
		}
	}

	void ValidadStockSuficiente(int cantidad, int stock) {
		if (cantidad > stock) {
			JOptionPane.showMessageDialog(null, "No hay suficiente stock para realizar la venta. Stock disponible: " + stock,
				"Error de stock", JOptionPane.ERROR_MESSAGE);
			return;
		}
		stock = stock - cantidad;
		return;
	}

	/**
	 * Valida si hay stock suficiente y reduce el stock del producto seleccionado
	 * @param cantidad Cantidad a vender
	 * @return true si hay stock suficiente, false si no
	 */
	boolean ValidarYReducirStock(int cantidad) {
		String codigo = cBModelo.getSelectedItem().toString();
		
		switch (codigo) {
			case "14030":
				if (cantidad > stock1) {
					JOptionPane.showMessageDialog(null, "No hay suficiente stock para realizar la venta. Stock disponible: " + stock1,
						"Error de stock", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				stock1 -= cantidad;
				stock_actual = stock1;
				break;
				
			case "17657":
				if (cantidad > stock2) {
					JOptionPane.showMessageDialog(null, "No hay suficiente stock para realizar la venta. Stock disponible: " + stock2,
						"Error de stock", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				stock2 -= cantidad;
				stock_actual = stock2;
				break;
				
			case "16850":
				if (cantidad > stock3) {
					JOptionPane.showMessageDialog(null, "No hay suficiente stock para realizar la venta. Stock disponible: " + stock3,
						"Error de stock", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				stock3 -= cantidad;
				stock_actual = stock3;
				break;
				
			case "16532":
				if (cantidad > stock4) {
					JOptionPane.showMessageDialog(null, "No hay suficiente stock para realizar la venta. Stock disponible: " + stock4,
						"Error de stock", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				stock4 -= cantidad;
				stock_actual = stock4;
				break;
				
			case "19503":
				if (cantidad > stock5) {
					JOptionPane.showMessageDialog(null, "No hay suficiente stock para realizar la venta. Stock disponible: " + stock5,
						"Error de stock", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				stock5 -= cantidad;
				stock_actual = stock5;
				break;
				
			case "11167":
				if (cantidad > stock6) {
					JOptionPane.showMessageDialog(null, "No hay suficiente stock para realizar la venta. Stock disponible: " + stock6,
						"Error de stock", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				stock6 -= cantidad;
				stock_actual = stock6;
				break;
				
			case "11657":
				if (cantidad > stock7) {
					JOptionPane.showMessageDialog(null, "No hay suficiente stock para realizar la venta. Stock disponible: " + stock7,
						"Error de stock", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				stock7 -= cantidad;
				stock_actual = stock7;
				break;
				
			case "12939":
				if (cantidad > stock8) {
					JOptionPane.showMessageDialog(null, "No hay suficiente stock para realizar la venta. Stock disponible: " + stock8,
						"Error de stock", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				stock8 -= cantidad;
				stock_actual = stock8;
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Código de producto no válido",
					"Error", JOptionPane.ERROR_MESSAGE);
				return false;
		}
		
		return true;
	}
	@Override
	public void formOpen() {
		super.formOpen();
		// Centrar el contenido cuando el formulario se abre
		centrarTabbedForm.centerContent(this);
	}

	int ObtenerInt(JTextField tF) {
			return Integer.parseInt(tF.getText());
		}

	double ObtenerDouble(JTextField tF) {
			return Double.parseDouble(tF.getText());
		}

	void ConsultarPorCodigo() {
		String codigo = cBModelo.getSelectedItem().toString();
				
				
				switch (codigo) {
					case "14030":
						tFproducto.setText(String.valueOf(producto1));
						tFdescripcion.setText(String.valueOf(descripcion1));
						tFprecio.setText(String.valueOf(precio1));
						stock_actual = stock1; // Actualizar el stock actual
						break;
					
					case "17657":
						tFproducto.setText(String.valueOf(producto2));
						tFdescripcion.setText(String.valueOf(descripcion2));
						tFprecio.setText(String.valueOf(precio2));
						stock_actual = stock2; // Actualizar el stock actual
						break;

					case "16850":
						tFproducto.setText(String.valueOf(producto3));
						tFdescripcion.setText(String.valueOf(descripcion3));
						tFprecio.setText(String.valueOf(precio3));
						stock_actual = stock3; // Actualizar el stock actual
						break;
					
					case "16532":
						tFproducto.setText(String.valueOf(producto4));
						tFdescripcion.setText(String.valueOf(descripcion4));
						tFprecio.setText(String.valueOf(precio4));
						stock_actual = stock4; // Actualizar el stock actual
						break;
						
					case "19503":
						tFproducto.setText(String.valueOf(producto5));
						tFdescripcion.setText(String.valueOf(descripcion5));
						tFprecio.setText(String.valueOf(precio5));
						stock_actual = stock5; // Actualizar el stock actual
						break;
						
					case "11167":
						tFproducto.setText(String.valueOf(producto6));
						tFdescripcion.setText(String.valueOf(descripcion6));
						tFprecio.setText(String.valueOf(precio6));
						stock_actual = stock6; // Actualizar el stock actual
						break;
					
					case "11657":
						tFproducto.setText(String.valueOf(producto7));
						tFdescripcion.setText(String.valueOf(descripcion7));
						tFprecio.setText(String.valueOf(precio7));
						stock_actual = stock7; // Actualizar el stock actual
						break;

					case "12939":
						tFproducto.setText(String.valueOf(producto8));
						tFdescripcion.setText(String.valueOf(descripcion8));
						tFprecio.setText(String.valueOf(precio8));
						stock_actual = stock8; // Actualizar el stock actual
						break;
				}
	}

}
