package VersionFinal.MenuPrincipal.Constructor;

import cibertec.test_consultar_producto;
//import clasesUtiles.form.TestForm; Aqu� importar�s las ventanas a mostrar
import clasesUtiles.WindowsTabbed;
import panelesSistema.Consultar_productos;
import panelesSistema.Listar;
import raven.drawer.component.SimpleDrawerBuilder;
import raven.drawer.component.footer.SimpleFooterData;
import raven.drawer.component.header.SimpleHeaderData;
import raven.drawer.component.menu.MenuAction;
import raven.drawer.component.menu.MenuEvent;
import raven.drawer.component.menu.MenuValidation;
import raven.drawer.component.menu.SimpleMenuOption;
import raven.swing.AvatarIcon;

public class ConstructorMenu extends SimpleDrawerBuilder{

	@Override
	public SimpleHeaderData getSimpleHeaderData() {
		return new SimpleHeaderData()
					.setIcon(new AvatarIcon("src/imagenes/logo1.jpg", 240, 240, 999))
					.setTitle("Luis Ernesto Sanchez")
					.setDescription("Someone@gmail.com");
	}

	@Override
	public SimpleMenuOption getSimpleMenuOption() {
		String menus [][] = {
		{"~VENTAS~"},
		{"Vender producto"}, 
		{"~CONSULTAS~"},
		{"Consultas de la aplicación","Consultar productos","Consultar descuentos","Consultar obsequios"},
		{"Listar productos"},
		{"~CONFIGURACIÓN~"},
		{"Configuración de la aplicación"},
		{"Configuración interna","Modificar productos","Modificar descuentos","Configurar obsequios"},
		{"~NOSOTROS~"},
		{"Acerca de nosotros"},
		{"~OTROS~"},
		{"Cerrar sesión"},
		{"Salir"}
		};
		
		return new SimpleMenuOption()
				.setMenus(menus)
				.addMenuEvent(new MenuEvent() {
					
					@Override
					public void selected(MenuAction arg0, int Index, int subIndex) {
						if (Index == 0) {
							WindowsTabbed.getInstance().addTab("Testing Wiwi", new test_consultar_producto());
						} else if (Index == 1 && subIndex == 1) {
							WindowsTabbed.getInstance().addTab("Consultar producto", new Consultar_productos());
						} else if (Index == 2) {
							WindowsTabbed.getInstance().addTab("Listar productos", new Listar());
						}
						
						System.out.println(getClass().getName()+ " says:" + "Menú seleccionado: Index=" + Index + ", SubIndex=" + subIndex);

						
					}
				})
				.setMenuValidation(new MenuValidation() {
					@Override
					public boolean menuValidation(int index, int subIndex) {
						// Si el �ndice es 0, no se permite la selecci�n
						// if (index == 0) {
						// 	return false;
						// }
						return true;
					}
				});
	}

	@Override
	public SimpleFooterData getSimpleFooterData() {
		return new SimpleFooterData()
				.setTitle("Oh no ~")
				.setDescription("Creado por el grupo 404 - Found!");
	}
	
}
