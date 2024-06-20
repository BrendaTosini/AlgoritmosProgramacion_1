class MargenOeste {
	
	/*
	 * Lleva una Nave, anclada en la Base, hasta el casillero
 	 * localizado más al OESTE, en la misma fila que la Base.
 	 *
 	 */
	void ejecutar() {
		
		Nave exploradora = new Nave();
		exploradora.despegar();
	
		
		for (int x = 0; x < 26; x++ ){
			exploradora.avanzarAlOeste();
			
		}
     		
	}


}
