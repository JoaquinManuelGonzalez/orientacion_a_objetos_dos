package ar.edu.unlp.info.oo2.ej12_DispositivoMovilYConexiones;

public class FourGConnection {

	private String symb;
	
	public FourGConnection() {
		this.symb = "Simbolo 4G";
	}
	
	public String transmit(String data, Integer crc) {
		return "4G Connection: " + data + " " + crc;
	}
	
	public String symb() {
		return this.symb;
	}
	
}
