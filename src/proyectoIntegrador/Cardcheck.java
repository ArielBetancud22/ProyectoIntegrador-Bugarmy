package proyectoIntegrador;

import java.util.Scanner;

public class Cardcheck {
	public String cardcheck(){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String cardInput = null;
		//	int cardNum;
		boolean pass = false;
		System.out.print(gfx.bblack+"Introduzca el numero su tarjeta: "+gfx.reset);
		do {
			while(!pass){
				try {
					System.out.print(gfx.black);
					cardInput = sc.nextLine().replaceAll("-", "").replaceAll("\\s", "");System.out.print(gfx.reset);
					digitCheck(cardInput);
					pass=true;
					/*if(digitCheck(cardInput)) {
						pass = true;
					}else {
						throw new Exception("pos no");						
					}*/				
				}catch(Exception e) {
					System.err.print("La Tarjeta introducida no es valida\n"
							+ "Intente nuevamente...\n");
					continue;
					//sc.next();
				}
			};
			pass = false;
			//cardNum = Integer.parseInt(subCardDigits);
			if	(!luhnTest(cardInput)){			
				System.err.print("La Tarjeta introducida no es valida\n"
						+ "Intente nuevamente...\n");
			}
		}while(!luhnTest(cardInput));
		return cardInput;
	}
	public static boolean luhnTest(String numero){
		
		int s1 = 0, s2 = 0;
		String reversa = new StringBuffer(numero).reverse().toString();
		for(int i = 0 ;i < reversa.length();i++){
			int digito = Character.digit(reversa.charAt(i), 10);
			if(i % 2 == 0){
				s1 += digito;
			}else{
				s2 += 2 * digito;
				if(digito >= 5){
					s2 -= 9;
				}
			}
		}
		return (s1 + s2) % 10 == 0;
	}
	public void digitCheck(String x) throws Exception {
		
		char[] chArray = x.toCharArray();
		for(char c : chArray) {
			if(!Character.isDigit(c)) {
				throw new Exception("Characters not admitted");
			}
		}			
	}
	public String cType(String x) {
		
		int cardNum = Integer.parseInt(x.substring(0, 4));
		String retString = null;
		if (cardNum >= 510 && cardNum <= 559) {
			retString = (gfx.cyan+"MasterCard"+gfx.reset);
		} else if (cardNum >= 4000 && cardNum <= 4999) {
			retString =(gfx.cyan+"Visa"+gfx.reset);
		} else if (cardNum >= 3400 && cardNum <= 3799) {
			retString = (gfx.cyan+"American Express"+gfx.reset);
		} else if (cardNum >= 3000 && cardNum <= 3059) {
			retString = (gfx.cyan+"Dinners Club"+gfx.reset);
		} else if (cardNum >= 4000 && cardNum <= 4999) {
			retString = (gfx.cyan+"Visa"+gfx.reset);
		}
		return retString;	
	}
}
