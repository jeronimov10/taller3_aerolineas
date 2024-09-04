package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.ArrayList;


import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;


public abstract class Cliente  {
	
	private java.util.List<Tiquete> tiquetesSinUsar;
	private java.util.List<Tiquete> tiquetesUsados;
	
	
	
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
		
		tiquetesUsados.add(vuelo.getTiquetes());
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
