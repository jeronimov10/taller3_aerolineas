package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class calculadoraTemporadaBaja extends calculadoraTarifas{
	
	protected int COSTO_POR_KM_NATURAL = 600;
	protected int COSTO_POR_KM_CORPORATIVO = 900;
	protected double DESCUENTO_PEQ = 0.02;
	protected double DESCUENTO_MED = 0.1;
	protected double DESCUENTO_GRANDES = 0.2;
	
	private int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		return -1;
	}
	
	private double calcularporcentajeDescuento(Cliente cliente) {
		
		
		return 0.0;
	}
	
	public calculadoraTemporadaBaja() {
		// TODO Auto-generated constructor stub
	}
	
	

}
