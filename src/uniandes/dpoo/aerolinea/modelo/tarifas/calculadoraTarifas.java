package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.Ruta;



public abstract class calculadoraTarifas {
	
	private static final double IMPUESTO = 0.28;
	
	
	private int calcularTarifa() {
		
		
		return -1;
	}
	
	protected int calcularCostoBase() {
		
		
		return -1;
	}
	
	protected int calcularPorcentajeDescuento() {
		
		return -1;
	}
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		ruta.getDuracion();
		
		return -1;
	}
	
	protected int calcularValorImpuestos() {
		
		return -1;
	}

}
