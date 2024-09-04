package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.UUID;


public class ClienteNatural extends Cliente {

	
	private static final String natural = "NATURAL";
	private String nombre;
	
	
	public ClienteNatural(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}
	
	
	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return "El cliente: " + nombre + "es de tipo " + natural ;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		
		
		return nombre + "_" + UUID.randomUUID().toString();
	}
	
	

}
