package clases;

public class Empleado extends Persona {
	private double salario;
	
	public Empleado() {
	}
	public Empleado(String nombre, String direccion, int edad, double salario) {
		super(nombre, direccion, edad);
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + 
			   ", salario=" + salario + 
			   ", direccion=" + direccion + 
			   ", edad=" + edad;
	}
	
	
	
}
