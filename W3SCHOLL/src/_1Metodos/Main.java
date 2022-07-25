package _1Metodos;

public class Main {
	
	static void myMethod() {
		// static significa que el método pertenece a la clase Main y no a un objeto de la clase Main
		// void significa que este método no tiene un valor de retorno.
		// myMethod() es el nombre del método
		System.out.println("Metodo que imprime varias veces porque asi lo llamamos ");
	}

	public static void main(String[] args) {
		myMethod();
		myMethod();
		myMethod();
		myMethod();
	}

}
