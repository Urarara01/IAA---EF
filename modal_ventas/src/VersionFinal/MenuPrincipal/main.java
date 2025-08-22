package VersionFinal.MenuPrincipal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import VersionFinal.MenuPrincipal.Constructor.ConstructorMenu;
import clasesUtiles.WindowsTabbed;
import raven.drawer.Drawer;
import raven.popup.GlassPanePopup;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		clasesUtiles.FlatLab.setup();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		// Drawer -> Menu Lateral
		GlassPanePopup.install(this);
		ConstructorMenu myDrawerBuilder = new ConstructorMenu();
		Drawer.getInstance().setDrawerBuilder(myDrawerBuilder);
		
		// Panel Default
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 890);
		setLocationRelativeTo(null); // Centrar ventana
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		// Panel del cuerpo
		// Este panel se usa para tabular las ventanas
		JPanel body = new JPanel(new BorderLayout());
		contentPane.add(body, BorderLayout.CENTER);
		//body.setLocationRelativeTo(null);

		WindowsTabbed.getInstance().install(this, body); // Tabular
		
	}

}
