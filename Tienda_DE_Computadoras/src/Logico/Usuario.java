package Logico;

public class Usuario {
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	
	
	public Usuario() {
		
	}
	public Usuario( String nombre,String apellido, String direccion, String telefono) {
		
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setTelefono(telefono);
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


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}




