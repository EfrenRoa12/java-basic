package _2CRUD_ENCAPSULAMIENTO;

public class Persona {

	private String nombre;
	private String apellido;
	private int id;
	private int edad;
	private int estatura;

	public Persona() {

	}

	// 'THIS' en Java es una variable de referencia que hace referencia al objeto
	// actual.
	public Persona(String nombre, String apellido, int id, int edad, int estatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.edad = edad;
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", edad=" + edad + ", estatura="
				+ estatura + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

}
