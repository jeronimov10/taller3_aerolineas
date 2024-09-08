package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.UUID;


public class ClienteNatural extends Cliente {

	
	private static final String natural = "NATURAL";
	private String nombre;
	private String identificador;
	
	
	
	public ClienteNatural(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.identificador = nombre + "_" + UUID.randomUUID().toString();
	}
	
	
	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return "El cliente: " + nombre + "es de tipo " + natural ;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		
		
		return identificador;
	}
	
	

}
