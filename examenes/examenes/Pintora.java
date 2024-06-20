package examenes;

public class Pintora {
	  
	
	
	public void pintar(Color[][] pared) {
		
		for (int i = 0; i < pared.length; i++){
			for (int j = 0; j < pared[i].length;j++){
				pared[i][j]= Color.BLANCO;
				
			}
		}
		
		for (int fila = 0; fila < pared.length; fila++){
			for(int columna = 0; columna < pared[fila].length; columna++){
				if (columna == pared[fila].length/2 || (fila == 0 && (columna == pared[fila].length/2 - 1 || columna == pared[fila].length/2 + 1))){
					pared[fila][columna] = Color.VERDE;
				}
			}
		}
		
		
		
		
	    
	}

}

enum Color { BLANCO, VERDE; }