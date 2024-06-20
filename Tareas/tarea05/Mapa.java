package tarea05;

public class Mapa {
	
	private Posicion posicionCosa = new Posicion();
	private int distancia = 1;
	private int x;
	private int y;
	private boolean cosaEncontrada = false;
	
	
	

	private Cosas[][] cosas;

	public Mapa(int filas, int columnas) {
		this.cosas = new Cosas[filas][columnas];
		for (int i = 0; i < this.cosas.length; i++)
			for (int j = 0; j < this.cosas[i].length; j++)
				cosas[i][j] = Cosas.NADA;
	}

	/**
	 * Coloca la cosa en una posición del mapa. Sirve para
	 * preparar los mapas
	 * @param cosa, la cosa a colocar
	 * @param x, la posición donde colocar la cosa en x
	 * @param y, la posición donde colocar la cosa en y
	 */
	public void colocar(Cosas cosa, int x, int y) {
		
		if (estaEnElMapa(x,y)){
			
			cosas[x][y] = cosa;
		}
		else{
			throw new Error("La posicion debe estar dentro del mapa");
		}
		
		
		
	}
	
	/**
	 * Buscará la cosa más cercana desde la posición suministrada
	 * @param cosa, la cosa a buscar. No debe ser Cosas.NADA
	 * @param x, la posición de origen en x
	 * @param y, la posición de origen en y
	 * @return la posicion de la cosa más cercana a x, y
	 */
	public Posicion buscarCosaMasCercana(Cosas cosa, int x, int y) {
		
		int distanciaMax = (cosas.length + cosas[x].length) - 2;
		int i = 0;
		
		while (i < distanciaMax && !cosaEncontrada){
			
			if (cosas [x][y] == cosa && estaEnElMapa(x,y)){
				posicionCosa.x = x;
				posicionCosa.y = y;
				cosaEncontrada = true;
			}
			
			diagonalSuperiorIzquierda(cosa,x,y);
			diagonalInferiorIzquierda(cosa,x,y);
			diagonalInferiorDerecha(cosa,x,y);
			diagonalSuperiorDerecha(cosa,x,y);
			i++;
			distancia++;
			
		}
		
		return posicionCosa;	
		
	}
	
	private boolean estaEnElMapa(int x, int y){
		
		boolean estaEnMapa = false;
		
		if (x >= 0 && x < cosas.length && y >= 0 && y < cosas[x].length){
			estaEnMapa = true;
		}
		
		return estaEnMapa;
	}
	
	private void diagonalSuperiorIzquierda(Cosas cosa, int x,int y){
	
		this.x = x - distancia;
		this.y = y;
		
		
		int i = 0;
		
		while(i <= distancia && !cosaEncontrada){
			
			if (estaEnElMapa(this.x,this.y)){
				
				if (cosas [this.x][this.y] == cosa){
					posicionCosa.x = this.x;
					posicionCosa.y = this.y;
					cosaEncontrada = true;
				}
			}
			this.x = this.x + 1;
			this.y = this.y - 1;
			i++;
		}	
	}	
	
	private void diagonalInferiorIzquierda(Cosas cosa, int x, int y){
		
		this.x = x;
		this.y = y - distancia;
		
		int i = 0;
		
		while (i <= distancia && !cosaEncontrada){
			
			if (estaEnElMapa(this.x,this.y)){
				
				if (cosas [this.x][this.y] == cosa){
					posicionCosa.x = this.x;
					posicionCosa.y = this.y;
					cosaEncontrada = true;
				}
			}
			this.x = this.x + 1;
			this.y = this.y + 1;
			i++;
		}
	}
	
	private void diagonalInferiorDerecha(Cosas cosa, int x, int y){
		
		this.x = x + distancia;
		this.y = y;
		
		int i = 0;
		
		while (i <= distancia && !cosaEncontrada){
			
			if (estaEnElMapa(this.x,this.y)){
				
				if (cosas [this.x] [this.y] == cosa){
					posicionCosa.x = this.x;
					posicionCosa.y = this.y;
					cosaEncontrada = true;
				}
			}
			this.x = this.x - 1;
			this.y = this.y + 1;
			i++;
		}
	}
	
	private void diagonalSuperiorDerecha(Cosas cosa, int x, int y){
		
		this.x = x;
		this.y = y + distancia;
		
		int i = 0;
		
		while (i <= distancia && !cosaEncontrada){
			
			if(estaEnElMapa(this.x,this.y)){
				
				if (cosas [this.x][this.y] == cosa){
					posicionCosa.x =this.x;
					posicionCosa.y = this.y;
					cosaEncontrada = true;
				}
			}
			this.x = this.x - 1;
			this.y = this.y - 1;
			i++;
		}
	}
	
	
	
	/**
	 * Buscará la cosa más lejana desde la posición suministrada
	 * @param cosa, la cosa a buscar. Puede ser Cosas.NADA
	 * @param x, la posición de origen en x
	 * @param y, la posición de origen en y
	 * @return la posicion de la cosa más lejana a x, y
	 */
	public Posicion buscarCosaMasLejana(Cosas cosa, int x, int y) {
		
		cosaEncontrada = false;
		
		int distanciaMax = (cosas.length + cosas[x].length) - 2;
		distancia = distanciaMax;
		int i = 0;
		
		while (i < distanciaMax && !cosaEncontrada && distancia > 0){
			
			diagonalInferiorIzquierda(cosa,x,y);
			diagonalSuperiorIzquierda(cosa,x,y);
			diagonalSuperiorDerecha(cosa,x,y);
			diagonalInferiorDerecha(cosa,x,y);
			i++;
			distancia--;
			
		}
		if (cosas [x][y] == cosa && estaEnElMapa(x,y)){
			posicionCosa.x = x;
			posicionCosa.y = y;
			cosaEncontrada = true;
		}
		
		return posicionCosa;
		
	}
	
}

class Posicion {
	int x, y;
	
}

enum Cosas {
	ENEMIGO, FRUTA, NADA, PARED
}