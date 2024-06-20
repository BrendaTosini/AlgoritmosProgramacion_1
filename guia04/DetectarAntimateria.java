class DetectarAntimateria {
	
	/*
  	 * Lleva una Nave, anclada en la Base, hasta el Contenedor
  	 * más cercano, si la cantidad de ANTIMATERIA que tiene es menor
  	 * a 100 regresa a la Base.
  	 */
 	void ejecutar() {

 		Nave victoria = new Nave();
 		victoria.despegar();
 		
 		Radar radar = victoria.obtenerRadar();
 		
 		victoria.avanzarAlSur();
 		victoria.avanzarAlSur();
 		victoria.avanzarAlOeste();
 		
 		
 		if (!(radar.buscarAlOeste(Sustancia.ANTIMATERIA) > 100)){
 			System.out.println(radar.buscarAlOeste(Sustancia.ANTIMATERIA));
 			while (radar.escanearOeste()== Espectro.CONTENEDOR)
 				victoria.atacarAlOeste();
 		}
 		
 	}

}
