package uniandes.dpoo.aerolinea.persistencia;


import java.io.IOException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

	public interface IPersistenciaAerolinea {

	    /**
	     * Carga la información de una aerolínea desde un archivo.
	     * @param archivo La ruta del archivo
	     * @param aerolinea La aerolínea donde se debe cargar la información
	     * @throws IOException Si hay problemas leyendo el archivo
	     */
	    void cargarAerolinea(String archivo, Aerolinea aerolinea) throws IOException;

	    /**
	     * Guarda la información de una aerolínea en un archivo.
	     * @param archivo La ruta del archivo
	     * @param aerolinea La aerolínea que se debe guardar
	     * @throws IOException Si hay problemas escribiendo el archivo
	     */
	    void salvarAerolinea(String archivo, Aerolinea aerolinea) throws IOException;
	}


