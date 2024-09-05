package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class calculadoraTemporadaAlta extends calculadoraTarifas{
	
	protected int COSTO_POR_KM = 1000;
	
	
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		return -1;
	}
	
	public double calcularPocentajeDescuento(Cliente cliente) {
		
		
		return 0.0;
	}
	
	
	public calculadoraTemporadaAlta() {
		// TODO Auto-generated constructor stub
	}

}
