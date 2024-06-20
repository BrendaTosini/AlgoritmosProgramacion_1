/**
 * Clase representa el pronósticos de temperaturas para la próxima semana.
 */
public class PronosticoSemanal {

   private double[] temperaturas;

    /**
     * post: deja inicializadas las temperaturas del pronóstico en 25 ºC.
     */
    public PronosticoSemanal() {

   	 temperaturas = new double[7];
   	 for (int i = 0; i < temperaturas.length; i++) {
   		 temperaturas[i] = 25.0;
   	 }
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7, 
     *       siendo 1 lunes y 7 domingo. 
     * post: devuelve la temperatura pronosticada para el día indicado.
     */
    public double obtenerTemperatura(int dia) {
    	
    	diaValido(dia);

   	 	return temperaturas[dia - 1];
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7, 
     *       siendo 1 lunes y 7 domingo.
     * post: cambia la temperatura pronosticada para el día indicado.
     */
    public void pronosticarTemperatura(int dia, double temperatura) {
    	
    	diaValido(dia);
    	
    	temperaturas [dia - 1] = temperatura;
    }
    
    public void diaValido (int dia){
    	
    	if (dia < 1 || dia > 7){
    		throw new Error ("Dia Inválido");
    	}
    }
    
    /**
     * post: devuelve el promedio de las temperaturas pronosticadas.
     */
    public double calcularPromedioDeTemperaturas() {
    	
    	double sumaTemperaturas = 0;
    	
    	for (int i = 0; i < temperaturas.length;i++){
    		sumaTemperaturas = sumaTemperaturas + temperaturas[i];
    	}
    	
    	double promedio = sumaTemperaturas / temperaturas.length;

   	 	return promedio;
    }

    /**
     * post: devuelve la máxima temperatura pronosticada.
     */
    public double buscarMaximaTemperatura() {
    	
    	double maxTemperatura = temperaturas [0];
    	
    	for (int i = 1; i < temperaturas.length; i++){
    		if (temperaturas[i] > maxTemperatura){
    			maxTemperatura = temperaturas [i];
    		}
    	}

    	return maxTemperatura;
    }

    /**
     * post: devuelve la mínima temperatura pronosticada.
     */
    public double buscarMinimaTemperatura() {
    	
    	double minTemperatura = temperaturas [0];
    	
    	for (int i = 1; i < temperaturas.length; i++){
    		if (temperaturas [i] < minTemperatura){
    			minTemperatura = temperaturas [i];
    		}
    	}

    	return minTemperatura;
    }

}
