class Punto {
	
	private double x;
	private double y;
	
	/**
	 * POST: inicializa X e Y con el valor indicado.
	 */
	public Punto (double coordenadaX, double coordenadaY){
		this.x = coordenadaX;
		this.y = coordenadaY;
	}
	
	
	/**
	 * POST: devuelve el valor numérico de X.
	 */
	public double obtenerX(){
		return x;
		
	}
	
	/**
	 * 
	 *POST: devuelve el valor numérico de Y.
	 */
	public double obtenerY(){
		return y;
		
	}
	
	/**
	 * 
	 * POST: cambia el valor de X por uno nuevo.
	 */
	public void cambiarX(double nuevoX){
		this.x = nuevoX;
	}
	
	/**
	 * 
	 * POST: cambia el valor de Y por uno nuevo.
	 */
	public void cambiarY(double nuevoY){
		this.y = nuevoY;
		
	}
	
	/**
	 * 
	 * POST: indica true si el punto está sobre el eje X.
	 */
	
	public boolean estaSobreEjeX(){
		return this.y == 0;
		
	}
	/**
	 * 
	 * POST: indica true si el punto está sobre el eje Y.
	 */
	public boolean estaSobreEjeY(){
		return this.x == 0;
		
	}
	
	/**
	 * 
	 * POST: indica si está en el origen.
	 */
	public boolean esElOrigen(){
		//return this.x == 0 && this.y == 0;
		return  estaSobreEjeX() && estaSobreEjeY();
	}
	
	

}
