class PatrullarBase {
	
	void ejecutar(){
		
		Nave atlantis = new Nave();
		atlantis.despegar();
		
		atlantis.avanzarAlNorte();
		
		for (int x=0; x < 5; x++){
			atlantis.avanzarAlOeste();
			
			for (int sur = 0; sur < 2; sur++)
				atlantis.avanzarAlSur();
			for (int este = 0; este < 2; este++)
				atlantis.avanzarAlEste();
			for (int norte = 0; norte < 2; norte++)
				atlantis.avanzarAlNorte();
			atlantis.avanzarAlOeste();
		}
		
	}

}
