import java.util.Scanner;

	//EJERCICIO 1
public class Persona {
	Scanner entrada = new Scanner(System.in);
	private String Nombre;
	private String Apellido;
	private long Celular;
	private int Edad;
	
	public Persona(){
		
		
	}
	public void ingreseDatos(){
		System.out.println("Ingrese Nombre: "+Nombre);
		this.Nombre=entrada.next();
		System.out.println("Ingese Apellido: "+Apellido);
		this.Apellido=entrada.next();
		System.out.println("Ingrese Celular: "+Celular);
		this.Celular=entrada.nextLong();
		
	}
	public void sosMayor() {
		System.out.println("Ingrese Edad: "+Edad);
		this.Edad=entrada.nextInt();
		if(this.Edad>=18){
			System.out.println("Sos Mayor");
		}else{
			System.out.println("Sos Menor");
		}
	
		
	}
	public void mostrarDatos(){
		System.out.println("Nombre: "+this.Nombre);
		System.out.println("Apellido: "+this.Apellido);
		System.out.println("Celular: "+this.Celular);
		
		sosMayor();
		System.out.println("Edad: "+this.Edad);

	}
	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getApellido() {
		return this.Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public long getCelular() {
		return this.Celular;
	}
	public void setCelular(long celular) {
		this.Celular = celular;
	}
	public int getEdad() {
		return this.Edad;
	}
	public void setEdad(int edad) {
		this.Edad = edad;
	}
	

	

	}



