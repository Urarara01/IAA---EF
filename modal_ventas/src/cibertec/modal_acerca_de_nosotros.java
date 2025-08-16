package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Window.Type;

public class modal_acerca_de_nosotros extends JFrame {
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private final JPanel panel_2 = new JPanel();
	private JLabel lblAcercaDeNosotros;
	private JLabel lblimage;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel etiqueta2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_acerca_de_nosotros frame = new modal_acerca_de_nosotros();
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
	public modal_acerca_de_nosotros() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setTitle("Acerca de nosotros");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(228, 220, 209));
		panel_1.setBounds(204, 0, 230, 261);
		panel.add(panel_1);
		
		// DESDE AQUI ES LA EDICIÓN
		lblimage = new JLabel("");
		lblimage.setBounds(0, 0, 230, 261);

		// Escalar la imagen al tamaño del JLabel
		ImageIcon originalIcon = new ImageIcon(modal_acerca_de_nosotros.class.getResource("/imagenes/Manitas.png"));
		Image scaledImage = originalIcon.getImage().getScaledInstance(
		    lblimage.getWidth(),
		    lblimage.getHeight(),
		    Image.SCALE_SMOOTH
		);
		panel_1.setLayout(null);
		lblimage.setIcon(new ImageIcon(scaledImage));

		panel_1.add(lblimage);
		panel_1.add(lblimage);
		panel_2.setBackground(new Color(242, 249, 255));
		panel_2.setBounds(0, 0, 205, 261);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		lblAcercaDeNosotros = new JLabel("Acerca de nosotros");
		lblAcercaDeNosotros.setForeground(new Color(31, 64, 96));
		lblAcercaDeNosotros.setBounds(10, 76, 185, 37);
		lblAcercaDeNosotros.setFont(new Font("Roboto", Font.BOLD, 18));
		lblAcercaDeNosotros.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblAcercaDeNosotros);
		
		ImageIcon imagen = new ImageIcon("iconviñetas.png");
		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(23, 124, 14, 14);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta2);
		
		lblNewLabel_1 = new JLabel("Luis Ernesto Sanchez");
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1.setBounds(40, 124, 120, 14);
		panel_2.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Christiam Araujo Hencke");
		lblNewLabel_2.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_2.setBounds(40, 149, 143, 14);
		panel_2.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Angel Acu\u00F1a Lobaton");
		lblNewLabel_3.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_3.setBounds(40, 174, 143, 14);
		panel_2.add(lblNewLabel_3);
		
		
		
		
		
		
	}
}
