package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.Ruta;



public abstract class calculadoraTarifas {
	
	
	
	private static final double IMPUESTO = 0.28;
	
	
	private int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		int costoBase = calcularCostoBase(vuelo, cliente);
		double porcentajeDescuento = calcularPorcentajeDescuento(cliente);
		double descuento = costoBase * porcentajeDescuento;
		double costoConDescuento = costoBase - descuento;
		double impuestos = costoConDescuento * IMPUESTO;
		double tarifaTotal = costoConDescuento + impuestos;
	
		
		return (int) tarifaTotal;
	}
	
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		int duracionEnMinutos = ruta.getDuracion();
		double duracionEnHoras = duracionEnMinutos / 60.0;
		return (int) (duracionEnHoras * 500);
	}
	
	protected int calcularValorImpuestos(int costoBase) {
	    return (int) (costoBase * IMPUESTO);
	}

}
