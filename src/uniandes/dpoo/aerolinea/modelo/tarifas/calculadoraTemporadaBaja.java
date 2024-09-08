package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class calculadoraTemporadaBaja extends calculadoraTarifas{
	
	protected int COSTO_POR_KM_NATURAL = 600;
	protected int COSTO_POR_KM_CORPORATIVO = 900;
	protected double DESCUENTO_PEQ = 0.02;
	protected double DESCUENTO_MED = 0.1;
	protected double DESCUENTO_GRANDES = 0.2;
	
	@Override
    public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        int distancia = calcularDistanciaVuelo(vuelo.getRuta());
        if (cliente instanceof ClienteCorporativo) {
            return distancia * COSTO_POR_KM_CORPORATIVO;
        } else {
            
            return distancia * COSTO_POR_KM_NATURAL;
        }
    }

	
	@Override
	public double calcularPorcentajeDescuento(Cliente cliente) {
		
		if (cliente instanceof ClienteCorporativo) {
	        ClienteCorporativo corporativo = (ClienteCorporativo) cliente;
	        int tamanoEmpresa = corporativo.getTamanoEmpresa();
	        
	        
	        
	        if (tamanoEmpresa == ClienteCorporativo.GRANDE) {
	            return 0.2;
	        } else if (tamanoEmpresa == ClienteCorporativo.MEDIANA) {
	            return 0.1; 
	        } else if (tamanoEmpresa == ClienteCorporativo.PEQUENA) {
	            return 0.02;  
	        } else {
	            return 0.0; 
	        }
		}
		
		 return 0.0;
	}





	public calculadoraTemporadaBaja() {
	// TODO Auto-generated constructor stub
	}
	
	
	

}
