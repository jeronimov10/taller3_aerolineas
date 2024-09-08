package uniandes.dpoo.aerolinea.modelo;

import java.util.ArrayList;
import java.util.Collection;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.CalculadoraTarifas;


public class Vuelo{

	private String fecha;
	private Ruta ruta;
	private Avion avion;
	
	
	
	
	
	public Vuelo(String fecha, Ruta ruta, Avion avion) {
		// TODO Auto-generated constructor stub
		
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
		
		
		
	}



	public int getDuracion() {
		return ruta.getDuracion();
	}



	public String getFecha() {
		return fecha;
	}



	public Ruta getRuta() {
		return ruta;
	}



	public Avion getAvion() {
		return avion;
	}
	
    public Collection<Tiquete> getTiquetes() {
        // Implementar la lógica para obtener la colección de tiquetes
        return new ArrayList<>();
    }
    
    public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
        // Implementar la lógica para vender tiquetes
        return 0;
    }
    
    @Override
    
    public boolean equals(Object obj) {
    	
    	
    	if (this == obj) {
    		return true;
    	} else {
    		return false;
    	}
    		
   
    }
	
	
	
	
}
