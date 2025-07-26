package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class modal_modificar_producto extends JFrame {

	private JPanel contentPane;
	private JLabel lblModelo;
	private JLabel lblIdDelProducto;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tFPrecio;
	private JLabel lblNewLabel_3;
	private JTextField tFMarca;
	private JTextField tFId;
	private JComboBox cBModelo;
	private JButton btnGuardar;
	private JButton btnCerrar;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_modificar_producto frame = new modal_modificar_producto();
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
	public modal_modificar_producto() {
		setTitle("Modificar producto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblModelo = new JLabel("C\u00F3digo:");
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setBounds(22, 29, 103, 14);
		contentPane.add(lblModelo);
		
		lblIdDelProducto = new JLabel("Cantidad:");
		lblIdDelProducto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdDelProducto.setBounds(22, 62, 103, 14);
		contentPane.add(lblIdDelProducto);
		
		lblNewLabel = new JLabel("Descripci\u00F3n:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(22, 95, 103, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(21, 124, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Precio unitario:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(21, 154, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		tFPrecio = new JTextField();
		tFPrecio.setText("279.0");
		tFPrecio.setColumns(10);
		tFPrecio.setBounds(129, 152, 161, 20);
		contentPane.add(tFPrecio);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\memoriaram.png"));
		lblNewLabel_3.setBounds(123, 209, 170, 100);
		contentPane.add(lblNewLabel_3);
		
		tFMarca = new JTextField();
		tFMarca.setText("PROCESADOR INTEL CORE I3 10105F 3.7GHZ");
		tFMarca.setColumns(10);
		tFMarca.setBounds(129, 93, 161, 20);
		contentPane.add(tFMarca);
		
		tFId = new JTextField();
		tFId.setText("24");
		tFId.setColumns(10);
		tFId.setBounds(128, 59, 161, 22);
		contentPane.add(tFId);
		
		cBModelo = new JComboBox();
		cBModelo.setModel(new DefaultComboBoxModel(new String[] {"01234", "01235", "01236", "01568"}));
		cBModelo.setBounds(128, 24, 161, 22);
		contentPane.add(cBModelo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(321, 22, 89, 23);
		contentPane.add(btnGuardar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(320, 52, 89, 22);
		contentPane.add(btnCerrar);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"INTEL", "MSI", "APACE", "AMD", "NVIDIA"}));
		comboBox.setBounds(129, 120, 161, 18);
		contentPane.add(comboBox);
	}
}
