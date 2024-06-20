import org.junit.Test;
import org.junit.Assert;

public class TestPronosticoSemanal {
	
	@Test (expected = Error.class)
	public void obtenerTemperaturaDeUnDiaNegativoDaError(){
		
		PronosticoSemanal pronostico = new PronosticoSemanal();
		
		pronostico.obtenerTemperatura(-2);
	}
	
	@Test (expected = Error.class)
	public void pronosticarTemperaturaDeUnDiaMayorA7DaError(){
		
		PronosticoSemanal pronostico = new PronosticoSemanal();
		
		pronostico.pronosticarTemperatura(8, 28);
	}
	
	
	@Test
	public void pronosticoTemperaturaParaElDia3Con30YobtengoLaTemperaturaDelDia3Con30(){
		
		PronosticoSemanal pronostico = new PronosticoSemanal();
		
		pronostico.pronosticarTemperatura(3, 30);
		double temperatura = pronostico.obtenerTemperatura(3);
		
		Assert.assertEquals(30, temperatura,0.001);
		
	}
	
	@Test
	public void calculaPromedioDeTemperaturasConTemperaturasDe10gradosYda10(){
		
		PronosticoSemanal pronostico = new PronosticoSemanal();
		pronostico.pronosticarTemperatura(1, 10);
		pronostico.pronosticarTemperatura(2, 10);
		pronostico.pronosticarTemperatura(3, 10);
		pronostico.pronosticarTemperatura(4, 10);
		pronostico.pronosticarTemperatura(5, 10);
		pronostico.pronosticarTemperatura(6, 10);
		pronostico.pronosticarTemperatura(7, 10);
		
		double promedio = pronostico.calcularPromedioDeTemperaturas();
		
		Assert.assertEquals(10, promedio, 0.001);
		
	}
	
	@Test
	public void calculaLaMaximaTemperaturaYda65(){
		
		PronosticoSemanal pronostico = new PronosticoSemanal();
		pronostico.pronosticarTemperatura(1, 25);
		pronostico.pronosticarTemperatura(2, 30);
		pronostico.pronosticarTemperatura(3, 2);
		pronostico.pronosticarTemperatura(4, 65);
		pronostico.pronosticarTemperatura(5, 21);
		pronostico.pronosticarTemperatura(6, 50);
		pronostico.pronosticarTemperatura(7, -1);
		
		double maxTemperatura = pronostico.buscarMaximaTemperatura();
		
		Assert.assertEquals(65, maxTemperatura, 0.001);
		
	}
	
	@Test
	public void calculaLaMinimaTemperaturaYdaMenos35(){
		
		PronosticoSemanal pronostico = new PronosticoSemanal();
		pronostico.pronosticarTemperatura(1, 60);
		pronostico.pronosticarTemperatura(2, 25);
		pronostico.pronosticarTemperatura(3, 31);
		pronostico.pronosticarTemperatura(4, -12);
		pronostico.pronosticarTemperatura(5, -35);
		pronostico.pronosticarTemperatura(6, 52);
		pronostico.pronosticarTemperatura(7, 2);
		
		double minTemperatura = pronostico.buscarMinimaTemperatura();
		
		Assert.assertEquals(-35, minTemperatura,0.001);
		
	}

}
