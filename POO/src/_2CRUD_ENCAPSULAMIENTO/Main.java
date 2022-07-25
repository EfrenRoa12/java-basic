package _2CRUD_ENCAPSULAMIENTO;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = null;
		Persona persona = null;
		// mismos atributos de la clase persona
		String nombre;

		int estatura;

		int menu = 0;
		int men = 0;

		try {
			do {
				System.out.println("Bienvenido al menu ");
				System.out.println("1) Alta ");
				System.out.println("2) Editar");
				System.out.println("3) Mostrar ");
				System.out.println("4) Salir ");
				// INICIALIZAMOS EL VALOR
				entrada = new Scanner(System.in);
				// INICIALIZAMOS EL MENU
				menu = entrada.nextInt();
				switch (menu) {
				case 1:
					System.out.println("Escribe el id: ");
					entrada = new Scanner(System.in);
					int id = entrada.nextInt();
					System.out.println("Escribe el nombre: ");
					entrada = new Scanner(System.in);
					nombre = entrada.nextLine();
					System.out.println("Escribe el apellido: ");
					entrada = new Scanner(System.in);
					String apellido = entrada.nextLine();
					System.out.println("Escribe el edad: ");
					entrada = new Scanner(System.in);
					int edad = entrada.nextInt();
					persona = new Persona();
					persona.setNombre(nombre);
					persona.setApellido(apellido);
					persona.setEdad(edad);
					persona.setId(id);
					System.out.println("Se dio de alta persona " + persona.getNombre());
					break;
				case 2:

					do {
						System.out.println("Menu editar ");
						System.out.println("1) id ");
						System.out.println("2) nombre");
						System.out.println("3) apellido ");
						System.out.println("4) edad ");
						System.out.println("5) menu principal ");
						// INICIALIZAMOS EL VALOR
						entrada = new Scanner(System.in);
						// INICIALIZAMOS EL MENU
						men = entrada.nextInt();
						switch (men) {
						case 1:
							System.out.println("Escribe el id: ");
							entrada = new Scanner(System.in);
							id = entrada.nextInt();
							persona.setId(id);
							System.out.println("se edito el id: " + persona.getId());
							break;
						case 2:
							System.out.println("Escribe el nombre: ");
							entrada = new Scanner(System.in);
							nombre = entrada.nextLine();
							persona.setNombre(nombre);
							System.out.println("se edito el nombre: " + persona.getNombre());
							break;
						case 3:
							System.out.println("Escribe la apellido: ");
							entrada = new Scanner(System.in);
							apellido = entrada.nextLine();
							persona.setApellido(apellido);
							System.out.println("se edito el apellido: " + persona.getApellido());
							break;

						case 4:
							System.out.println("Escribe la edad: ");
							entrada = new Scanner(System.in);
							edad = entrada.nextInt();
							persona.setEdad(edad);
							System.out.println("se edito la edad: " + persona.getEdad());
							break;

						case 5:

							System.out.println("salir");
						}

					} while (men < 5);
					System.out.println("se edito correctamente");
					break;

				case 3:
					System.out.println("Mostrar");
					System.out.println("el id es: " + persona.getId());
					System.out.println("el nombre es: " + persona.getNombre());
					System.out.println("el apellido es: " + persona.getApellido());
					System.out.println("la edad es: " + persona.getEdad());
					break;
				case 4:
					System.out.println("salir");
				}

			} while (menu < 4);
		} catch (Exception e) {
			System.out.println("Error intente de nuevo...");
		}

	}

}
