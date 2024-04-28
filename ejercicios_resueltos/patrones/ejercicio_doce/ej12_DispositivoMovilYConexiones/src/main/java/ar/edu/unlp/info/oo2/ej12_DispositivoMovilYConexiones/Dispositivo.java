package ar.edu.unlp.info.oo2.ej12_DispositivoMovilYConexiones;

public class Dispositivo {
	
	private Ringer ringer;
	private Display display;
	private Connection connection;
	private CRC_Calculator crcCalculator;
	
	public Dispositivo() {
		this.ringer = new Ringer();
		this.display = new Display();
		this.connection = new WifiConn();
		this.crcCalculator = new CRC16_Calculator();
	}
	
	public String send(String data) {
		int crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public String conectarCon(Connection newConnection) {
		this.connection = newConnection;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
		return "Connection changed";
	}
	
	public String configurarCRC(CRC_Calculator newCRC) {
		this.crcCalculator = newCRC;
		return "CRC calculator changed";
	}

	
}
