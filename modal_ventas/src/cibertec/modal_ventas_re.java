package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class modal_ventas_re extends JFrame {

	private JPanel contentPane;
	private JComboBox cBModelo;
	private JLabel lblModelo;
	private JLabel lblIdDelProducto;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_ventas_re frame = new modal_ventas_re();
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
	public modal_ventas_re() {
		setTitle("vender producto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cBModelo = new JComboBox();
		cBModelo.setModel(new DefaultComboBoxModel(new String[] {"01234", "01235", "01236", "01568"}));
		cBModelo.setBounds(117, 11, 161, 22);
		contentPane.add(cBModelo);
		
		lblModelo = new JLabel("C\u00F3digo:");
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setBounds(11, 16, 103, 14);
		contentPane.add(lblModelo);
		
		lblIdDelProducto = new JLabel("Cantidad:");
		lblIdDelProducto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdDelProducto.setBounds(11, 49, 103, 14);
		contentPane.add(lblIdDelProducto);
		
		textField = new JTextField();
		textField.setText("24");
		textField.setColumns(10);
		textField.setBounds(117, 46, 161, 22);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("PROCESADOR INTEL CORE I3 10105F 3.7GHZ");
		textField_1.setColumns(10);
		textField_1.setBounds(118, 80, 161, 20);
		contentPane.add(textField_1);
		
		lblNewLabel = new JLabel("Descripci\u00F3n:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(11, 82, 103, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 111, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"INTEL", "MSI", "APACE", "AMD", "NVIDIA"}));
		comboBox.setBounds(118, 107, 161, 18);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setText("279.0");
		textField_2.setColumns(10);
		textField_2.setBounds(118, 139, 161, 20);
		contentPane.add(textField_2);
		
		lblNewLabel_2 = new JLabel("Precio unitario:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 141, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Precio total(S/):");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(10, 173, 104, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setText("6,696.0");
		textField_3.setColumns(10);
		textField_3.setBounds(117, 170, 161, 20);
		contentPane.add(textField_3);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 216, 413, 167);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnNewButton_1 = new JButton("Cerrar");
		btnNewButton_1.setBounds(288, 45, 120, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Realizar venta");
		btnNewButton_2.setBounds(288, 11, 120, 23);
		contentPane.add(btnNewButton_2);
	}
}
