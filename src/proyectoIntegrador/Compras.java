package proyectoIntegrador;
import java.util.*;
//import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
//4055160012445688
//                             Tienda Bugax                             //
//                                  //                                  //
//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»«»//

public class Compras {
	static String price;
	static comp data = new comp();
	static Scanner sc = new Scanner(System.in);
	public void buyMenu(String x) {
		
		String name, surname;
		int dni;
		String creditCard;
		//static String price;
		Cardcheck ck = new Cardcheck();
		System.out.print(gfx.bblack+"Ingrese su Nombre: "+gfx.reset);
		System.out.print(gfx.black);
		name = sc.next();System.out.print(gfx.reset);
		System.out.print(gfx.bblack+"Ingrese su Apellido: "+gfx.reset);
		System.out.print(gfx.black);
		surname = sc.next();System.out.print(gfx.reset);
		dni = dni();
		creditCard = ck.cardcheck();
		switch(x) {
		case "low-1":
			data.gamaBaja1();
			price = data.getPrice();
			break;
		case "low-2":
			data.gamaBaja2();
			price = data.getPrice();
			break;
		case "mid-1":
			data.gamaMedia1();
			price = data.getPrice();
			break;
		case "mid-2":
			data.gamaMedia2();
			price = data.getPrice();
			break;
		case "high-1":
			data.gamaAlta1();
			price = data.getPrice();
			break;
		case "high-2":
			data.gamaAlta2();
			price = data.getPrice();
			break;
		case "ultra-1":
			data.gamaUltra1();
			price = data.getPrice();
			break;
		case "ultra-2":
			data.gamaUltra2();
			price = data.getPrice();
			break;
		}
		ticketPrint(name,surname,dni,creditCard,price);
		/*System.out.println("\rNombre: "+gfx.bold+ name
				+"\nApellido: "+ surname
				+"\nDNI: "+ dni
				+"\nTarjeta de Credito "+"\""+ck.cType(creditCard)+"\""+ " numero: "+creditCard.substring(0, 4)+"-****-****-"+creditCard.substring(12, 16)
				+"\nPrecio: "+price);*/
		mfx.exit();
	}
	private static int dni() {
		System.out.print(gfx.bblack+"Ingrese su documento: "+gfx.reset);
		boolean pass = false;
		String dni = null;
		while(!pass){
			try{
				System.out.print(gfx.black);
				dni = sc.next();
				System.out.print(gfx.reset);
				/*int test.length?= next ->>><>*/ //System.out.println(dni.length());
				if(dni.length()>=7&&dni.length()<=8)//0,000,000 - 7 || 00,000,000 - 8
					pass = true;
				else 
					throw new Exception("no dni format");				
			}catch(Exception e) {
				System.out.println(gfx.reset);
				System.err.println("Intente nuevamente...");
				continue;
			}		
		}
		int nDni = Integer.parseInt(dni);
		return nDni;
	}
	private void ticketPrint(String name, String surname, int dni, String creditcard,String price) {
		
		DateTimeFormatter day = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter hour = DateTimeFormatter.ofPattern("HH:mm:ss");
		Random rd = new Random();
		LocalDateTime cTime = LocalDateTime.now();
		Cardcheck ck = new Cardcheck();
		gfx.longLoader();
		System.out.println(gfx.bblue+"        BugaX"+gfx.reset);
		System.out.println("\r");
		System.out.println(gfx.bwhite+"                             Tienda Bugax"+gfx.reset);
		gfx.longSpacer();
		System.out.println(gfx.bblack+"\nFecha: "+gfx.bwhite+day.format(cTime));
		System.out.println(gfx.bblack+"Hora: "+gfx.bwhite+hour.format(cTime));
		System.out.println(gfx.bblack+"Nro.de Ticket: "+gfx.bwhite+rd.nextInt(100000));
		gfx.longSpacer();
		System.out.println(gfx.bblack+"\nCliente: "+gfx.bwhite+name.toUpperCase()+" "+surname.toUpperCase());
		System.out.println(gfx.bblack+"DNI: "+gfx.bwhite+dni);
		System.out.println(gfx.bblack+"Tarjeta de credito("+gfx.bblue+ck.cType(creditcard)+gfx.bblack+"): "+gfx.bwhite+creditcard.substring(0,4)+"-****-****-"+creditcard.substring(12,16));
		System.out.println(gfx.bblack+"Importe: "+gfx.bwhite+price);
		System.out.println(gfx.bblack+"Importe total: "+gfx.bwhite+priceConverter(price)+" ARS$");
		gfx.longSpacer();
		System.out.println("\n");
	}
	private String priceConverter(String x) {
		
		char chArray[] = x.toCharArray();
		StringBuilder sb = new StringBuilder();
		/*DecimalFormat df10k = new DecimalFormat("##.###");
		DecimalFormat df100k = new DecimalFormat("###.###");
		DecimalFormat df1M = new DecimalFormat("#.###.###");*/
		String ret = null;
		for(char a : chArray) {
			if(Character.isDigit(a)) {
				sb.append(a);
			}
		}
		int toInt = Integer.parseInt(sb.toString());
		int addIva = (int) (toInt*1.21);
		ret = NumberFormat.getInstance().format(addIva);
		/*if(addIva<=99999) {
			ret = df10k.format(addIva);
		}else if(addIva>=100000&&addIva<=999999){
			ret = df100k.format(addIva);
		}else if(addIva>1000000) {
			ret = df1M.format(addIva);
		}*/
		return ret;
	}
}