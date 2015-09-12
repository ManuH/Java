package pruebaej3;

public class Ciudadano extends Humano {
	public String cedula;
	
	
	protected String getCedula() {
		return cedula;
	}


	protected void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public Ciudadano(String nombre, String apellido, String ci) {
		super(nombre, apellido);
		this.cedula = ci;
	}
	
}
