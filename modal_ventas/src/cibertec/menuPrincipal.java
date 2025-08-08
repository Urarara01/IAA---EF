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
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuPrincipal extends JFrame implements ActionListener {

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
		menuBar.setBackground(new Color(51, 102, 153));
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setForeground(Color.WHITE);
		mnArchivo.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnArchivo);
		
		mntmCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(mntmCerrar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setForeground(Color.WHITE);
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
		mntmModificar.addActionListener(this);
		mnMantenimiento.add(mntmModificar);
		
		mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(this);
		mnMantenimiento.add(mntmListar);
		
		mnVentas = new JMenu("Ventas");
		mnVentas.setForeground(Color.WHITE);
		mnVentas.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuracion");
		mnConfiguracion.setForeground(Color.WHITE);
		mnConfiguracion.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnConfiguracion);
		
		mntmDescuentos = new JMenuItem("Descuentos");
		mntmDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmDescuentos);
		
		mntmObsequios = new JMenuItem("Obsequios");
		mntmObsequios.addActionListener(this);
		mnConfiguracion.add(mntmObsequios);
		
		mntmCantidad = new JMenuItem("Cantidad");
		mnConfiguracion.add(mntmCantidad);
		
		mntmCuotas = new JMenuItem("Cuotas");
		mnConfiguracion.add(mntmCuotas);
		
		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setForeground(Color.WHITE);
		mnAyuda.setFont(new Font("Calibri", Font.BOLD, 15));
		menuBar.add(mnAyuda);
		
		mntmAcerca = new JMenuItem("Acerca");
		mntmAcerca.addActionListener(this);
		mnAyuda.add(mntmAcerca);
		
		mnRedesSociales = new JMenu("Redes Sociales");
		mnRedesSociales.setForeground(Color.WHITE);
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

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcerca) {
			actionPerformedMntmAcerca(e);
		}
		if (e.getSource() == mntmObsequios) {
			actionPerformedMntmObsequios(e);
		}
		if (e.getSource() == mntmDescuentos) {
			actionPerformedMntmDescuentos(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListar) {
			actionPerformedMntmListar(e);
		}
		if (e.getSource() == mntmModificar) {
			actionPerformedMntmModificar(e);
		}
	}
	protected void actionPerformedMntmModificar(ActionEvent e) {
		modal_modificar_producto consultar = new modal_modificar_producto();
		consultar.setLocationRelativeTo(mntmModificar);
		consultar.setVisible(true);
	}
	protected void actionPerformedMntmListar(ActionEvent e) {
		modal_lista_productos consultar = new modal_lista_productos();
		consultar.setLocationRelativeTo(mntmListar);
		consultar.setVisible(true);
		
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		modal_ventas_re consultar = new modal_ventas_re();
		consultar.setLocationRelativeTo(mntmVender);
		consultar.setVisible(true);
	}
	protected void actionPerformedMntmDescuentos(ActionEvent e) {
		modal_configurar_descuento consultar = new modal_configurar_descuento();
		consultar.setLocationRelativeTo(mntmDescuentos);
		consultar.setVisible(true);
	}
	protected void actionPerformedMntmObsequios(ActionEvent e) {
		modal_configurar_obsequios consultar = new modal_configurar_obsequios();
		consultar.setLocationRelativeTo(mntmObsequios);
		consultar.setVisible(true);
	}
	protected void actionPerformedMntmAcerca(ActionEvent e) {
		modal_acerca_de_nosotros consultar = new modal_acerca_de_nosotros();
		consultar.setLocationRelativeTo(mntmAcerca);
		consultar.setVisible(true);
	}
}
