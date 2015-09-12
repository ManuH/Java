package pruebaej3;

public class Humano {
	private String nombre;
	private String apellido;
	
	//constructor
	public Humano(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellido() {
		return apellido;
	}

	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String nombreCompleto (String nombre, String apellido) {
		String nombrecompleto = nombre + " " + apellido;
		return nombrecompleto;
	}
	
}
