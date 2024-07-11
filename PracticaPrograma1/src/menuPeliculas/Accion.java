package menuPeliculas;

public class Accion extends Pelicula {

    public Accion(String titulo, String director, int anio, String descripcion) {
        super(titulo, director, anio, descripcion);
    }

    @Override
    public String mostrarTipoEscena() {
        return "Escenas intensas y dinámicas. Incluyen peleas, persecuciones, explosiones y otros efectos.";
    }

}
