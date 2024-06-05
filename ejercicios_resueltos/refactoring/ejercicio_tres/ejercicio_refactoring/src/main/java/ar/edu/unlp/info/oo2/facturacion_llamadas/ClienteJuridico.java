package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {

    private String cuit;
    private static double descuentoJur = 0.15;

	public ClienteJuridico(String nombre, String numeroTelefono, String cuit) {
		super(nombre, numeroTelefono);
		this.cuit = cuit;
	}

	@Override
	public double getDescuento() {
		return ClienteJuridico.descuentoJur;
	}

	@Override
	public void setDescuento(double descuento) {
		ClienteJuridico.descuentoJur = descuento;
	}

    public String getCuit() {
		return cuit;
	}
    
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

}
