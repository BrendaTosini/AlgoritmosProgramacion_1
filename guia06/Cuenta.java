class Cuenta {
	
	int x = 5, y= 8;
	boolean b = true;
	
	void cuentas(){
		for(;b;){
			if (x % 3==0){
				x++;
				System.out.println(x);
			}
			else{
				b = false;
				y--;
				System.out.println(y);
			}
		}
	}

}
