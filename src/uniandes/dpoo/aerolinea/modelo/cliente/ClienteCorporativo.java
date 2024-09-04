package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;
import java.util.UUID;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
    // TODO completar
	
	private static final String coorporativo = "COORPORATIVO";
	private static final int GRANDE = 1;
	private static final int MEDIANA = 2;
	private static final int PEQUENA = 3;
	private String nombreEmpresa;
	private int tamanoEmpresa;
	
    
	public ClienteCorporativo(String nombreEmpresa, int tamano) {
		// TODO Auto-generated constructor stub
		
		this.nombreEmpresa = nombreEmpresa;
		this.tamanoEmpresa = tamano;
		
	}

    /**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", coorporativo );
        return jobject;
    }

	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		
		
		return convertirTamanoEnteroATexto(this.tamanoEmpresa);
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return nombreEmpresa + "_"  + UUID.randomUUID().toString();
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public int getTamanoEmpresa() {
		return tamanoEmpresa;
	}
	
	private static String convertirTamanoEnteroATexto(int tamano) {
		if (tamano == GRANDE) {
			return "GRANDE";
		} else if (tamano == MEDIANA) {
			return "MEDIANA";
		} else if (tamano == PEQUENA) {
			return "PEQUEÑA";
		} else {
			return "DESCONOCIDO";
		}
	}
	
	
}
