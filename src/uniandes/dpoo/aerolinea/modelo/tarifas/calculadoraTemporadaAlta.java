package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class calculadoraTemporadaAlta extends calculadoraTarifas{
	
	protected int COSTO_POR_KM = 1000;
	
	
	
	@Override
    public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        int distancia = calcularDistanciaVuelo(vuelo.getRuta());
        return distancia * COSTO_POR_KM;
    }

    @Override
    public double calcularPorcentajeDescuento(Cliente cliente) {
        if (cliente instanceof ClienteCorporativo) {
            return 0.0;  
        } else {
            return 0.05;  
        }
    }

    public calculadoraTemporadaAlta() {
        // Constructor vacío
    }
}