class RecolectarMetal {
	
	/*
  	 * Lleva dos Naves, ancladas en la Base hasta un
  	 * Contenedor con METAL, carga ambas Naves con la máxima cantidad
  	 * posible y retorna a la Base donde ambas descargan la Sustancia.
  	 */
 	void ejecutar() {

 		Nave serenity = new Nave();
 		Nave atlantis = new Nave();
 		
 		Radar radars = serenity.obtenerRadar();
 		Radar radara = atlantis.obtenerRadar();
 		
 		serenity.despegar();
 		
 		
 		//Nave serenity avanza hasta contenedor
 		for (int irOeste = 0; irOeste < 17; irOeste++)
 			serenity.avanzarAlOeste();
 		for (int irSur = 0; irSur < 6; irSur++)
 			serenity.avanzarAlSur();
 		
 		int metalDisponible = radars.buscarAlSur(Sustancia.METAL);
 		
 		
 		//Se evalua si el metalDisponible es mayor a 100 o menor a 100.
 		if (metalDisponible > 100){
 			serenity.cargarDesdeSur(Sustancia.METAL, 100);
				
			atlantis.despegar();
		 		
			//Nave atlantis avanza hasta contenedor
			
		 	for (int irOeste = 0; irOeste < 18; irOeste++)
		 		atlantis.avanzarAlOeste();
		 	for (int irSur = 0; irSur < 7; irSur++)
		 		atlantis.avanzarAlSur();
		 	
		 	metalDisponible = radara.buscarAlEste(Sustancia.METAL);
 			
 			if (metalDisponible > 100){
 				atlantis.cargarDesdeEste(Sustancia.METAL, 100);
 				
 				for (int irNorte = 0; irNorte < 7; irNorte++)
 					atlantis.avanzarAlNorte();
 				for (int irEste = 0; irEste < 16; irEste++)
 					atlantis.avanzarAlEste();
 				atlantis.avanzarAlNorte();
 				atlantis.avanzarAlEste();
 				atlantis.avanzarAlEste();
 				atlantis.descargarEnSur(Sustancia.METAL, 100);
 				
 			}
 			else {
 				atlantis.cargarDesdeEste(Sustancia.METAL, metalDisponible);
 				
 				for (int irNorte = 0; irNorte < 7; irNorte++)
 					atlantis.avanzarAlNorte();
 				for (int irEste = 0; irEste < 16; irEste++)
 					atlantis.avanzarAlEste();
 				atlantis.avanzarAlNorte();
 				atlantis.avanzarAlEste();
 				atlantis.avanzarAlEste();
 				atlantis.descargarEnSur(Sustancia.METAL, metalDisponible);
 			}
 			for (int irNorte = 0; irNorte < 6; irNorte++)
 				serenity.avanzarAlNorte();
 			for (int irEste = 0; irEste < 16; irEste++)
 				serenity.avanzarAlEste();
 			serenity.descargarEnEste(Sustancia.METAL, 100);
 			
 		} 
 		else if (metalDisponible < 100){
 			serenity.cargarDesdeSur(Sustancia.METAL, metalDisponible);
 			
 	 		for (int irNorte = 0; irNorte < 6; irNorte++)
 				serenity.avanzarAlNorte();
 			for (int irEste = 0; irEste < 16; irEste++)
 				serenity.avanzarAlEste();
 			serenity.descargarEnEste(Sustancia.METAL, metalDisponible);
 			
 		}
 		else{
 			serenity.cargarDesdeSur(Sustancia.METAL, metalDisponible);
 			
 	 		for (int irNorte = 0; irNorte < 6; irNorte++)
 				serenity.avanzarAlNorte();
 			for (int irEste = 0; irEste < 16; irEste++)
 				serenity.avanzarAlEste();
 			serenity.descargarEnEste(Sustancia.METAL, metalDisponible);
 	 		
 		}
 		
 		
 	}

}
