package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesUtiles.FlatLab;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modal_login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tFusuario;
	private JPasswordField pFpass;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	public static String usuario, password;
	public static int error_login = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatLab.setup();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modal_login frame = new modal_login();
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
	public modal_login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(24, 29, 112, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1.setBounds(24, 74, 112, 14);
		contentPane.add(lblNewLabel_1);
		
		tFusuario = new JTextField();
		tFusuario.setBounds(146, 26, 86, 20);
		contentPane.add(tFusuario);
		tFusuario.setColumns(10);
		
		pFpass = new JPasswordField();
		pFpass.setBounds(146, 71, 86, 14);
		contentPane.add(pFpass);
		
		btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(91, 188, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(227, 188, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		
		tFusuario.setText("");
		pFpass.setText("");
		tFusuario.requestFocus();
		
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		usuario = tFusuario.getText();
		password = pFpass.getText();
		
		if (usuario.equals("Admin") && password.equals("1234")) {
			modal_login.this.dispose(); // Cerrar la ventana y continuar con el programa
			JOptionPane.showMessageDialog(
					null, 
					"Bienvenido al sistema", 
					"Ingreso Correcto",
					JOptionPane.INFORMATION_MESSAGE
					);
			menuPrincipal abrir = new menuPrincipal();
			abrir.setExtendedState(MAXIMIZED_BOTH);
			abrir.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta","Error. . .",
					JOptionPane.ERROR_MESSAGE
					);
			tFusuario.setText("");
			pFpass.setText("");
			tFusuario.requestFocus();
			error_login = error_login+1;
			if (error_login == 3) {
				JOptionPane.showMessageDialog(null,
						"Comuníquese con el soporte",
						"Usuario bloqueado",
						JOptionPane.ERROR_MESSAGE);
				modal_login.this.dispose();
			}
		}
		
		
	}
}
