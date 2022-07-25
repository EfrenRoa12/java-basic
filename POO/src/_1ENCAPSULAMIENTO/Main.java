package _1ENCAPSULAMIENTO;

public class Main {

	public static void main(String[] args) {
		//SE LE CONOCE COMO ENCAPSULAMIENTO
		
		// creamos la instanciacion
		//Animal animal = new Animal("michi",2,"masculino");
		Animal animal = new Animal();
		
		animal.setNombre("joe");
		animal.setEdad(3);
		animal.setGenero("hembra");
		
		animal.getNombre();
		animal.getEdad();
		animal.getGenero();

		System.out.println("el nombre es: " + animal.getNombre() + " edad " + animal.getEdad() + " años "+" genero " + animal.getGenero());

	}
}
