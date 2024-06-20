import org.junit.Test;
import org.junit.Assert;


public class TestAnalizadorDeMatrices {
	
	private AnalizadorDeMatrices analizador = new AnalizadorDeMatrices();
    
    @Test
    public void contarCerosEnUnaMatrizDe4Por3QueNoTieneCeros() {
   	 
   	 double[][] matriz = {
   		 { 5.0,  3.5,  2.4 },
   		 { 2.1, -9.2,  5.1 },
   		 { 2.3,  7.9, -2.3 },
   		 { 1.0,  6.1, -8.5 }
   	 };
    
   	 Assert.assertEquals(0, analizador.contarCeros(matriz));
    }
    
    @Test
    public void contarCerosEnUnaMatrizDe2Por4QueTiene3Ceros() {
   	 
   	 double[][] matriz = {
   			 { 2.0, 0.0,  3.4, 0.0 },
   			 { 0.0, 5.7, -2.3, 9.8 },
   	 };
   	 
   	 Assert.assertEquals(3, analizador.contarCeros(matriz));
    }
    
    @Test
    public void contarCerosEnUnaMatrizDe1Por1QueNoTieneCeros() {
   	 
   	 double[][] matriz = {
   			 { 1.6 },
   	 };
   	 
   	 Assert.assertEquals(0, analizador.contarCeros(matriz));
    }
    
    @Test
    public void contarElementosQueEstenEnRango3Hasta15(){
    	
    	double [][] matriz = {
    			{5.0, 0.0 , 8.15, 22, -32},
    			{15.0, 3.4, 6.0 , 13 , -12},
    	};
    	
    	Assert.assertEquals(6, analizador.contarElementosEnElRango(matriz, 3, 15));
    }
    
    @Test
    public void contarColumnas(){
    	
    	double [][] matriz = {
    			{1.0, 23.0, 0.0},
    			{3.0, 0.0, 17.0},
    			{2,5,19},
    			
    	};	
    	
    	Assert.assertEquals(2, analizador.contarColumnasConCeros(matriz));
    	
    }
    
    



}
