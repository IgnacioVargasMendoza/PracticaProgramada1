package menuPeliculas;

public class CienciaFiccion extends Pelicula {

	public CienciaFiccion(String titulo, String director, int anio, String descripcion) {
		super(titulo, director, anio, descripcion);
	}

	@Override
	public String mostrarTipoEscena() {
		return "Escenas futuristas, tecnológicas y científicas. Viajes espaciales, extraterrestres e inteligencias artificiales.";
	}

}
