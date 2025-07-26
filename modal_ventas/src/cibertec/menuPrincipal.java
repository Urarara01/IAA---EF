package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Color;

public class menuPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenu mnNewMenu_5;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;
	private JMenuItem mntmNewMenuItem_12;
	private JMenuItem mntmNewMenuItem_13;
	private JMenuItem mntmNewMenuItem_14;
	private JMenuItem mntmNewMenuItem_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuPrincipal frame = new menuPrincipal();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public menuPrincipal() {
		setTitle("Software de ventas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 339);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(64, 128, 128));
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Cerrar");
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("Mantenimiento");
		mnNewMenu_1.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_1 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Modificar");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Listar");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mnNewMenu_2 = new JMenu("Ventas");
		mnNewMenu_2.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_4 = new JMenuItem("Vender");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Generar Reportes");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		mnNewMenu_3 = new JMenu("Configuracion");
		mnNewMenu_3.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_7 = new JMenuItem("Descuentos");
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Obsequios");
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_9 = new JMenuItem("Cantidad");
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		mntmNewMenuItem_6 = new JMenuItem("Cuotas");
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		mnNewMenu_4 = new JMenu("Ayuda");
		mnNewMenu_4.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnNewMenu_4);
		
		mntmNewMenuItem_10 = new JMenuItem("Acerca");
		mnNewMenu_4.add(mntmNewMenuItem_10);
		
		mnNewMenu_5 = new JMenu("Redes Sociales");
		mnNewMenu_5.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnNewMenu_5);
		
		mntmNewMenuItem_12 = new JMenuItem("Facebook");
		mnNewMenu_5.add(mntmNewMenuItem_12);
		
		mntmNewMenuItem_13 = new JMenuItem("Instagram");
		mnNewMenu_5.add(mntmNewMenuItem_13);
		
		mntmNewMenuItem_14 = new JMenuItem("GMAIL");
		mnNewMenu_5.add(mntmNewMenuItem_14);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
