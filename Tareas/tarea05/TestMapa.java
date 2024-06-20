package tarea05;

import org.junit.Test;
import org.junit.Assert;

public class TestMapa {
	
	@Test (expected = Error.class)
	public void intentaColocarUnEnemigoEnUnaPosicionQueNoEstaDentroDelMapaYdaError(){
		
		Mapa mapa = new Mapa (5,5);
		mapa.colocar(Cosas.ENEMIGO, -2, 3);
		
	}
	
	@Test
	public void colocaUnEnemigoEn43(){
		
		Mapa mapa = new Mapa (5,5);
		mapa.colocar(Cosas.ENEMIGO, 4, 3);
		
		Posicion posicionCosa = mapa.buscarCosaMasCercana(Cosas.ENEMIGO, 2, 2);
		
		Assert.assertEquals(4, posicionCosa.x);
		Assert.assertEquals(3, posicionCosa.y);
		
	}
	
	@Test
	public void buscaFrutaMasCercanaYda32(){
		
		Mapa mapa = new Mapa(5,5);
		
		mapa.colocar(Cosas.FRUTA, 3, 2);
		mapa.colocar(Cosas.FRUTA, 4, 0);
		
		Posicion posicionCosa = mapa.buscarCosaMasCercana(Cosas.FRUTA, 0, 4);
		
		Assert.assertEquals(3, posicionCosa.x);
		Assert.assertEquals(2, posicionCosa.y);
		
	}
	
	@Test
	public void buscaFrutaMasCercanaYda21(){
		
		Mapa mapa = new Mapa(5,5);
		mapa.colocar(Cosas.FRUTA, 2, 1);
		mapa.colocar(Cosas.FRUTA, 3, 1);
		
		Posicion posicionCosa = mapa.buscarCosaMasCercana(Cosas.FRUTA,2,2);
		
		Assert.assertEquals(2, posicionCosa.x);
		Assert.assertEquals(1, posicionCosa.y);
	}
	
	@Test
	public void buscaFrutaMasCercanaYda03(){
		
		Mapa mapa = new Mapa (6,6);
		mapa.colocar(Cosas.FRUTA, 0, 3);
		mapa.colocar(Cosas.FRUTA, 3, 3);
		
		Posicion posicionCosa = mapa.buscarCosaMasCercana(Cosas.FRUTA, 1, 3);
		
		Assert.assertEquals(0, posicionCosa.x);
		Assert.assertEquals(3, posicionCosa.y);
	}
	
	@Test
	public void buscarFrutaLejanaDa04(){
		
		Mapa mapa = new Mapa (5,5);
		mapa.colocar(Cosas.FRUTA, 0,4);
		mapa.colocar(Cosas.FRUTA, 1, 3);
		
		Posicion posicionCosa = mapa.buscarCosaMasLejana(Cosas.FRUTA, 2, 2);
		
		Assert.assertEquals(0, posicionCosa.x);
		Assert.assertEquals(4, posicionCosa.y);
	}
	
	@Test
	public void buscarFrutaLejanaDa22(){
		
		Mapa mapa = new Mapa (5,5);
		mapa.colocar(Cosas.FRUTA, 2,2);
		
		
		Posicion posicionCosa = mapa.buscarCosaMasLejana(Cosas.FRUTA, 2, 2);
		
		Assert.assertEquals(2, posicionCosa.x);
		Assert.assertEquals(2, posicionCosa.y);
	}
	
	@Test
	public void buscarFrutaLejanaDa40(){
		
		Mapa mapa = new Mapa (5,5);
		mapa.colocar(Cosas.FRUTA, 4,0);
		mapa.colocar(Cosas.FRUTA, 0, 0);
		
		
		Posicion posicionCosa = mapa.buscarCosaMasLejana(Cosas.FRUTA, 2, 2);
		
		Assert.assertEquals(4, posicionCosa.x);
		Assert.assertEquals(0, posicionCosa.y);
	}


}
