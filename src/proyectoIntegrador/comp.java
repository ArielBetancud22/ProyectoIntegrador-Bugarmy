package proyectoIntegrador;

public class comp {
	private static String pow;
	private static String ram;
	private static String cpu;
	private static String gpu;
	private static String mother;
	private static String hdd;
	private static String price;
	public String getGpu() {
		return gpu;
	}
	public String getPow() {
		return pow;
	}
	public String getRam() {
		return ram;
	}
	public String getCpu() {
		return cpu;
	}
	public String getMother() {
		return mother;
	}
	public String getHdd() {
		return hdd;
	}
	public String getPrice() {
		return price;
	}
	public void gamaBaja1() {
		mother = "A68M";
		pow = "ATX-500";
		cpu = "AMD 785G";
		ram = "2 gb";
		gpu = "N/A";
		hdd = "80 gb";
		price = "15.000 ARS$";
	}
	public void gamaBaja2() {
		mother = "A320M";//
		pow = "ATX-500";//
		cpu = "Intel Celeron";//
		ram = "2gb ddr3";//
		gpu = "UHD Intel 610";//
		hdd = "100 gb";
		price = "51.000 ARS$";
	}
	public void gamaMedia1() {
		mother = "A320M";
		pow = "LNZ PX-550";
		cpu = "Intel Pentium 4";
		ram = "6 gb";
		gpu = "Intel HD";
		hdd = "500 gb";
		price = "94.000 ARS$";
	}
	public void gamaMedia2() {
		mother = "Gigabyte B450M";
		pow = "ATX-550";
		cpu = "Ryzen 3 3200g";
		ram = "8 gb";
		gpu = "Radeon Vegas 8";
		hdd = "500 gb";
		price = "89.700 ARS$";
	}
	public void gamaAlta1() {
		mother = "A320M";
		pow = "ATX 600W";
		cpu = "Ryzen 7";
		ram = "16 gb";
		gpu = "RADEON 5700g";
		hdd = "2 tb";
		price = "210.000 ARS$";
	}
	public void gamaAlta2() {
		mother = "SROCK H510M";
		pow = "SENTEY LNZ550XS";
		cpu = "Intel Core i7";
		ram = "16 gb";
		gpu = "AMD RX550";
		hdd = "1 tb";
		price = "235.400 ARS$";
	}
	public void gamaUltra1() {
		mother = "Gigabyte TRX40 AORUS Xtreme";
		pow = "1250W";
		cpu = "AMD Ryzen Threadripper 3990X";
		ram = "256 gb";
		gpu = "RTX 3090 VENTUS";
		hdd = "8 tb";
		price = "1.734.700 ARS$";
	}
	public void gamaUltra2() {
		mother = "GIGABYTE Z690";
		pow = "Toughpower GF1 850W";
		cpu = "Intel Core I9 12900KF";
		ram = "32 gb";
		gpu = "RTX 4090";
		hdd = "5 tb";
		price = "3.752.900 ARS$";
	}
}