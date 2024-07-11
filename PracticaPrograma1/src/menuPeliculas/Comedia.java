package menuPeliculas;

public class Comedia extends Pelicula {

	 public Comedia(String titulo, String director, int anio, String descripcion) {
	        super(titulo, director, anio, descripcion);
	    }

	    @Override
	    public String mostrarTipoEscena() {
	        return "Escenas ligeras, humorísticas, diálogos ingeniosos y personajes extravagantes.";
	    }

}
