package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;

public class modal_configurar_descuento extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tFDescuento1;
	private JTextField tFDescuento2;
	private JTextField tFDescuento3;
	private JTextField tFDescuento4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblPorcentajeDeDescuento;
	private JSeparator separator;
	private JLabel etiqueta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_configurar_descuento frame = new modal_configurar_descuento();
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
	public modal_configurar_descuento() {
		setTitle("Porcentajes de descuento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(new Color(51, 102, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(39, 76, 134, 22);
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("6 a 10 unidades");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(new Color(51, 102, 153));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(39, 113, 134, 22);
		lblNewLabel_1.setOpaque(true);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("11 a 15 unidades");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(new Color(51, 102, 153));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(39, 150, 134, 22);
		lblNewLabel_2.setOpaque(true);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("m\u00E1s de 15 unidades");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBackground(new Color(51, 102, 153));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(39, 187, 134, 22);
		lblNewLabel_3.setOpaque(true);
		contentPane.add(lblNewLabel_3);
		
		tFDescuento1 = new JTextField();
		tFDescuento1.setText("7.5");
		tFDescuento1.setBounds(172, 76, 86, 22);
		contentPane.add(tFDescuento1);
		tFDescuento1.setColumns(10);
		
		tFDescuento2 = new JTextField();
		tFDescuento2.setText("10.0");
		tFDescuento2.setColumns(10);
		tFDescuento2.setBounds(172, 113, 86, 22);
		contentPane.add(tFDescuento2);
		
		tFDescuento3 = new JTextField();
		tFDescuento3.setText("12.5");
		tFDescuento3.setColumns(10);
		tFDescuento3.setBounds(172, 150, 86, 22);
		contentPane.add(tFDescuento3);
		
		tFDescuento4 = new JTextField();
		tFDescuento4.setText("15.0");
		tFDescuento4.setColumns(10);
		tFDescuento4.setBounds(172, 187, 86, 22);
		contentPane.add(tFDescuento4);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(258, 76, 22, 22);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(258, 113, 22, 22);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(258, 150, 22, 22);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("%");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(258, 187, 22, 22);
		contentPane.add(lblNewLabel_8);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setBackground(new Color(31, 64, 96));
		btnAceptar.setBounds(310, 75, 105, 30);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(new Color(31, 64, 96));
		btnCancelar.setBounds(310, 117, 105, 30);
		contentPane.add(btnCancelar);
		
		lblPorcentajeDeDescuento = new JLabel("Porcentaje de Descuento");
		lblPorcentajeDeDescuento.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPorcentajeDeDescuento.setBounds(19, 11, 241, 34);
		contentPane.add(lblPorcentajeDeDescuento);
		
		
		
		separator = new JSeparator();
		separator.setBounds(17, 56, 408, 2);
		contentPane.add(separator);
		
		ImageIcon imagen = new ImageIcon("icondescuentos.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(255, 9, 40, 40);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta2);
		
		
		
		
	}

}
