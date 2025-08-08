package cibertec;

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

public class modal_configurar_obsequios extends JFrame {

	private JPanel contentPane;
	private JLabel lblObsequios;
	private JSeparator separator;
	private JButton btnAceptar;
	private JButton btnCancelar_1;
	private JTextField txtMousepad;
	private JTextField txtMemoriaNvme;
	private JTextField txtDiscotb;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setBackground(new Color(31, 64, 96));
		btnAceptar.setBounds(309, 75, 105, 30);
		contentPane.add(btnAceptar);
		
		btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.setForeground(Color.WHITE);
		btnCancelar_1.setBackground(new Color(31, 64, 96));
		btnCancelar_1.setBounds(309, 117, 105, 30);
		contentPane.add(btnCancelar_1);
		
		txtMousepad = new JTextField();
		txtMousepad.setText("Mousepad");
		txtMousepad.setColumns(10);
		txtMousepad.setBounds(171, 76, 86, 22);
		contentPane.add(txtMousepad);
		
		txtMemoriaNvme = new JTextField();
		txtMemoriaNvme.setText("Memoria nvme");
		txtMemoriaNvme.setColumns(10);
		txtMemoriaNvme.setBounds(171, 113, 86, 22);
		contentPane.add(txtMemoriaNvme);
		
		txtDiscotb = new JTextField();
		txtDiscotb.setText("Disco 1tb");
		txtDiscotb.setColumns(10);
		txtDiscotb.setBounds(171, 150, 86, 22);
		contentPane.add(txtDiscotb);
		
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
		
				
		
		
	}
}
