package examenes;

public class Combatiente {
	
	private String nombre;
	private int ganadas;
	private int empatadas;
	private int perdidas;
	
	public Combatiente (String nombre, int ganadas, int empatadas, int perdidas){
		
		this.nombre = nombre;
		this.ganadas = ganadas;
		this.empatadas = empatadas;
		this.perdidas = perdidas;
	}

	public int puntajeCaribe(){
		int puntaje = this.ganadas * 3 + this.empatadas;
		
		return puntaje;
	}
	
	public int getPerdidas(){
		
		return this.perdidas;
	}
}
	
class Torneo{
	
	private Combatiente [] combatientes;
	int participantes = 0;
	
	public Torneo (int participantes){
		if(participantes <= 0){
			throw new Error("numero invalido");
		}
		
		combatientes = new Combatiente [participantes];
	}
	
	public void agregar (Combatiente combatiente){
		
		if (participantes < combatientes.length){
			
			combatientes[participantes] = combatiente;
		}
		participantes++;
	}
	
	public Combatiente mejorPuntaje(){
		
		Combatiente combatienteMayorPuntaje = combatientes[0];
		int mayorPuntaje = 0;
		
		for (int i = 0; i < participantes;i++){
			
			if ( combatientes[i].puntajeCaribe() > mayorPuntaje){
				
				mayorPuntaje = combatientes[i].puntajeCaribe();
				
				combatienteMayorPuntaje = combatientes[i];
			}
			
		}
		
		return combatienteMayorPuntaje;
	}
	
	public Combatiente premioEspecial(){
		int torneosPerdidos = 0;
		Combatiente combatienteQueMasPerdio =combatientes[0];
		
		for (int i = 0; i < participantes;i++){
			
			if (combatientes[i].getPerdidas() > torneosPerdidos){
				torneosPerdidos = combatientes[i].getPerdidas();
				combatienteQueMasPerdio = combatientes[i];
			}
		}
		return combatienteQueMasPerdio;
	}
	
	public Combatiente getCombatiente(int posicion){
		
		return combatientes[posicion];
	}

}

