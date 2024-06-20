package examenes;

import org.junit.Test;
import org.junit.Assert;

public class TestPintora {

	@Test
	public void a(){
		Pintora p = new Pintora();
		Color [][]matriz = new Color [3][3]; 
		p.pintar(matriz);
		Assert.assertTrue(matriz[0][0]== Color.VERDE);
		Assert.assertTrue(matriz[0][1]== Color.VERDE);
		Assert.assertTrue(matriz[0][2]== Color.VERDE);
		Assert.assertTrue(matriz[1][0]== Color.BLANCO);
		Assert.assertTrue(matriz[1][1]== Color.VERDE);
		Assert.assertTrue(matriz[1][2]== Color.BLANCO);////
		Assert.assertTrue(matriz[2][0]== Color.BLANCO);
		Assert.assertTrue(matriz[2][1]== Color.VERDE);
		Assert.assertTrue(matriz[2][2]== Color.BLANCO);
	}
	
	@Test
	public void b(){
		Pintora p = new Pintora();
		Color [][]matriz = new Color [3][5]; 
		p.pintar(matriz);
		Assert.assertTrue(matriz[0][0]== Color.BLANCO);
		Assert.assertTrue(matriz[0][1]== Color.VERDE);
		Assert.assertTrue(matriz[0][2]== Color.VERDE);
		Assert.assertTrue(matriz[0][3]== Color.VERDE);
		Assert.assertTrue(matriz[0][4]== Color.BLANCO);
		Assert.assertTrue(matriz[1][0]== Color.BLANCO);////
		Assert.assertTrue(matriz[1][1]== Color.BLANCO);
		Assert.assertTrue(matriz[1][2]== Color.VERDE);
		Assert.assertTrue(matriz[1][3]== Color.BLANCO);
		Assert.assertTrue(matriz[1][4]== Color.BLANCO);
		Assert.assertTrue(matriz[2][0]== Color.BLANCO);
		Assert.assertTrue(matriz[2][1]== Color.BLANCO);
		Assert.assertTrue(matriz[2][2]== Color.VERDE);
		Assert.assertTrue(matriz[2][3]== Color.BLANCO);
		Assert.assertTrue(matriz[2][4]== Color.BLANCO);
	}
}
