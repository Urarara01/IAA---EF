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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class modal_configurar_obsequios extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblAMs;
	private JTextField txtCafetera;
	private JTextField txtLicuadora;
	private JTextField txtExtractor;
	private JButton btnNewButton;
	private JButton btnCancelar;
	private JLabel lblNewLabel_1;

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
		setBounds(100, 100, 450, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("1 unidad");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 27, 111, 14);
		contentPane.add(lblNewLabel);
		
		lblA = new JLabel("2 a 5 unidades");
		lblA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblA.setBounds(10, 54, 111, 14);
		contentPane.add(lblA);
		
		lblAMs = new JLabel("6 a m\u00E1s unidades");
		lblAMs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAMs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAMs.setBounds(10, 84, 111, 14);
		contentPane.add(lblAMs);
		
		txtCafetera = new JTextField();
		txtCafetera.setText("Mousepad");
		txtCafetera.setToolTipText("");
		txtCafetera.setBounds(129, 27, 111, 20);
		contentPane.add(txtCafetera);
		txtCafetera.setColumns(10);
		
		txtLicuadora = new JTextField();
		txtLicuadora.setText("Memoria nvme");
		txtLicuadora.setColumns(10);
		txtLicuadora.setBounds(129, 55, 111, 20);
		contentPane.add(txtLicuadora);
		
		txtExtractor = new JTextField();
		txtExtractor.setText("Disco 1tb");
		txtExtractor.setColumns(10);
		txtExtractor.setBounds(129, 82, 111, 20);
		contentPane.add(txtExtractor);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(308, 23, 89, 23);
		contentPane.add(btnNewButton);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(308, 54, 89, 23);
		contentPane.add(btnCancelar);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\KDW_L\\Downloads\\Brave Downloads\\3862dc65def9cd83ed07871f487d8000-regalo-de-cumpleanos-alegre (1).png"));
		lblNewLabel_1.setBounds(318, 84, 56, 56);
		contentPane.add(lblNewLabel_1);
	}
}
