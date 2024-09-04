package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.ArrayList;
import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;


public abstract class Cliente  {
	
	private java.util.List<Tiquete> tiquetesSinUsar;
	private java.util.List<Tiquete> tiquetesUsados;
	private Collection<Tiquete> tiquetes;
	
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
		
		this.tiquetesSinUsar = new ArrayList<Tiquete>();
		this.tiquetesUsados = new ArrayList<Tiquete>();
		
	}
	public abstract java.lang.String getTipoCliente();
	
	public abstract java.lang.String getIdentificador();
	
	public void agregarTiquete​(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
		
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		
		for ( Tiquete ticket:tiquetesSinUsar ) {
			if (vuelo.equals(ticket.getVuelo)) {
				tiquetesUsados.add(ticket);
				tiquetesSinUsar.remove(ticket);
			}
		}
	}
	
	public int calcularValorTotalTiquetes() {
		
		return -1;
	}
	
	
	public java.util.List<Tiquete> getTiquetesSinUsar() {
		return tiquetesSinUsar;
	}
	public java.util.List<Tiquete> getTiquetesUsados() {
		return tiquetesUsados;
	}
	
	
	


}
