public class Calculadora {   
	

    /** pre numero > 0
     *  post devuelve la cantidad de divisores que tiene número.
     */
    public int contarDivisores(int numero){
    	
    	int divisores = 0;
    	
    	if (numero <= 0){
    		throw new Error ("Numero tiene que ser mayor a 0");
    	}
    	
    	for (int divisor = 1; divisor <= numero; divisor++){
    		if (numero % divisor == 0){
    			divisores++;
    		}
    	}
    	return divisores;
    }
}
