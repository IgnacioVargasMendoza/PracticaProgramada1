package menuPeliculas;

import java.util.*;

public class MainPeliculas {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        CatalogoNetflix catalogo = new CatalogoNetflix();

        catalogo.agregarPelicula(new Accion("Inception", "Christopher Nolan", 2010, "Dream heist movie."));
        catalogo.agregarPelicula(new Aventura("Indiana Jones", "Steven Spielberg", 1981, "Archaeologist adventures."));
        catalogo.agregarPelicula(new CienciaFiccion("Blade Runner", "Ridley Scott", 1982, "Dystopian future."));
        catalogo.agregarPelicula(new Comedia("Superbad", "Greg Mottola", 2007, "Teenage comedy."));
        catalogo.agregarPelicula(new Terror("The Conjuring", "James Wan", 2013, "Supernatural horror."));

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("== Listado de películas ==");
                    for (Pelicula pelicula : catalogo.getPeliculas()) {
                        System.out.println("- " + pelicula.getTitulo());
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el tipo de película (Accion, Aventura, CienciaFiccion, Comedia, Terror): ");
                    String tipo = scanner.nextLine();
                    List<Pelicula> peliculasPorTipo = catalogo.buscarPorTipo(tipo);
                    if (peliculasPorTipo.isEmpty()) {
                        System.out.println("No se encontraron películas de ese tipo.");
                    } else {
                        System.out.println("== Películas de tipo " + tipo + " ==");
                        for (Pelicula pelicula : peliculasPorTipo) {
                            System.out.println("- " + pelicula.getTitulo());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el título de la película para ver detalles: ");
                    String titulo = scanner.nextLine();
                    Pelicula peliculaSeleccionada = buscarPeliculaPorTitulo(catalogo.getPeliculas(), titulo);
                    if (peliculaSeleccionada != null) {
                        System.out.println("== Detalles de la película == ");
                        System.out.println(peliculaSeleccionada.toString());
                        System.out.println("Tipo de escena: " + peliculaSeleccionada.mostrarTipoEscena());
                    } else {
                        System.out.println("No se encontró la película con ese título.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }


    public static void mostrarMenu() {
        System.out.println("\n=== Menú ===");
        System.out.println("1. Mostrar todas las películas");
        System.out.println("2. Buscar películas por tipo");
        System.out.println("3. Ver detalles de una película");
        System.out.println("4. Salir");
        System.out.print("Ingrese su opción: ");
    }

 
    public static Pelicula buscarPeliculaPorTitulo(List<Pelicula> peliculas, String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return pelicula;
            }
        }
        return null;
    }

}
