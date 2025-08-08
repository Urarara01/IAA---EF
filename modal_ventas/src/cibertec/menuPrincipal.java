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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenu mnRedesSociales;
	private JMenuItem mntmCerrar;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmListar;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmDescuentos;
	private JMenuItem mntmObsequios;
	private JMenuItem mntmCantidad;
	private JMenuItem mntmAcerca;
	private JMenuItem mntmFacebook;
	private JMenuItem mntmInstagram;
	private JMenuItem mntmGmail;
	private JMenuItem mntmCuotas;

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
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnArchivo);
		
		mntmCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(mntmCerrar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnMantenimiento);
		
		mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modal_consultar_producto consultar = new modal_consultar_producto();
				consultar.setLocationRelativeTo(mntmConsultar);
				consultar.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmConsultar);
		
		mntmModificar = new JMenuItem("Modificar");
		mnMantenimiento.add(mntmModificar);
		
		mntmListar = new JMenuItem("Listar");
		mnMantenimiento.add(mntmListar);
		
		mnVentas = new JMenu("Ventas");
		mnVentas.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuracion");
		mnConfiguracion.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnConfiguracion);
		
		mntmDescuentos = new JMenuItem("Descuentos");
		mnConfiguracion.add(mntmDescuentos);
		
		mntmObsequios = new JMenuItem("Obsequios");
		mnConfiguracion.add(mntmObsequios);
		
		mntmCantidad = new JMenuItem("Cantidad");
		mnConfiguracion.add(mntmCantidad);
		
		mntmCuotas = new JMenuItem("Cuotas");
		mnConfiguracion.add(mntmCuotas);
		
		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnAyuda);
		
		mntmAcerca = new JMenuItem("Acerca");
		mnAyuda.add(mntmAcerca);
		
		mnRedesSociales = new JMenu("Redes Sociales");
		mnRedesSociales.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnRedesSociales);
		
		mntmFacebook = new JMenuItem("Facebook");
		mnRedesSociales.add(mntmFacebook);
		
		mntmInstagram = new JMenuItem("Instagram");
		mnRedesSociales.add(mntmInstagram);
		
		mntmGmail = new JMenuItem("GMAIL");
		mnRedesSociales.add(mntmGmail);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
