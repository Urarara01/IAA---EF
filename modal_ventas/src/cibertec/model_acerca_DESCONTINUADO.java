package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class model_acerca_DESCONTINUADO extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblAutores;
	private JLabel lblLuisErnestoSanchez;
	private JLabel lblAutores_2;
	private JLabel lblAutores_3;
	private JLabel lblAutores_4;
	private JLabel lblAutores_5;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					model_acerca_DESCONTINUADO frame = new model_acerca_DESCONTINUADO();
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
	public model_acerca_DESCONTINUADO() {
		setTitle("Acerca de la tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Tienda 1.0");
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(137, 11, 133, 57);
		contentPane.add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(10, 66, 414, 18);
		contentPane.add(separator);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
		lblAutores.setBounds(137, 78, 133, 32);
		contentPane.add(lblAutores);
		
		lblLuisErnestoSanchez = new JLabel("Luis Ernesto Sanchez");
		lblLuisErnestoSanchez.setHorizontalAlignment(SwingConstants.CENTER);
		lblLuisErnestoSanchez.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		lblLuisErnestoSanchez.setBounds(99, 121, 208, 18);
		contentPane.add(lblLuisErnestoSanchez);
		
		lblAutores_2 = new JLabel("Christiam Araujo Hencke");
		lblAutores_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores_2.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		lblAutores_2.setBounds(99, 150, 208, 18);
		contentPane.add(lblAutores_2);
		
		lblAutores_3 = new JLabel("Yv\u00E1n Vilchez Bellido");
		lblAutores_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores_3.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		lblAutores_3.setBounds(99, 179, 208, 18);
		contentPane.add(lblAutores_3);
		
		lblAutores_4 = new JLabel("Artuco Acu\u00F1a Lobaton");
		lblAutores_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores_4.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		lblAutores_4.setBounds(99, 208, 208, 18);
		contentPane.add(lblAutores_4);
		
		lblAutores_5 = new JLabel("Williams Altamirano");
		lblAutores_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores_5.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		lblAutores_5.setBounds(99, 237, 208, 18);
		contentPane.add(lblAutores_5);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\KDW_L\\Downloads\\Brave Downloads\\pngwing.com (1).png"));
		lblNewLabel_1.setBounds(10, 0, 117, 68);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\KDW_L\\Downloads\\Brave Downloads\\PngItem_3708742 (1).png"));
		lblNewLabel_2.setBounds(307, 0, 117, 68);
		contentPane.add(lblNewLabel_2);
	}
}
