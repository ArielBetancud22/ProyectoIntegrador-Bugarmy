package proyectoIntegrador;

import java.util.*;

public class inicio {
//                             Menu Principal                           //             
//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//
	public static void main(String[] args) {
		mainMenu();
	}
	public static void mainMenu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		mfx menu = new mfx();
		gfx.loader();
		String input;
		do {
			System.out.println(gfx.cyan +"\u001b[4m\u001b[1m                           Menu Principal                           \n" + gfx.reset);
			gfx.sleep(250);
			System.out.println(gfx.bblack+"\nOpcion 1:"+gfx.bwhite+" PC Gama Baja"+gfx.reset);
			gfx.sleep(250);
			System.out.println(gfx.bblack+"\nOpcion 2:"+gfx.bwhite+" PC Gama Media"+gfx.reset);
			gfx.sleep(250);                           
			System.out.println(gfx.bblack+"\nOpcion 3:"+gfx.bwhite+" PC Gama Alta"+gfx.reset);
			gfx.sleep(250);                           
			System.out.println(gfx.bblack+"\nOpcion 4:"+gfx.bwhite+" PC Gama Ultra"+gfx.reset);
			gfx.sleep(250);
			System.out.println(gfx.bblack+"\nSalir"+gfx.reset+"\n");
			gfx.spacer();
		
			System.out.print(gfx.black);
			input = sc.next().toLowerCase();
			System.out.print(gfx.reset);
			switch (input) {
			case "1", "baja", "gama baja":
				gfx.loader();
				menu.low_m();
				break;
			case "2", "media", "gama media":
				gfx.loader();
				menu.mid_m();
				break;
			case "3", "alta", "gama alta":
				gfx.loader();
				menu.high_m();
				break;
			case "4", "ultra", "gama ultra":
				gfx.loader();
				menu.ultra_m();
				break;
			case "salir":
				break;
			default:
				System.err.println("Intente nuevamente.");
				continue;
			}
		} while (menu.mainExit(input));
		
	}
}
 
