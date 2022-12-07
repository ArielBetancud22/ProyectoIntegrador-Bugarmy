package proyectoIntegrador;

public class functions implements gfx {
	static comp data = new comp();
	static String gpu, cpu, pow, ram, mother, hdd, price;
	private static void pln(String s) {

		System.out.println(s);
	}
	public void minimenu(String x) {
		
		String mModifier = null;
		//x.toLowerCase();
		switch(x) {
		case "low":
			mModifier="Gama Baja";
			break;
		case "mid":
			mModifier="Gama Media";
			break;
		case "hi": 
			mModifier="Gama Alta";
			break;
		case "ult":
			mModifier="Gama Ultra";
			break;
		}
		pln(bblack+"\nOpcion 1: "+reset+"PC " +mModifier+" 1");
		gfx.sleep(150);
		pln(bblack+"\nOpcion 2: "+reset+"PC " +mModifier+" 2");
		gfx.sleep(150);
		pln(bblack+"\nAtras"+reset);
		gfx.sleep(150);
		pln(bblack+"\nSalir"+reset+"\n");
		gfx.sleep(150);
		gfx.spacer();
	}
	private static void Odata() {

		cpu = data.getCpu();
		gpu = data.getGpu();
		pow = data.getPow();
		ram = data.getRam();
		mother = data.getMother();
		hdd = data.getHdd();
		price = data.getPrice();
	}
	public void sglow_1() {

		data.gamaBaja1();
		Odata();
		gfx.loader();
		pln(bblack+"\nPc Gama Baja 1\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio sería de "+cyan+price+reset+"\n");
		gfx.sleep(250);
		pln(bblack+"\nIngrese Comprar para ir al menu de compras"+reset);
		pln(bblack+"Ingrese Atras para volver al menu\n"+reset);
		gfx.spacer();
	}
	public void sglow_2() {

		data.gamaBaja2();
		Odata();
		gfx.loader();
		pln(bblack+"\nPc Gama Baja 2\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio sería de "+cyan+price+reset+"\n");
		gfx.sleep(250);
		pln(bblack+"\nIngrese Comprar para ir al menu de compras"+reset);
		pln(bblack+"Ingrese Atras para volver al menu\n"+reset);
		gfx.spacer();
	}
	public void sgmid_1() {

		data.gamaMedia1();
		Odata();
		gfx.loader();
		pln(bblack+"\nPc Gama Media 1\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio sería de "+cyan+price+reset+"\n");
		gfx.sleep(250);
		pln(bblack+"\nIngrese Comprar para ir al menu de compras"+reset);
		pln(bblack+"Ingrese Atras para volver al menu\n"+reset);
		gfx.spacer();
	}
	public void sgmid_2() {
		
		data.gamaMedia2();
		Odata();
		gfx.loader();
		pln(bblack+"\nPc Gama Media 2\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio sería de "+cyan+price+reset+"\n");
		gfx.sleep(250);
		pln(bblack+"\nIngrese Comprar para ir al menu de compras"+reset);
		pln(bblack+"Ingrese Atras para volver al menu\n"+reset);
		gfx.spacer();
	}
	public void sghi_1() {
		
		data.gamaAlta1();
		Odata();
		gfx.loader();
		pln(bblack+"\nPc Gama Alta 1\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio sería de "+cyan+price+reset+"\n");
		gfx.sleep(250);
		pln(bblack+"\nIngrese Comprar para ir al menu de compras"+reset);
		pln(bblack+"Ingrese Atras para volver al menu\n"+reset);
		gfx.spacer();
	}
	public void sghi_2() {
		
		data.gamaAlta2();
		Odata();
		gfx.loader();
		pln(bblack+"\nPc Gama Alta 2\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio sería de "+cyan+price+reset+"\n");
		gfx.sleep(250);
		pln(bblack+"\nIngrese Comprar para ir al menu de compras"+reset);
		pln(bblack+"Ingrese Atras para volver al menu\n"+reset);
		gfx.spacer();
	}
	public void sgult_1() {
		
		data.gamaUltra1();
		Odata();
		gfx.loader();
		pln(bblack+"\nPc Gama Ultra 1\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio sería de "+cyan+price+reset+"\n");
		gfx.sleep(250);
		pln(bblack+"\nIngrese Comprar para ir al menu de compras"+reset);
		pln(bblack+"Ingrese Atras para volver al menu\n"+reset);
		gfx.spacer();
	}
	public void sgult_2() {
		
		data.gamaUltra2();
		Odata();
		gfx.loader();
		pln(bblack+"\nPc Gama Ultra 2\n"+reset);
		pln(reset+"\nPosee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio sería de "+cyan+price+reset+"\n");
		gfx.sleep(250);
		pln(bblack+"\nIngrese Comprar para ir al menu de compras"+reset);
		pln(bblack+"Ingrese Atras para volver al menu\n"+reset);
		gfx.spacer();
	}
}
interface gfx {
	public static String black = "\u001b[30m";
	public static String blue = "\u001b[34m";
	public static String reset= "\u001b[0m";
	public static String bblue= "\033[1;94m";
	public static String bblack= "\033[1;90m";
	public static String bwhite= "\033[1;97m";
	public static String cyan = "\u001b[36m";
	public static void sleep(int snum) {
		//timer
		try {
			Thread.sleep(snum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void longLoader() {
		
		System.out.println("");
		for(int i=0;i<34;i++) {
			System.out.print("\033[104m\033[94m«»");
			sleep(35);
		}
		System.out.println(reset+"\n");
	}
	public static void longSpacer() {
		
		System.out.print("\u001b[4m\u001b[1m"+bblue);
		for(int i=0;i<34;i++) System.out.print("  ");
		System.out.println(reset);
	}
	public static void loader() {
		
		for(int i=0;i<34;i++) {
			System.out.print("\u001b[46m\u001b[36m«»");
			sleep(50);
		}
		System.out.println(reset+"\n");
	}
	public static void spacer() {
		
		System.out.print("\u001b[4m\u001b[1m"+cyan);
		for(int i=0;i<34;i++) System.out.print("  ");
		System.out.println(reset);
	}
	public static void clear() {
		
		for(int i=0;i<30;i++)
			System.out.println("\n");
	}

}

