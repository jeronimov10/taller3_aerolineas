package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;


public abstract class Cliente  {
	
	private java.util.List<Tiquete> tiquetesSinUsar;
	private java.util.List<Tiquete> tiquetesUsados;
	
	
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
		
		this.tiquetesSinUsar = new ArrayList<>();
		this.tiquetesUsados = new ArrayList<>();
		
	}
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete​(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
		
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		List<Tiquete> tiquetesAUsar = new ArrayList<>();
		for ( Tiquete ticket:tiquetesSinUsar ) {
			if (vuelo.equals(ticket.getVuelo())) {
				tiquetesUsados.add(ticket);
				tiquetesAUsar.add(ticket);
				tiquetesSinUsar.remove(ticket);
			}
		}
		tiquetesSinUsar.removeAll(tiquetesAUsar);
	}
	
	public int calcularValorTotalTiquetes() {
		int total = 0;
        for (Tiquete ticket : tiquetesSinUsar) {
            total += ticket.getTarifa();
        }
        return total;
	}
	
	
	public List<Tiquete> getTiquetesSinUsar() {
		return tiquetesSinUsar;
	}
	public List<Tiquete> getTiquetesUsados() {
		return tiquetesUsados;
	}
	
	
	


}
