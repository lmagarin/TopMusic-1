package topMusic;
import java.util.ArrayList;

public class TopMusic {
	
	private ArrayList<Cancion> topMusic;
	
	TopMusic(){
		setTopMusic(new ArrayList<Cancion>());
	}
	
	private ArrayList<Cancion> getTopMusic() {
		return topMusic;
	}

	private void setTopMusic(ArrayList<Cancion> topMusic) {
		this.topMusic = topMusic;
	}
	
	/**
	 * Mira si el �ndice introducido es correcto,
	 * @return true si es correcto y false en el caso contrario (index<0 || index>getTop().size())
	 */
	boolean validarIndice(int index) {
		if (index <= 0 || index >= getTopMusic().size())
			return false;
			return true;
	}
	/**
	 * A�ade una canci�n al top music en la posici�n indicada.
	 * @param cancion Canci�n que se va a a�adir.
	 * @param index Posici�n en la que se quiere colocar la canci�n.
	 */
	String add(int index, String titulo, String artista, int anno){	
			if(getTopMusic().contains(new Cancion(titulo)))
				return "La canci�n ya existe";
				topMusic.add(index, new Cancion(titulo, artista, anno));
				return "Canci�n a�adida";
	}
	
	/**
	 * Muestra los 10 mejores.
	 */
	String top10() {
		ArrayList<Cancion> top10 = new ArrayList<Cancion>();
		int i = 0;
		for (Cancion cancion : topMusic) {
			if (i++ == 10)
				break;
			top10.add(cancion);
		}
		return "Los 10 mejores son: " + top10.toString();
	}
	
	/**
	 * Saca una canci�n del top music
	 * @param cancion Canci�n que se va a sacar.
	 * @return
	 */
	String sacar(int index){
		if(!validarIndice(index))
			return "La posici�n introducida es incorrecta.";
    	if(topMusic == null){
            return "No se ha podido eliminar, ya que la lista no contiene elementos.";
        }
		topMusic.remove(index);
		return "Canci�n eliminada.";
	}
	
	/**
	 * Muestra el top (canci�n m�s escuchada).
	 * @param topMusic Lista de canciones
	 * @return
	 */
    Cancion cancionMasEscuchada(){
		return topMusic.get(0);
	}
    
    /**
	 * A�ade una cancion al final de la lista.
	 * @param cancion
	 */
	public void add(String titulo, String artista, int anno) {
		getTopMusic().add(new Cancion(titulo, artista, anno));	
	}
	
    /**
     * Sube de puesto una canci�n.
     * @param index �ndice de la canci�n que se quiere subir.
     * @return 
     */
    public String subirPuesto(int index) {
    	if (!validarIndice(index)) {
    		return "El �ndice introducido no es correcto!";
    	}
    	if (topMusic == null) {
			return "No se ha podido subir, ya que la lista no contiene elementos.";
		}
    	topMusic.add(index - 1, topMusic.remove(index));
    		return "La canci�n se ha subido de puesto correctamente.";
    	}
	
    /**
     * Baja de puesto una canci�n.
     */
	String bajarPuesto(int index){
		if (!validarIndice(index)) {
    		return "El �ndice introducido no es correcto!";
    	}
		if (topMusic == null) {
			return "No se ha podido bajar de puesto, ya que la lista no contiene elementos.";
		}
    	topMusic.add(index + 1, topMusic.remove(index));
    		return "La canci�n se ha bajado de puesto correctamente.";
	}
    
    /**
     * Muestra el top music.
     */
	@Override
	public String toString() {
		return "TopMusic. \nCancion:" + getTopMusic();
	}
}