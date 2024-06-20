class NoresteYVolver {
	
	void ejecutar(){
		
		Nave atlantis = new Nave();
		
		Radar radarA = atlantis.obtenerRadar();
		
		atlantis.despegar();
		
		for (int irSur = 0; irSur < 10; irSur++){
			while (radarA.escanearSur()==Espectro.ASTEROIDE)
				atlantis.atacarAlSur();
			atlantis.avanzarAlSur();
		}
			
		
		for (int irEste = 0; irEste < 26; irEste++){
			while (radarA.escanearEste()==Espectro.ASTEROIDE || radarA.escanearEste() == Espectro.BASE)
				atlantis.atacarAlEste();
			atlantis.avanzarAlEste();
		}
			
			
		for(int irNorte = 0; irNorte < 20; irNorte++)
			atlantis.avanzarAlNorte();	
		
		for (int irSur = 0; irSur < 20; irSur++)
			atlantis.avanzarAlSur();
		
		for (int irOeste = 0; irOeste < 26; irOeste++)
			atlantis.avanzarAlOeste();
		
		for (int irNorte = 0; irNorte < 9; irNorte++)
			atlantis.avanzarAlNorte();
		
	}	
	
	

}
