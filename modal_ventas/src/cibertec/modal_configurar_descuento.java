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

public class modal_configurar_descuento extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

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
		setBounds(100, 100, 450, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 26, 134, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("6 a 10 unidades");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 51, 134, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("11 a 15 unidades");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 76, 134, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("m\u00E1s de 15 unidades");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 101, 134, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setText("7.5");
		textField.setBounds(154, 23, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("10.0");
		textField_1.setColumns(10);
		textField_1.setBounds(154, 48, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("12.5");
		textField_2.setColumns(10);
		textField_2.setBounds(154, 73, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("15.0");
		textField_3.setColumns(10);
		textField_3.setBounds(154, 98, 86, 20);
		contentPane.add(textField_3);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(250, 26, 22, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(250, 51, 22, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(250, 76, 22, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("%");
		lblNewLabel_8.setBounds(250, 101, 22, 14);
		contentPane.add(lblNewLabel_8);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(335, 22, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(335, 51, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
