package proyectoIntegrador;

import java.util.Scanner;

public class mfx {
	
	static Scanner sc = new Scanner(System.in);
	static functions fx = new functions();
	static Compras compras = new Compras();
	public boolean mainExit(String x) {
		
		Boolean ret = x.toLowerCase().equals("salir");
		return !ret;
	}

	public boolean checker(String x) {
		
		if (x.toLowerCase().equals("salir"))
			System.exit(0);
		Boolean ret = x.toLowerCase().equals("atras");
		return !ret;
	}
	public void low_m() {
		
		String input, checkMenu;
		//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//
		//                              Gama Baja                               //
		do {
			System.out.println("\n"+gfx.cyan +"\u001b[4m\u001b[1m                             Gama Baja                              \n" + gfx.reset);
			fx.minimenu("low");
			System.out.print(gfx.black);
			input = sc.next().toLowerCase();System.out.print(gfx.reset);
			checkMenu=input;
			switch (input) {
			case "1":
				do{
					//checkMenu = sc.next().toLowerCase();
					switch (checkMenu){
					case "1":
						fx.sglow_1();
						System.out.print(gfx.black);
						checkMenu = sc.next().toLowerCase();System.out.print(gfx.reset);
						break;
					case "comprar":
						gfx.loader();
						compras.buyMenu("low-1");
						gfx.spacer();
						break;
					default:
						continue;
					}
				}while(checker(checkMenu));
				break;
			case "2":
				do{
					//checkMenu = sc.next().toLowerCase();
					switch (checkMenu){
					case "2":
						fx.sglow_2();
						System.out.print(gfx.black);
						checkMenu = sc.next().toLowerCase();System.out.print(gfx.reset);
						break;
					case "comprar":
						gfx.loader();
						compras.buyMenu("low-2");
						gfx.spacer();
						break;
					default:
						continue;
					}
				}while(checker(checkMenu));
				break;
			}
		} while (checker(input));
	}
	public void mid_m() {
		
		String input, checkMenu;
		//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//
		//                             Gama Media                               //
		do {
			System.out.println("\n"+gfx.cyan +"\u001b[4m\u001b[1m                            Gama Media                              \n" + gfx.reset);
			fx.minimenu("mid");
			System.out.print(gfx.black);
			input = sc.next().toLowerCase();System.out.print(gfx.reset);
			checkMenu=input;
			switch (input) {
			case "1":
				do{
					//checkMenu = sc.next().toLowerCase();
					switch (checkMenu){
					case "1":
						fx.sgmid_1();	
						System.out.print(gfx.black);			
						checkMenu = sc.next().toLowerCase();System.out.print(gfx.reset);
						break;
					case "comprar":
						gfx.loader();
						compras.buyMenu("mid-1");
						gfx.spacer();
						break;
					default:
						continue;
					}
				}while(checker(checkMenu));
				break;
			case "2":
				do{
					//checkMenu = sc.next().toLowerCase();
					switch (checkMenu){
					case "2":
						fx.sgmid_2();
						System.out.print(gfx.black);
						checkMenu = sc.next().toLowerCase();System.out.print(gfx.reset);
						break;
					case "comprar":
						gfx.loader();
						compras.buyMenu("mid-2");
						gfx.spacer();
						break;
					default:
						continue;
					}
				}while(checker(checkMenu));
				break;
			}
		} while (checker(input));
	}
	public void high_m() {
		
		String input, checkMenu;
		//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//
		//                              Gama Alta                               //
		do {
			System.out.println("\n"+gfx.cyan +"\u001b[4m\u001b[1m                             Gama Alta                              \n" + gfx.reset);
			fx.minimenu("hi");
			System.out.print(gfx.black);
			input = sc.next().toLowerCase();System.out.print(gfx.reset);
			checkMenu=input;
			switch (input) {
			case "1":
				do{
					//checkMenu = sc.next().toLowerCase();
					switch (checkMenu){
					case "1":
						fx.sghi_1();
						System.out.print(gfx.black);
						checkMenu = sc.next().toLowerCase();System.out.print(gfx.reset);
						break;
					case "comprar":
						gfx.loader();
						compras.buyMenu("high-1");
						gfx.spacer();
						break;
					default:
						continue;
					}
				}while(checker(checkMenu));
				break;
			case "2":
				do{
					//checkMenu = sc.next().toLowerCase();
					switch (checkMenu){
					case "2":
						fx.sghi_2();
						System.out.print(gfx.black);					
						checkMenu = sc.next().toLowerCase();System.out.print(gfx.reset);
						break;
					case "comprar":
						gfx.loader();
						compras.buyMenu("high-2");
						gfx.spacer();
						break;
					default:
						continue;
					}
				}while(checker(checkMenu));
				break;
			}
		} while (checker(input));
	}
	public void ultra_m() {
		
		String input, checkMenu;
		//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//
		//                             Gama Ultra                               //
		do {
			System.out.println("\n"+gfx.cyan +"\u001b[4m\u001b[1m                            Gama Ultra                              \n" + gfx.reset);
			fx.minimenu("ult");
			System.out.print(gfx.black);
			input = sc.next().toLowerCase();System.out.print(gfx.reset);
			checkMenu=input;
			switch (input) {
			case "1":
				do{
					//checkMenu = sc.next().toLowerCase();
					switch (checkMenu){
					case "1":
						fx.sgult_1();
						System.out.print(gfx.black);
						checkMenu = sc.next().toLowerCase();System.out.print(gfx.reset);
						break;
					case "comprar":
						gfx.loader();
						compras.buyMenu("ultra-1");
						gfx.spacer();
						break;
					default:
						continue;
					}
				}while(checker(checkMenu));
				break;
			case "2":
				do{
					//checkMenu = sc.next().toLowerCase();
					switch (checkMenu){
					case "2":
						fx.sgult_2();
						System.out.print(gfx.black);
						checkMenu = sc.next().toLowerCase();System.out.print(gfx.reset);
						break;
					case "comprar":
						gfx.loader();
						compras.buyMenu("ultra-2");
						gfx.spacer();
						break;
					default:
						continue;
					}
				}while(checker(checkMenu));
				break;
			}
		} while (checker(input));
	}
	public static void exit() {
		
		String check;
		System.out.println(gfx.bblack+"¿Desea confirmar su compra?\n"+
				"Volver al menu principar"+
				"\nSalir\n"+gfx.black);
		gfx.longSpacer();
		check = sc.next().toLowerCase();
		switch(check) {
		case "confirmar", "comprar":
			gfx.longLoader();
			gfx.sleep(150);
			gfx.clear();
			gfx.longSpacer();
			System.out.println(gfx.bblue+"\n\n\n\n\n\n\n\n\n\n\n          Gracias Por su compra en "+gfx.bwhite+"Bugax"+gfx.bblue+" Tienda\n\n\n\n\n\n\n\n\n\n\n\n");
			gfx.longSpacer();
			System.exit(0);
		case "volver", "atras":
			inicio.mainMenu();
			break;
		case "salir":
			System.exit(0);
		default:
			exit();
			break;
		}
	}
}
