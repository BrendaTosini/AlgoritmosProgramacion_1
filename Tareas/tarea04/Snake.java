package tarea04;

public class Snake {
	
	// se considera un Snake que ocupa un solo casillero del mapa
	private int x, y;
	private boolean estaViva = true;
	private Mapa mapa;
	private Direccion direccionAnterior;
	
	/**
	 * Recibe mapa y posición inicial. El mapa contiene posiciones
	 * previamente ocupadas
	 */
	public Snake(Mapa mapa, int x, int y) {
		this.mapa = mapa;
		this.x = x;
		this.y = y;
		estaLibreParaAvanzar(x,y);
		
	}

	/**
	 * @pre  debe estar viva
	 * @post si el movimiento es posible, debe desplazarse
	 * @post debe morir si tal desplazamiento no es compatible
	 *       o si la posición está ocupada
	 * @post debe actualizar el mapa en todos los casos
	 * @param direccion, la dirección hacia la que debe moverse
	 */
	
	public void desplazarseHacia(Direccion direccion) {
		
		if (isViva() == true){
			
			mapa.desocupar(x, y);
			if (direccion == Direccion.ARRIBA && direccionAnterior != Direccion.ABAJO){
				estaLibreParaAvanzar(x,y+1);
			}
			else if (direccion == Direccion.ABAJO && direccionAnterior != Direccion.ARRIBA){
				estaLibreParaAvanzar(x,y-1);
			}
			else if (direccion == Direccion.DERECHA && direccionAnterior != Direccion.IZQUIERDA){
				estaLibreParaAvanzar(x+1,y);
			}
			else if (direccion == Direccion.IZQUIERDA && direccionAnterior != Direccion.DERECHA){
				estaLibreParaAvanzar(x-1,y);
			}
			else{
				estaViva = false;
			}
			
			direccionAnterior = direccion;
		}
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public boolean isViva() {
		return this.estaViva;
	}
	
	public void estaLibreParaAvanzar(int x,int y){
		
		if ( x >= mapa.tamañoPrimeraDimension() || x < 0 || y >= mapa.tamañoSegundaDimension(x) || y < 0){
			throw new Error ("No se puede ocupar un lugar que esta más alla del mapa");
		}
		else if(mapa.estaOcupado(x, y)==true){
			estaViva = false;
		}
		else{
			mapa.ocupar(x, y);
			this.x = x;
			this.y = y;
			
		}
	}
	
	
}

enum Direccion {
	ARRIBA, ABAJO, IZQUIERDA, DERECHA
}

class Mapa {
	private boolean[][] ocupados;

	
	public Mapa(int ancho, int alto) {
		ocupados = new boolean [alto][ancho];
	}

	public boolean estaOcupado(int x, int y) {
		
		if (ocupados [x][y] == true){
			
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public void ocupar(int x, int y) {
		
		if (estaOcupado(x,y) == true){
			throw new Error ("La posición esta ocupada");
		}
		else{
			ocupados [x][y] = true;
		}
		
	}
	
	public void desocupar(int x, int y) {
		if (x > ocupados.length || x < 0 || y > ocupados[x].length || y < 0){
			throw new Error ("No se puede desocupar un lugar que esta más alla del mapa");
		}
		else{
			ocupados [x][y] = false;
		}
		
	}
	
	public int tamañoSegundaDimension(int x){
		return ocupados[x].length;
	}
	
	public int tamañoPrimeraDimension (){
		return ocupados.length;
	}

}