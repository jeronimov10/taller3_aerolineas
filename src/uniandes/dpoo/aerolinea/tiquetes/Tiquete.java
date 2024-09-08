package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente clienteComprador;
	
	
	public Tiquete(String codigo, Vuelo vuelo, int tarifa, boolean usado, Cliente clienteComprador) {
		// TODO Auto-generated constructor stub
		
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.usado = false;
		this.vuelo = vuelo;
		this.clienteComprador = clienteComprador;
		
		
		
	}


	public String getCodigo() {
		return codigo;
	}


	public int getTarifa() {
		return tarifa;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}


	public Cliente getClienteComprador() {
		return clienteComprador;
	}
	
	public void marcarComoUsado() {
		usado = true;
	}
	public boolean esUsado() {
		return usado;
	}
		


}
