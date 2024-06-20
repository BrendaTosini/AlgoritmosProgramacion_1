class Espiral {
	
	Nave serenity = new Nave();
	
	/*
	 * post: lleva una Nave, anclada en la Base, para que gire entorno a
	 *       la Base en sentido horario alejándose de ella a medida que
	 *       completa cada vuelta, hasta hacer 3 giros completos.
	 */
	void ejecutar() {
		
		serenity.despegar();
		
		serenity.avanzarAlNorte();
		
		int pasos = 1;
		
		for (int vueltas = 0; vueltas < 3; vueltas++){
			
			irEste(pasos);
			irSur(2 * pasos);
			irOeste(2 * pasos);
			irNorte(2 * pasos + 1);
			irEste(pasos);
			pasos++;
			
			
		}

	}
	
	void irNorte(int pasos){
		for (int contador = 0; contador < pasos; contador++)
			serenity.avanzarAlNorte();
	}
	
	void irSur(int pasos){
		for (int contador = 0; contador < pasos; contador ++)
			serenity.avanzarAlSur();
	}
	
	void irEste(int pasos){
		for (int contador = 0; contador < pasos; contador ++)
			serenity.avanzarAlEste();
	}
	
	void irOeste(int pasos){
		for (int contador = 0; contador < pasos; contador++)
			serenity.avanzarAlOeste();
	}


}
