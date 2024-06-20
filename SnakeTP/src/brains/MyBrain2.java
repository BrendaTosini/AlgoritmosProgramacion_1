package brains;

import java.util.List;

import edu.unlam.snake.brain.Brain;
import edu.unlam.snake.engine.Direction;
import edu.unlam.snake.engine.Point;

public class MyBrain2 extends Brain {
	
	// Pueden agregarse todos los atributos necesarios
	
	public MyBrain2() {
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
			
			proximaDireccion = opcion1(frutaCercana.getX(), head, previous);
			puntoDerecha = new Point (head.getX() - 1, head.getY());
			puntoAdelante = new Point (head.getX(), head.getY() - 1);
			
			
		}
		else if (previous == Direction.UP){
				
			proximaDireccion = opcion2(frutaCercana.getX(), head, previous);
			puntoDerecha = new Point (head.getX() + 1, head.getY());
			puntoAdelante = new Point (head.getX(), head.getY() + 1);
			
		}
		else if (previous == Direction.RIGHT){
				
			proximaDireccion = opcion3(frutaCercana.getY(),head,previous);
			puntoDerecha = new Point (head.getX(), head.getY() -1);
			puntoAdelante = new Point (head.getX() + 1, head.getY());
			
		}
		else{
				
			proximaDireccion = opcion4(frutaCercana.getY(), head, previous);
			puntoDerecha = new Point (head.getX(), head.getY() + 1);
			puntoAdelante = new Point (head.getX() - 1, head.getY());
			
		}
		
		
		
		proximaDireccion = esquivarObstaculo(obstacles,snake,enemies,head,previous,proximaDireccion,puntoDerecha,puntoAdelante);
		
	
		return proximaDireccion;
	}
	
	
	
	
	/*PRE: Recibe las listas de obstaculos, snake, enemigos, el proximo punto, 
	 * la direccion previa de la snake, la proxima direccion evaluada por el metodo de la fruta mas cercana y la cabeza de la snake
	 POST: Retorna la proxima direccion*/
	
	private Direction esquivarObstaculo(List<Point> obstaculos, List<Point> snake, List<List<Point>> enemies, Point head, Direction previous, Direction proximaDireccion, Point puntoDerecha, Point puntoAdelante){
		
		Point proximo_punto=new Point(proximaDireccion.move(head).getX(), proximaDireccion.move(head).getY());
		
		if (obstaculos.contains(proximo_punto) || snake.contains(proximo_punto) || enemies.contains(proximo_punto)){
			
			if (obstaculos.contains(puntoAdelante) || snake.contains(puntoAdelante) || enemies.contains(puntoAdelante)){
				
				if (obstaculos.contains(puntoDerecha) || snake.contains(puntoDerecha) || enemies.contains(puntoDerecha)){
					
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
	
	
	/*PRE:Recibe una coordenada de la fruta, el punto de la cabeza, y la direccion de la snake
	 * POST:retorno la proxima direccion
	 */
	
	private Direction opcion1(int frutaX, Point head, Direction previous){
		
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
	
	private Direction opcion2(int frutaX, Point head, Direction previous){
		
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
	
	private Direction opcion3(int frutaY, Point head,Direction previous){
		
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
	
	private Direction opcion4 (int frutaY, Point head, Direction previous){
		
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
	
	
	/*PRE: Recibe el punto de la cabeza de la snake y la lista de frutas
	 * POST:Retorna la fruta mas cercana
	 */
	private Point frutaMasCercana(Point head, List<Point> fruits){
		
		int distanciaPrimeraFruta = calcularDistancia(head,fruits.get(0));
		Point frutaCercana = fruits.get(0);
		
		for (int i = 0; i < fruits.size(); i++){
			
			int distanciaAfruta = calcularDistancia(head,fruits.get(i));
			
			if (distanciaAfruta < distanciaPrimeraFruta){
				
				frutaCercana = fruits.get(i);
			}
		}
		return frutaCercana;
	}
	/*PRE:Recibe el punto de la cabeza de la snake y el punto de la fruta
	 * POST: Retorna la distancia entre la Snake y la futa
	 */
	private int calcularDistancia(Point head, Point fruit){
		
		int distanciaAfruta = Math.abs(head.getX() - fruit.getX()) + Math.abs(head.getY() - fruit.getY());
		
		return distanciaAfruta;
	}
	
	
	
}
