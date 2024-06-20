public class DiasLluviosos {
	
	private boolean[] año;
	
	public void DiasLluviosos(){
		
		año = new boolean [365];
		
	}
	

	public void registrarQueLlovioElDia(int diaDeAnio, boolean llovio){
		
		diaValido(diaDeAnio);
		
		año [diaDeAnio - 1] = llovio;
		
	}
	
	public boolean consultarSiLlovioElDia(int diaDelAnio){
		
		if (año[diaDelAnio] == true){
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public int contarDiasLluviosos(){
		
		int diasLluviosos = 0;
		
		for ( int i = 0; i < año.length; i++){
			if (año[i] == true){
				diasLluviosos++;
			}
		}
		
		return diasLluviosos;
		
	}
	
	public int consultarCuatrimestreMasLluvioso(){
		int primerCuatri = cuantoLlovioEnUnCuatrimestre(1,120);
		int segundoCuatri = cuantoLlovioEnUnCuatrimestre(121,244);
		int tercerCuatri = cuantoLlovioEnUnCuatrimestre(245,365); 
		
		int resultado;
		
		if (primerCuatri > segundoCuatri && primerCuatri > tercerCuatri){
			resultado = 1;
		}
		else if (segundoCuatri > primerCuatri && segundoCuatri > tercerCuatri){
			resultado = 2;
		}
		else{
			resultado = 3;
		}		
		return resultado;
	}
	private int  cuantoLlovioEnUnCuatrimestre(int inicioCuatrimestre, int finalCuatrimestre){
		
		int diasLluviosos = 0;
		
		for (int i =inicioCuatrimestre - 1; i < finalCuatrimestre; i++){
			if (año[i]== true){
				diasLluviosos++;
			}
		}
		return diasLluviosos;
		
		
	}
	
	public int consultarPrimerDiaConLluvia(){
		
		int primerDiaConLluvia = 0;
		
		while (año [primerDiaConLluvia] == false){
			primerDiaConLluvia++;
		}
		
		return primerDiaConLluvia;
	}
	
	public void diaValido(int diaDeAnio){
		
		if(diaDeAnio < 1 || diaDeAnio > año.length){
			throw new Error ("Día Inválido");
		}
	}

}
