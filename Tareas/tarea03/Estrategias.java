package tarea03;


public class Estrategias {
	
	/**
	 * Retorna el numero de fruta que resulte mas cercana al personaje.
	 * 
	 * @param x: la posicion en X del personaje
	 * @param y: la posicion en Y del personaje
	 * @param x1: la posicion en X de la primera fruta
	 * @param y1: la posicion en Y de la primera fruta
	 * @param x2: la posicion en X de la segunda fruta
	 * @param y2: la posicion en Y de la segunda fruta
	 * @return 1 si la primera fruta es la más cercana, 2 en caso contrario.
	 */
	public int frutaMasCercana(int x, int y, int x1, int y1, int x2, int y2) {
		
		int pasosAFruta1 =Math.abs(x - x1) + Math.abs(y - y1);
		int pasosAFruta2 =Math.abs(x - x2) + Math.abs(y - y2);
		
		if (pasosAFruta1 < pasosAFruta2){
			
			return 1;
		}
		else{
			return 2;
		}
		
	}
	
	/**
	 * Saca por pantalla las instrucciones necesarias para llegar desde
	 * la posicion actual hasta la posicion objetivo.
	 * 
	 * Ejemplo:
	 * desplazarseHacia(0, 0, 1, 1)
	 * 
	 * Debe sacar por pantalla:
	 * ARRIBA
	 * DERECHA
	 *
	 * Ejemplo 2:
	 * desplazarseHacia(0, 0, -1, -1)
	 * 
	 * Debe sacar por pantalla:
	 * ABAJO
	 * IZQUIERDA
	 * 
	 * @param x: la posicion en X del personaje
	 * @param y: la posicion en Y del personaje
	 * @param xObj: la posicion en X del objetivo
	 * @param yObj: la posicion en Y del objetivo
	 */
	public void desplazarseHacia(int x, int y, int xObj, int yObj) {
		int pasosX = Math.abs(x-xObj);
		int pasosY = Math.abs(y-yObj);
		
		for (int contador = 0; contador < pasosY; contador ++){
			if (yObj > y){
				System.out.println("ARRIBA");
			}
			else {
				System.out.println("ABAJO");
			}
		}
		
		for (int contador = 0; contador < pasosX; contador++){
			if (xObj > x){
				System.out.println("DERECHA");
			}
			else {
				System.out.println("IZQUIERDA");
			}
		}
		
	}

	/**
	 * Saca por pantalla las instrucciones necesarias para alejarse desde
	 * la posicion actual de la posicion del enemigo, a la posición opuesta.
	 * 
	 * Ejemplo:
	 * alejarseDe(0, 0, 1, 2) -> debe ir a la posición -1, -2
	 * 
	 * Debe sacar por pantalla:
	 * ABAJO
	 * ABAJO
	 * IZQUIERDA
	 *
	 * Ejemplo 2:
	 * alejarseDe(1, 0, -2, 1) -> debe ir a la posición (4, -1)
	 *
	 * Debe sacar por pantalla:
	 * ABAJO
	 * DERECHA
	 * DERECHA
	 * DERECHA	 
	 * 
	 * @param x: la posicion en X del personaje
	 * @param y: la posicion en Y del personaje
	 * @param xEnem: la posicion en X del enemigo
	 * @param yEnem: la posicion en Y del enemigo
	 */
	public void alejarseDe(int x, int y, int xEnem, int yEnem) {
		desplazarseHacia(-x,-y,-xEnem,-yEnem);
		
	}

}
