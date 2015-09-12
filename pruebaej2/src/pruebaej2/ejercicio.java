package pruebaej2;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables de control
		int suma = 0;
		int entrada = 0;
		do {
			//leo entrada del usuario
			System.out.print("Introduzca un numero: ");
			entrada = Teclado.LeerEntero();
			//si no es una entrada negativa, sumo
			if (entrada >= 0) {
				suma = suma + entrada;
			}
			//si es entrada negativa, salgo
		} while (entrada >= 0);
		// muestro resultado final en pantalla
		System.out.println("La suma es: " + suma);
	}

}
