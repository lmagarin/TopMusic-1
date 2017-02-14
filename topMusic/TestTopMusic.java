package topMusic;
import utiles.*;

/**
 * 7. TopMusic. Implementa un programa que gestione una lista de las canciones m�s escuchadas. El usuario podr�:
 * a. A�adir una canci�n (en una posici�n) al TopMusic.
 * b. Sacar un elemento del TopMusic.
 * c. Subir un puesto en el TopMusic.
 * d. Bajar un puesto en el TopMusic.
 * e. Mostrar la lista TopMusic.
 * f. Mostrar la canci�n m�s escuchada.
 * Sobre la canci�n se almacenar� el t�tulo, artista o grupo y a�o de grabaci�n.
 * @author Sole
 * @version 2.7
 */
public class TestTopMusic {
	static TopMusic topMusic;
	
	public static void main(String[] args) {
		
		Menu menu = new Menu("Top Music:",
				new String[] { "A�adir una canci�n (en una posici�n) al TopMusic.", 
						"Sacar un elemento del TopMusic.", 
						"Subir un puesto en el TopMusic.",
						"Bajar un puesto en el TopMusic.", 
						"Mostrar la lista TopMusic.", 
						"Mostrar la canci�n m�s escuchada.",
						"Mostrar top 10.",
						"Salir"});
		topMusic= new TopMusic();
		inicializarTopMusic();
		int opcion;
		do{
			opcion = menu.gestionar();
			switch(opcion){
			case 1: System.out.println(a�adirCancion());
				break;
			case 2: System.out.println(sacarCancion());
				break;
			case 3: System.out.println(subirPuesto());
				break;
			case 4: System.out.println(bajarPuesto());
				break;
			case 5: mostrarTopMusic();
				break;
			case 6: mostrarMasEscuchada();
				break;
			case 7: mostrarTop10();
				break;
			case 8: System.out.println("�Adi�s!");
				break;
			}
		}while(opcion<=7);
	}
			
		private static void inicializarTopMusic(){
			topMusic.add(0, "La tormenta", "sidecars", 2016); 
			topMusic.add(1, "Qu�date", "Funambulista", 2016);
			topMusic.add(2, "Vuelve", "El canto del loco", 2011);
			topMusic.add(3, "En un solo d�a", "Morat", 2015);
			topMusic.add(4, "Mundo marr�n", "Estopa", 2016);
			topMusic.add(5, "Tu calorro", "Estopa", 2012);
			topMusic.add(6, "Por ti", "El canto del loco", 2011);
			topMusic.add(7, "Una foto en blanco y negro", "El canto del loco", 2015);
			topMusic.add(8, "Photograpg", "Ed Sheran", 2016);
			topMusic.add(9, "Por verte sonreir", "La fuga", 2016);
			topMusic.add(10, "Media noche", "Andr�s Su�rez", 2014);
		}
	
		private static String a�adirCancion(){
			return topMusic.add(pedirPosicion("Introduce la posici�n que quiere que ocupe la canci�n"),
					Teclado.leerCadena("Introduce el t�tulo de la canci�n: "),
					Teclado.leerCadena("Introduce el nombre del artista: "),
					Teclado.leerEnteroPositivo("Introduce el a�o de grabaci�n: "));
		}
		
		private static String sacarCancion(){
			return topMusic.sacar(pedirPosicion("Introduce la posici�n de la canci�n que quieres subir de puesto: "));
		}
		
		private static String subirPuesto(){
			return topMusic.subirPuesto(pedirPosicion("Introduce la posici�n de la canci�n que quieres borrar: "));
		}
		
		private static String bajarPuesto(){
			return topMusic.bajarPuesto(pedirPosicion("Introduce la posici�n de la canci�n que quieres bajar de puesto: "));
		}
		
		private static void mostrarTopMusic(){
			System.out.println(topMusic.toString());
		}
		
		private static void mostrarMasEscuchada(){
			System.out.println(topMusic.cancionMasEscuchada());
		}

		private static void mostrarTop10(){
			System.out.println(topMusic.top10());
		}
		
		private static int pedirPosicion(String msg){
			int posicion;
			posicion = Teclado.leerEnteroPositivo(msg);
			posicion = posicion -1;
			return posicion;
		}
}