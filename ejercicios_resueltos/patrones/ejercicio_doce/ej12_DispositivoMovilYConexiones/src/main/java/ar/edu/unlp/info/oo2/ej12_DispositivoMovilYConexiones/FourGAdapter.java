package ar.edu.unlp.info.oo2.ej12_DispositivoMovilYConexiones;

public class FourGAdapter implements Connection {

	@Override
	public String sendData(String data, Integer crc) {
		FourGConnection connection = new FourGConnection();
		return connection.transmit(data, crc);
	}

	@Override
	public String pict() {
		FourGConnection connection = new FourGConnection();
		return connection.symb();
	}

}
