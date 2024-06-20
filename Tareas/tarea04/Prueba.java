package tarea04;


public class Prueba {
	
	int edad = 25;
	boolean esConductor = false;
	
	public Prueba (){
		
		if (!(edad >= 18 && !esConductor)){
			String resultado = "Puede tomar";
			System.out.println(resultado);
		}
		
	}
	

}
