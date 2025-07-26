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

public class modal_consultar_producto extends JFrame {

	private JPanel contentPane;
	private JButton btnConsultar;
	private JButton btnNuevo;
	private JButton btnNewButton;
	private JLabel lblModelo;
	private JComboBox cBModelo;
	private JLabel lblIdDelProducto;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_consultar_producto frame = new modal_consultar_producto();
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
	public modal_consultar_producto() {
		setTitle("Consultar Producto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(324, 21, 89, 23);
		contentPane.add(btnConsultar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(323, 51, 89, 22);
		contentPane.add(btnNuevo);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.setBounds(324, 80, 89, 22);
		contentPane.add(btnNewButton);
		
		lblModelo = new JLabel("C\u00F3digo:");
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setBounds(11, 26, 103, 14);
		contentPane.add(lblModelo);
		
		cBModelo = new JComboBox();
		cBModelo.setModel(new DefaultComboBoxModel(new String[] {"01234", "01235", "01236", "01568"}));
		cBModelo.setBounds(117, 21, 161, 22);
		contentPane.add(cBModelo);
		
		lblIdDelProducto = new JLabel("Cantidad:");
		lblIdDelProducto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdDelProducto.setBounds(11, 59, 103, 14);
		contentPane.add(lblIdDelProducto);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setText("24");
		textField.setColumns(10);
		textField.setBounds(117, 56, 161, 22);
		contentPane.add(textField);
		
		lblNewLabel = new JLabel("Descripci\u00F3n:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(11, 92, 103, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setText("PROCESADOR INTEL CORE I3 10105F 3.7GHZ");
		textField_1.setColumns(10);
		textField_1.setBounds(118, 90, 161, 20);
		contentPane.add(textField_1);
		
		lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 121, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"INTEL", "MSI", "APACE", "AMD", "NVIDIA"}));
		comboBox.setEnabled(false);
		comboBox.setBounds(118, 117, 161, 18);
		contentPane.add(comboBox);
		
		lblNewLabel_2 = new JLabel("Precio unitario:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 151, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setText("279.0");
		textField_2.setColumns(10);
		textField_2.setBounds(118, 149, 161, 20);
		contentPane.add(textField_2);
	}

}
