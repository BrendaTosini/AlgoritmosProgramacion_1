package tarea02;

enum Cosas {
	ENEMIGO, FRUTA, NADA, PARED
}

public class Tarea02 {

	static Cosas adelante, atras, izquierda, derecha;

	public static void main(String[] args) {
		// Manejamos a un personaje que no puede ir hacia atrás,
		// solamente puede moverse hacia adelante, o hacia los lados.
		// Su principal misión es sobrevivir... y si puede, alimentarse.

		// Se pide realizar la lógica para resolver cualquiera
		// de los siguientes escenarios:

//		escenario01();
//		escenario02();
//		escenario03();
//		escenario04();
//		escenario05();
//		escenario06();
//		escenario07();
//		escenario08();
//		escenario09();
//		escenario10();

		// Se espera que descomentes los escenarios uno a uno, y el código que
		// escribas debajo siempre cumpla con la acción más lógica que debería
		// realizar el personaje.
		// Encontrarás la acción esperada dentro del método que prepara cada
		// escenario.

		// En este ejemplo, se resuelve el primer escenario. Tu código deberá
		// contemplar cualquiera de los escenarios, por lo que deberás anidar
		// ifs, utilizar operadores lógicos y mucho más.

		// ¡A divertirse!

		if (adelante == Cosas.FRUTA || izquierda ==Cosas.FRUTA || derecha == Cosas.FRUTA) {
			System.out.println("Comer fruta");
		}
		else if (adelante == Cosas.NADA){
			System.out.println("Avanzar");
		}
		else if (izquierda == Cosas.NADA){
			System.out.println("Girar izquierda");
		}
		else if (derecha == Cosas.NADA){
			System.out.println("Girar derecha");
		}
		else {
			System.out.println("Morir");
		}

	}

	static void escenario01() {
		adelante = Cosas.FRUTA;
		atras = Cosas.NADA;
		izquierda = Cosas.NADA;
		derecha = Cosas.NADA;

		// Se espera: "Comer fruta"
	}

	static void escenario02() {
		adelante = Cosas.NADA;
		atras = Cosas.NADA;
		izquierda = Cosas.FRUTA;
		derecha = Cosas.NADA;

		// Se espera: "Comer fruta"
	}

	static void escenario03() {
		adelante = Cosas.NADA;
		atras = Cosas.NADA;
		izquierda = Cosas.NADA;
		derecha = Cosas.FRUTA;

		// Se espera: "Comer fruta"
	}

	static void escenario04() {
		adelante = Cosas.NADA;
		atras = Cosas.FRUTA;
		izquierda = Cosas.NADA;
		derecha = Cosas.NADA;

		// Se espera: "Avanzar"
	}

	static void escenario05() {
		adelante = Cosas.NADA;
		atras = Cosas.NADA;
		izquierda = Cosas.NADA;
		derecha = Cosas.NADA;

		// Se espera: "Avanzar"
	}

	static void escenario06() {
		adelante = Cosas.ENEMIGO;
		atras = Cosas.NADA;
		izquierda = Cosas.NADA;
		derecha = Cosas.NADA;

		// Se espera: "Girar izquierda"
	}

	static void escenario07() {
		adelante = Cosas.ENEMIGO;
		atras = Cosas.NADA;
		izquierda = Cosas.ENEMIGO;
		derecha = Cosas.NADA;

		// Se espera: "Girar derecha"
	}

	static void escenario08() {
		adelante = Cosas.ENEMIGO;
		atras = Cosas.NADA;
		izquierda = Cosas.ENEMIGO;
		derecha = Cosas.ENEMIGO;

		// Se espera: "Morir"
	}

	static void escenario09() {
		adelante = Cosas.ENEMIGO;
		atras = Cosas.NADA;
		izquierda = Cosas.PARED;
		derecha = Cosas.PARED;

		// Se espera: "Morir"
	}

	static void escenario10() {
		adelante = Cosas.PARED;
		atras = Cosas.NADA;
		izquierda = Cosas.PARED;
		derecha = Cosas.NADA;

		// Se espera: "Girar derecha"
	}
}