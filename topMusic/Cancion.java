package topMusic;

public class Cancion {
	String titulo;
	String artista;
	int anno;
	int puesto;
	static int generarPuesto = 1;
	private int getAnno() {
		return anno;
	}

	private void setAnno(int anno) {
		this.anno = anno;
	}

	int getPuesto() {
		return puesto;
	}

	private void setPuesto(int puesto) {
		this.puesto = generarPuesto++;
	}

	public String getArtista() {
		return artista;
	}

	private void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Constructor de canción que contiene el título, el artista y el año de grabación.
	 * @param titulo Título de la canción
	 * @param artista Cantante
	 * @param anno Año de grabación
	 */
	public Cancion(String titulo, String artista, int anno) {
		setTitulo(titulo);
		setArtista(artista);
		setAnno(anno);
		setPuesto(puesto);
	}
	
	/**
	 * Constructor de uan canción formada por el título
	 * @param titulo Título de la canción
	 */
	public Cancion(String titulo){
		setTitulo(titulo);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	/**
	 * Muestra el título, artista y año de grabación de la canción.
	 */
	@Override
	public String toString() {
		return "\nPosición " + puesto + ": \n\t -Título: " + getTitulo() + "\n\t -Artista: " + getArtista() + "\n\t - Año de grabación: " + getAnno();
	}
}