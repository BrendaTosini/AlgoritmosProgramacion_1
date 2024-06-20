import org.junit.Test;
import org.junit.Assert;

public class CalculadoraTest {
	
	
	@Test (expected = Error.class)
	public void numeroCeroTiraError(){
		
		Calculadora calculo = new Calculadora();
		
		calculo.contarDivisores(0);
	
	}
	
	@Test (expected = Error.class)
	public void numeroNegativoTiraError(){
		Calculadora calculo = new Calculadora();
		
		calculo.contarDivisores(-3);
	}
	
	@Test
	public void numero4Devuelve3divisores(){
		
		Calculadora calculo = new Calculadora();
		
		int divisores = calculo.contarDivisores(4);
		
		Assert.assertEquals(3, divisores);
	}

}
