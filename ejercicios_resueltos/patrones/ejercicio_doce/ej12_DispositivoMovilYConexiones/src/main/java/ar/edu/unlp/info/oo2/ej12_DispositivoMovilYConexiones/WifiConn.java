package ar.edu.unlp.info.oo2.ej12_DispositivoMovilYConexiones;

public class WifiConn implements Connection {

	private String pict;
	
	public WifiConn() {
		this.pict = "Simbolo Wifi";
	}

	@Override
	public String sendData(String data, Integer crc) {
		return "Wifi Connection: " + data + " " + crc;
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
