package tarea04;

import org.junit.Test;
import org.junit.Assert;

public class TestSnake {
	
	@Test
	public void seDesplazaArribayLaYCambiaA1(){
		
		Mapa mapa = new Mapa(5,5);
		Snake snake = new Snake(mapa,0,0);
		
		snake.desplazarseHacia(Direccion.ARRIBA);
		int y = snake.getY();
		
		Assert.assertEquals(1, y,0.001);
	}
	
	@Test
	public void seDesplazaHaciaUnLugarQueEstaOcupadoYsnakeMuere(){
		
		Mapa mapa = new Mapa (5,5);
		mapa.ocupar(1, 0);
		Snake snake = new Snake(mapa,0,0);
		
		snake.desplazarseHacia(Direccion.DERECHA);
		boolean estaViva = snake.isViva();
		
		Assert.assertFalse(estaViva);
		
		
	}
	
	@Test (expected = Error.class)
	public void intentaAvanzarAlaDerechaMasAllaDelMapaYsnakeMuere(){
		
		Mapa mapa = new Mapa (5,5);
		Snake snake = new Snake (mapa,4,0);
		
		snake.desplazarseHacia(Direccion.DERECHA);
		
	}
	
	@Test (expected = Error.class)
	public void intentaAvanzarAlaIzquierdaMasAllaDelMapaYsnakeMuere(){
		
		Mapa mapa = new Mapa(5,5);
		Snake snake = new Snake (mapa,0,0);
		
		snake.desplazarseHacia(Direccion.IZQUIERDA);
		
		
	}
	
	@Test (expected = Error.class)
	public void intentaAvanzarHaciaArribaMasAllaDelMapaYsnakeMuere(){
		
		Mapa mapa = new Mapa (5,5);
		Snake snake = new Snake (mapa,0,4);
		
		snake.desplazarseHacia(Direccion.ARRIBA);
		
	}
	
	@Test (expected = Error.class)
	public void intentaAvanzarHaciaAbajaoMasAllaDelMapaYsnakeMuere(){
		Mapa mapa = new Mapa (5,5);
		Snake snake = new Snake(mapa,0,0);
		
		snake.desplazarseHacia(Direccion.ABAJO);
		
		
	}
	
	@Test
	public void seDesplazaHaciaArribaYluegoHaciaAbajoYsnakeMuere(){
		Mapa mapa = new Mapa(5,5);
		Snake snake = new Snake (mapa,0,0);
		
		snake.desplazarseHacia(Direccion.ARRIBA);
		snake.desplazarseHacia(Direccion.ABAJO);
		boolean estaViva = snake.isViva();
		
		Assert.assertFalse(estaViva);
	}
	
	@Test
	public void seDesplazaAlaDerechaYluegoHaciaLaIzquierdaYsnakeMuere(){
		Mapa mapa = new Mapa (5,5);
		Snake snake = new Snake(mapa,0,0);
		
		snake.desplazarseHacia(Direccion.DERECHA);
		snake.desplazarseHacia(Direccion.IZQUIERDA);
		boolean estaViva = snake.isViva();
		
		Assert.assertFalse(estaViva);
	}
	
	@Test
	public void seDesplaza2VecesAlaIzquierda(){
		Mapa mapa = new Mapa(5,5);
		Snake snake = new Snake (mapa,2,0);
		
		snake.desplazarseHacia(Direccion.IZQUIERDA);
		snake.desplazarseHacia(Direccion.IZQUIERDA);
		int x = snake.getX();
		
		Assert.assertEquals(0, x);
	}
	
	@Test (expected = Error.class)
	public void intentaIniciarDesdeUnaPosicionFueraDelMapaYDaError(){
		Mapa mapa = new Mapa(5,5);
		Snake snake = new Snake(mapa,6,6);
	}
	
	@Test
	public void intentaIniciarEnUnaPosicionOcupadaYserpienteMuere(){
		Mapa mapa = new Mapa (5,5);
		mapa.ocupar(1, 0);
		Snake snake = new Snake (mapa,1,0);
		
		boolean estaViva = snake.isViva();
		
		Assert.assertFalse(estaViva);
	}
	
	@Test
	public void intentaAvanzarHaciaUnaPosicionOcupadaYserpienteMuere(){
		Mapa mapa = new Mapa(5,5);
		mapa.ocupar(2, 3);
		Snake snake = new Snake (mapa,2,2);
		
		snake.desplazarseHacia(Direccion.ARRIBA);
		boolean estaViva = snake.isViva();
		
		Assert.assertFalse(estaViva);
	}

}
