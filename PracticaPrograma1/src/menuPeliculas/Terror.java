package menuPeliculas;

public class Terror extends Pelicula {

	public Terror(String titulo, String director, int anio, String descripcion) {
		super(titulo, director, anio, descripcion);
	}

	@Override
	public String mostrarTipoEscena() {
		return "Escenas para asustar y provocar miedo. Elementos sobrenaturales, asesinos en serie, monstruos y situaciones espeluznantes.";
	}
}
