package menuPeliculas;

public class Aventura extends Pelicula {

	public Aventura(String titulo, String director, int anio, String descripcion) {
		super(titulo, director, anio, descripcion);
	}

	@Override
	public String mostrarTipoEscena() {
		return "Escenas de exploración, descubrimiento y viajes. Misiones épicas y escenarios exóticos.";

	}
}
