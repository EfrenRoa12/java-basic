package _1ENCAPSULAMIENTO;

public class Animal {
	//Atributos
	private String nombre;
	private int edad;
	private String genero;
	//constructor por defult
	public Animal() {

	}
	//constructor con parametros
	public Animal(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	// CREAMOS EL METODO TO STRING PARA CONVERTIR DE CARACTER A CADENA
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]\n";
	}
	// CREAMOS EL ENCAPSULAMIENTO PARA ACCEDER A LOS ATRIBUTS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
