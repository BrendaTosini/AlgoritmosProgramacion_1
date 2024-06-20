class MargenEste {
	
	/*
  	 * Lleva una Nave, anclada en la Base, hasta el casillero
  	 * localizado más al ESTE, en la misma fila que la Base.
  	 *
  	 */
 	void ejecutar() {

 		Nave sanson = new Nave(0,20);
 		//sanson.despegar();
 		
 		Radar radar = sanson.obtenerRadar();
 		
// 		for (int x=0; x < 26; x++){
// 			while (radar.escanearEste()==Espectro.ASTEROIDE){
// 				sanson.atacarAlEste();
// 			}
// 			sanson.avanzarAlEste();
// 			
// 		}
 		
 		while (radar.escanearEste()== Espectro.VACIO){
 			sanson.avanzarAlEste();
 			while (radar.escanearEste()== Espectro.ASTEROIDE){
 				sanson.atacarAlEste();
 			}
 		}
 		
 	}

}
