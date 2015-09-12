package pruebaej3;

public class principal {

	public static void main(String[] args) {
		// seteo variables para constructor
		String nombre = "James";
		String apellido = "Gosling";
		String cedula = "31243210";
		 
		//creo al nuevo ciudadano
		Ciudadano nuevo = new Ciudadano (nombre, apellido, cedula);
		
		System.out.println(nuevo.nombreCompleto(nombre, apellido));
		System.out.println(nuevo.cedula);
	}

}
