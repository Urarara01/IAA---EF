package cibertec;

import static variables.ProductoInventario.obsequio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import static variables.ProductoInventario.*;

public class modal_configurar_obsequios extends JFrame {

	private JPanel contentPane;
	private JLabel lblObsequios;
	private JSeparator separator;
	private JButton btnAceptar;
	private JButton btnCancelar_1;
	private JTextField tFobsequio1;
	private JTextField tFobsequio2a5;
	private JTextField tFobsequio6amas;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblUnidad;
	private JLabel etiqueta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_configurar_obsequios frame = new modal_configurar_obsequios();
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
	public modal_configurar_obsequios() {
		setTitle("Configurar obsequios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblObsequios = new JLabel("Obsequios");
		lblObsequios.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblObsequios.setBounds(18, 11, 241, 34);
		contentPane.add(lblObsequios);
		
		separator = new JSeparator();
		separator.setBounds(16, 56, 408, 2);
		contentPane.add(separator);
		
		btnAceptar = new JButton("Consultar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarObsequios();
			}
		});
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setBackground(new Color(31, 64, 96));
		btnAceptar.setBounds(309, 72, 105, 30);
		contentPane.add(btnAceptar);
		
		btnCancelar_1 = new JButton("Cerrar");
		btnCancelar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar_1.setForeground(Color.WHITE);
		btnCancelar_1.setBackground(new Color(31, 64, 96));
		btnCancelar_1.setBounds(309, 146, 105, 30);
		contentPane.add(btnCancelar_1);
		
		tFobsequio1 = new JTextField();

		tFobsequio1.setText(obsequio1);
		tFobsequio1.setColumns(10);
		tFobsequio1.setBounds(171, 76, 86, 22);
		contentPane.add(tFobsequio1);
		
		tFobsequio2a5 = new JTextField();
		tFobsequio2a5.setText(obsequio2a5);
		tFobsequio2a5.setColumns(10);
		tFobsequio2a5.setBounds(171, 113, 86, 22);
		contentPane.add(tFobsequio2a5);
		
		tFobsequio6amas = new JTextField();
		tFobsequio6amas.setText(obsequio6amas);
		tFobsequio6amas.setColumns(10);
		tFobsequio6amas.setBounds(171, 150, 86, 22);
		contentPane.add(tFobsequio6amas);
		
		lblNewLabel_2 = new JLabel("6 a m\u00E1s unidades");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBackground(new Color(51, 102, 153));
		lblNewLabel_2.setBounds(38, 150, 134, 22);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("2 a 5 unidades");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBackground(new Color(51, 102, 153));
		lblNewLabel_3.setBounds(38, 113, 134, 22);
		contentPane.add(lblNewLabel_3);
		
		lblUnidad = new JLabel("1 unidad");
		lblUnidad.setOpaque(true);
		lblUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnidad.setForeground(Color.WHITE);
		lblUnidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUnidad.setBackground(new Color(51, 102, 153));
		lblUnidad.setBounds(38, 76, 134, 22);
		contentPane.add(lblUnidad);
		
		
		ImageIcon imagen = new ImageIcon("iconobsequios.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(120, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta2);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarObsequios(tFobsequio1, tFobsequio2a5, tFobsequio6amas);
			}
		});
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBackground(new Color(31, 64, 96));
		btnModificar.setBounds(309, 109, 105, 30);
		contentPane.add(btnModificar);
	}

	String ObtenerValorDeTextField(JTextField textField) {
		return textField.getText();
	}

	void ConsultarObsequios() {
		tFobsequio1.setText(obsequio1);
		tFobsequio2a5.setText(obsequio2a5);
		tFobsequio6amas.setText(obsequio6amas);
	}
		
	void ModificarObsequios() {
		obsequio1 = ObtenerValorDeTextField(tFobsequio1);
		obsequio2a5 = ObtenerValorDeTextField(tFobsequio2a5);
		obsequio6amas = ObtenerValorDeTextField(tFobsequio6amas);
	}

	void ModificarObsequios(JTextField tFobsequio1, JTextField tFobsequio2a5, JTextField tFobsequio6amas) {
		ModificarObsequios();
	}
}
