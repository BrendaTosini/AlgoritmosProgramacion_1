package examenes;

import org.junit.Test;
import org.junit.Assert;

public class TestCombatiente {
	
	@Test
	public void agregaUnCombatiente(){
		Combatiente participante = new Combatiente("brenda",2,3,0);
		Torneo torneo = new Torneo(1);
		
		torneo.agregar(participante);
		
		Assert.assertEquals(participante, torneo.getCombatiente(0));
	}
	
	@Test
	public void mejorPuntajeParaBrenda(){
		
		Combatiente participante1 = new Combatiente("brenda",2,3,0);
		Combatiente participante2 = new Combatiente ("debora",1,2,3);

		Torneo torneo = new Torneo(2);
		
		torneo.agregar(participante1);
		torneo.agregar(participante2);
		
		Assert.assertEquals(participante1, torneo.mejorPuntaje());
	}
	
	@Test
	public void masPerdidasParaDebora(){
		
		Combatiente participante1 = new Combatiente("brenda",2,3,0);
		Combatiente participante2 = new Combatiente ("debora",1,2,3);

		Torneo torneo = new Torneo(2);
		
		torneo.agregar(participante1);
		torneo.agregar(participante2);
		
		Assert.assertEquals(participante2, torneo.premioEspecial());
	}
	
	@Test (expected = Error.class)
	public void daErrorCuandoIntentoCrearUnTorneoConNumeroNegativoDeParticipantes(){
		Torneo torneo = new Torneo (-1);
	}

}
