package ar.edu.unlp.info.oo2.ej12_DispositivoMovilYConexiones;

public interface Connection {

	public String sendData(String data, Integer crc);
	
	public String pict();
	
}
