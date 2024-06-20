class RecolectarAntimateria {
	
	void ejecutar(){
		
		Nave serenity = new Nave();
		Nave atlantis = new Nave();
		Nave enterprise = new Nave();
		
		Radar radars = serenity.obtenerRadar();
		Radar radara = atlantis.obtenerRadar();
		Radar radare = enterprise.obtenerRadar();
		
		serenity.despegar();
		
		for (int irOeste = 0; irOeste < 3; irOeste++)
			serenity.avanzarAlOeste();
		for (int irSur = 0; irSur < 2; irSur++)
			serenity.avanzarAlSur();
		
		atlantis.despegar();
		
		for (int irOeste = 0; irOeste < 2; irOeste++)
			atlantis.avanzarAlOeste();
		atlantis.avanzarAlSur();
		
		enterprise.despegar();
		
		for (int irSur = 0; irSur < 2; irSur++)
			enterprise.avanzarAlSur();
		enterprise.avanzarAlOeste();
		
		if (radars.buscarAlEste(Sustancia.METAL) > 300){
			
		}
		else if (radars.buscarAlEste(Sustancia.METAL) > 200){
			
		}
		else if (radars.buscarAlEste(Sustancia.METAL >))
			
		
	}
}
