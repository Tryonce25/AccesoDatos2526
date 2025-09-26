package tres;

import java.io.Serializable;

public class Persona  implements Serializable {

	String nombre;
	String altura;
	String edad;
	String telefono;
	
	private static final long serialVersionUID = 1L;
	
	public Persona(String nombre, String altura, String edad, String telefono) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
