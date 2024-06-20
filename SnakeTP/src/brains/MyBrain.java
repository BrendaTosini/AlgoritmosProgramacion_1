package brains;

import java.util.List;

import edu.unlam.snake.brain.Brain;
import edu.unlam.snake.engine.Direction;
import edu.unlam.snake.engine.Point;

public class MyBrain extends Brain {
	
	// Pueden agregarse todos los atributos necesarios
	
	public MyBrain() {
		super("Grupo C");
	}

	/**
	 * Retorna el próximo movimiento que debe hacer la serpiente.
	 * @param head, la posición de la cabeza
	 * @param previous, la dirección en la que venía moviéndose
	 */
	//pre Recibe el punto de la cabeza y la direccion en la que se esta moviemndo la snake
	//post retorna la proxima direccion de la snake
	public Direction getDirection(Point head, Direction previous) {
		List<Point> fruits = info.getFruits();
		List<Point> snake = info.getSnake();
		List<List<Point>> enemies = info.getEnemies();
		List<Point> obstacles = info.getObstacles();
	
		
		Point frutaCercana = frutaMasCercana(head,fruits);
		Direction proximaDireccion;
		Point puntoDerecha;
		Point puntoAdelante;
		
		
		if (previous == Direction.DOWN){
			
			proximaDireccion = siguienteMovimiento1(frutaCercana.getX(), head, previous);
			puntoDerecha = new Point (head.getX() - 1, head.getY());
			puntoAdelante = new Point (head.getX(), head.getY() - 1);
			
			
		}
		else if (previous == Direction.UP){
				
			proximaDireccion = siguienteMovimiento2(frutaCercana.getX(), head, previous);
			puntoDerecha = new Point (head.getX() + 1, head.getY());
			puntoAdelante = new Point (head.getX(), head.getY() + 1);
			
		}
		else if (previous == Direction.RIGHT){
				
			proximaDireccion = siguienteMovimiento3(frutaCercana.getY(),head,previous);
			puntoDerecha = new Point (head.getX(), head.getY() -1);
			puntoAdelante = new Point (head.getX() + 1, head.getY());
			
		}
		else{
				
			proximaDireccion = siguienteMovimiento4(frutaCercana.getY(), head, previous);
			puntoDerecha = new Point (head.getX(), head.getY() + 1);
			puntoAdelante = new Point (head.getX() - 1, head.getY());
			
		}
		
		proximaDireccion = esquivarObstaculo(obstacles,snake,enemies,head,previous,proximaDireccion,puntoDerecha,puntoAdelante);
		
	
		return proximaDireccion;

	}
	
	
	
	
	/*POST: Retorna la proxima direccion*/
	
	private Direction esquivarObstaculo(List<Point> obstaculos, List<Point> snake, List<List<Point>> enemies, Point head, Direction previous, Direction proximaDireccion, Point puntoDerecha, Point puntoAdelante){
		
		Point proximo_punto=new Point (proximaDireccion.move(head));
		
		
		if (obstaculos.contains(proximo_punto) || snake.contains(proximo_punto) || buscarPunto(enemies,proximo_punto)){
			if (obstaculos.contains(puntoAdelante) || snake.contains(puntoAdelante) || buscarPunto(enemies, puntoAdelante)){
				
				if (obstaculos.contains(puntoDerecha) || snake.contains(puntoDerecha) || buscarPunto(enemies, puntoDerecha)){
					
					proximaDireccion = previous.turnLeft();
				}
				else{
					proximaDireccion = previous.turnRight();
				}
			}
			else{
				proximaDireccion = previous;
			}
		}	
		
		return proximaDireccion;
	}
	 /* post: devuelve true si algunas de las listas poseen el punto y falso en caso contrario.
	 * @param lista
	 * @param punto
	 * @return
	 */
	private boolean buscarPunto(List<List<Point>> lista, Point punto) {
		boolean respuesta = false;
		//int ejey=punto.getY()+1;
		//int ejex=punto.getX()+1;
		//Poit mipunto=
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).contains(punto)) {
				respuesta = true;
				
			}
		}
		return respuesta;
	}

	
	/*POST:retorno la proxima direccion
	 */
	
	private Direction siguienteMovimiento1(int frutaX, Point head, Direction previous){
		
		Direction direccion;
		
		
		if (frutaX > head.getX()){
			
			direccion = previous.turnLeft();
		}
		else if (frutaX < head.getX()){
			
			direccion = previous.turnRight();
		}
		else{
			direccion = previous;
		}
		
		
		return direccion;
	}
	
	private Direction siguienteMovimiento2(int frutaX, Point head, Direction previous){
		
		Direction direccion;
		
		if(frutaX > head.getX()){
			
			direccion = previous.turnRight();
		}
		else if (frutaX < head.getX()){
			
			direccion = previous.turnLeft();
		}
		else{
			direccion = previous;
		}
		
		
		return direccion;
	}
	
	private Direction siguienteMovimiento3(int frutaY, Point head,Direction previous){
		
		Direction direccion;
		
		if (frutaY > head.getY()){
			
			direccion = previous.turnLeft();
		}
		else if ( frutaY < head.getY()){
			
			direccion = previous.turnRight();
		}
		else{
			direccion = previous;
		}
		
		
		return direccion;
	}
	
	private Direction siguienteMovimiento4 (int frutaY, Point head, Direction previous){
		
		Direction direccion;
		
		if (frutaY > head.getY()){
			
			direccion = previous.turnRight();
		}
		else if (frutaY < head.getY()){
			
			direccion = previous.turnLeft();
		}
		else{
			direccion= previous;
		}
		
		
		return direccion;
	}
	
	
	/*POST:Retorna la fruta mas cercana
	 */
	private int calcularDistancia(Point fruta, Point cabeza) {
		int resultado = Math.abs(cabeza.getX() - fruta.getX()) + Math.abs(cabeza.getY() - fruta.getY());
			return resultado;
		}

	private Point frutaMasCercana(Point head, List<Point> fruits) {
			Point masCercana = fruits.get(0);
			int distancia = calcularDistancia(fruits.get(0), head);
			
			for (int i = 1; i < fruits.size(); i++) {
				
				if (distancia > calcularDistancia(fruits.get(i), head)) {
					
					distancia = calcularDistancia(fruits.get(i), head);
					masCercana = fruits.get(i);
				}
			}
			return masCercana;
		}
   /*
	private Point frutaMasCercana(Point head, List<Point> fruits){
		
		int distanciaPrimeraFruta = calcularDistancia(head,fruits.get(0));
		Point frutaCercana = fruits.get(0);
		
		for (int i = 1; i < fruits.size(); i++){
			
			//int distanciaAfruta = calcularDistancia(head,fruits.get(i));
			
			if (distanciaAfruta > distanciaPrimeraFruta){
				distanciaAfruta = calcularDistancia(head,fruits.get(i));
				frutaCercana = fruits.get(i);
			}
		}
		return frutaCercana;
	}*/
	/*POST: Retorna la distancia entre la Snake y la futa
	 
	private int calcularDistancia(Point head, Point fruit){
		
		int distanciaAfruta = Math.abs(head.getX() - fruit.getX()) + Math.abs(head.getY() - fruit.getY());
		
		return distanciaAfruta;
	}
	*/
	
	
}

