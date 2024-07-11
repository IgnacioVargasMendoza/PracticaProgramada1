package menuPeliculas;

import java.util.*;

public class CatalogoNetflix {
	
	   private List<Pelicula> peliculas;

	    public CatalogoNetflix() {
	        peliculas = new ArrayList<>();
	    }

	    public void agregarPelicula(Pelicula pelicula) {
	        peliculas.add(pelicula);
	    }

	    public List<Pelicula> getPeliculas() {
	        return peliculas;
	    }

	    public List<Pelicula> buscarPorTipo(String tipo) {
	        List<Pelicula> resultado = new ArrayList<>();
	        for (Pelicula pelicula : peliculas) {
	            if (pelicula.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
	                resultado.add(pelicula);
	            }
	        }
	        return resultado;
	    }
}
