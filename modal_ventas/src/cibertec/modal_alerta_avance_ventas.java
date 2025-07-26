package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class modal_alerta_avance_ventas extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblImporteTotalGeneral;
	private JLabel lblPorcentajeDeLa;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_alerta_avance_ventas frame = new modal_alerta_avance_ventas();
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
	public modal_alerta_avance_ventas() {
		setTitle("Anuncio: Avance de ventas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Venta Nro. 5");
		lblNewLabel.setBounds(63, 11, 361, 14);
		contentPane.add(lblNewLabel);
		
		lblImporteTotalGeneral = new JLabel("Importe total general acumulado : S/. 13,167.38");
		lblImporteTotalGeneral.setBounds(63, 36, 361, 14);
		contentPane.add(lblImporteTotalGeneral);
		
		lblPorcentajeDeLa = new JLabel("Porcentaje de la cuota diaria: 26.33%");
		lblPorcentajeDeLa.setBounds(63, 61, 361, 14);
		contentPane.add(lblPorcentajeDeLa);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(163, 101, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\KDW_L\\Downloads\\Brave Downloads\\warning_blue (1).png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(0, 11, 56, 50);
		contentPane.add(lblNewLabel_1);
	}

}
