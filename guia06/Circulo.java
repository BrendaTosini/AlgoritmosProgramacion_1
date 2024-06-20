class Circulo {
	
	private double radio;
	private double diametro;
	private double area;
	private double perimetro;
	
	/**
	 * pre: radio inicial tiene que ser mayor a 0.
	 * post: inicializa radio con el valor indicado.
	 */
	
	public Circulo (int rad){
		if (rad > 0){
			radio = rad;
		}
		
	}
	
	/**
	 * post: devuelve el valor de radio.
	 * 
	 */
	
	public double obtenerRadio(){
		return radio;
	}
	
	/*
	 * post: cambia el valor de radio por uno nuevo.
	 */
	
	public void cambiarRadio(double nuevoRadio){
		radio = nuevoRadio;
	}
	
	/*
	 * post: devuelve el valor del diametro,
	 */
	public double obtenerDiametro(){
		return 2 * radio;
		
	}
	
	/*
	 * post: cambia el valor del diametro por uno nuevo.
	 */
	
	public void cambiarDiametro(int nuevoDiametro){
		diametro = nuevoDiametro;
		cambiarRadio(diametro / 2);
	}
	
	/*
	 * post: devuelve el valor del area.
	 */
	
	public double obtenerArea(){
		return Math.PI * Math.pow(radio, 2);
		
	}
	
	/*
	 * post: cambia el valor de area por uno nuevo.
	 */
	
	public void cambiarArea(int nuevaArea){
		area = nuevaArea;
		cambiarRadio(Math.sqrt(area / Math.PI));
	}
	
	/*
	 * post: devuelve el valor del perimetro.
	 */
	
	public double obtenerPerimetro(){
		return 2 * Math.PI * radio;
	}
	
	/*
	 * post: cambia el valor del perimetro por uno nuevo.
	 */
	
	public void cambiarPerimetro(int nuevoPerimetro){
		perimetro = nuevoPerimetro;
		cambiarRadio(perimetro / (2 * Math.PI));
	}
	
	
}

