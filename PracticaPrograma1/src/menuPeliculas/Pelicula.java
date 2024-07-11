package menuPeliculas;

abstract class Pelicula implements EnfoquePelicula{
	
    private String titulo;
    private String director;
    private int anio;
    private String descripcion;

    public Pelicula(String titulo, String director, int anio, String descripcion) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.descripcion = descripcion;
    }

  
    public String getTitulo() {
		return titulo;
	}
    
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
    public String toString() {
        return "Título: " + titulo + ", Director: " + director + ", Año: " + anio + ", Descripción: " + descripcion;
    }

}
