package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import cibertec.LoginForm_DESCONTINUADO;

import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm_DESCONTINUADO extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tFUsuario;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;
	private JLabel lblUsuario;
	private JLabel lblpassword;
	private JButton btningresar;
	private JButton btncerrar;
	private static String usuario, clave;
	public static int error=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm_DESCONTINUADO frame = new LoginForm_DESCONTINUADO();
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
	public LoginForm_DESCONTINUADO() {
		setResizable(false);
		
		//Deshabilitar el boton de maximizar
		setSize(400, 300);
		//setResizable(false);
		setTitle("404 Not Found");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm_DESCONTINUADO.class.getResource("/img/img/iconoLogin.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.window, SystemColor.window, SystemColor.window, SystemColor.window));
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(SystemColor.activeCaption);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tFUsuario = new JTextField();
		tFUsuario.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tFUsuario.setBounds(90, 238, 197, 32);
		contentPane.add(tFUsuario);
		tFUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(90, 294, 197, 32);
		contentPane.add(passwordField);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginForm_DESCONTINUADO.class.getResource("/img/img/iconoLoginChico.png")));
		lblNewLabel_1.setBounds(112, 30, 125, 115);
		contentPane.add(lblNewLabel_1);
		
		lblUsuario = new JLabel("");
		lblUsuario.setIcon(new ImageIcon(LoginForm_DESCONTINUADO.class.getResource("/img/img/iconoUsuarioPequeño.png")));
		lblUsuario.setBounds(41, 244, 32, 32);
		contentPane.add(lblUsuario);
		
		lblpassword = new JLabel("");
		lblpassword.setIcon(new ImageIcon(LoginForm_DESCONTINUADO.class.getResource("/img/img/iconoPasswordPequeño.png")));
		lblpassword.setBounds(41, 300, 32, 32);
		contentPane.add(lblpassword);
		
		setLocationRelativeTo(null); //Centra la ventana
		
		btningresar = new JButton("Ingresar");
		btningresar.addActionListener(this);
		btningresar.setBorder(new CompoundBorder());
		btningresar.setBounds(41, 353, 108, 40);
		contentPane.add(btningresar);
		
		btncerrar = new JButton("Cerrar");
		btncerrar.addActionListener(this);
		btncerrar.setBounds(195, 353, 102, 40);
		contentPane.add(btncerrar);
	}
	
	protected void actionPerformedBtncerrar(ActionEvent e) {
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btningresar) {
			actionPerformedBtningresar(e);
		}
	}
	protected void actionPerformedBtningresar(ActionEvent e) {
		
		usuario=tFUsuario.getText();
		clave=passwordField.getText();
		if (usuario.equals("Admin") && clave.equals("1234")) {
			LoginForm_DESCONTINUADO.this.dispose();
			JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "Ingreso Correcto", JOptionPane.INFORMATION_MESSAGE);
			menuPrincipal abrir=new menuPrincipal();
			abrir.setExtendedState(MAXIMIZED_BOTH);
			abrir.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null, "USuario y Password Incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
			tFUsuario.setText("");
			passwordField.setText("");
			tFUsuario.requestFocus();
			error=error+1;
			if(error==3) {
				JOptionPane.showMessageDialog(null, "Comuniquese con el Servicio Tecnico", "Usuario Bloqueado", JOptionPane.ERROR_MESSAGE);
				LoginForm_DESCONTINUADO.this.dispose();
			}
		}
	}
}
