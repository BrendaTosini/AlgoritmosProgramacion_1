public class AnalizadorDeMatrices {

	/**
 	 * post: devuelve la cantidad de elementos de ‘matriz’ que
 	 *       tenga al menos un valor 0.
 	 */
	public int contarCeros(double[][] matriz){ 
		
		int ceros = 0;
		
		for (int i = 0; i < matriz.length;i++){
			for (int j = 0; j < matriz[i].length;j++){
				if (matriz[i][j]==0){
					ceros++;
				}
			}
			
		}
		return ceros;
    }
	
	/**
	 * post: devuelve la cantidad de elementos de ‘matriz’ cuyo valor
	 *       esté en el rango [‘desde’, ‘hasta’].
	 */
	public int contarElementosEnElRango(double[][] matriz, double desde, double hasta){
		
		int contar = 0;
		
		for (int i = 0; i < matriz.length;i++){
			for (int j = 0; j < matriz[i].length; j++){
				if (matriz [i][j] >= desde && matriz[i][j] <= hasta){
					contar++;
				}
			}
		}
		return contar;
	}
	
	/**
	 * pre: ‘matriz’ es regular. 	
	 * post: devuelve la cantidad de columnas de ‘matriz’ que tenga 
     *       al menos un valor 0.
	 */
	public int contarColumnasConCeros(double[][] matriz){
		
		int columnas = 0;
		int i = 0;
		int j = 0;
		
		while (j < matriz[0].length){
			i = 0;
			while (i < matriz.length){
				if (matriz[i][j] == 0){
					columnas++;
					i = matriz.length;	
				}
				else{
					i++;
				}				
			}
			j++;
		}
		return columnas;
	}

	
	
}
