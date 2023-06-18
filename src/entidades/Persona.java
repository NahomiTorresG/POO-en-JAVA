package entidades;

public class Persona {

	//1.-Propiedades o atributos
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	
	
	//2.- Constructor
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	
	//Sobrecarga de metodo (overloading) constructor con 3
	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
	
	//Sobrecarga de metodo (overloading) constructor con 2 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;            
        this.edad = edad;
    }
	
	
	
	
	
	
	//3.- Métodos
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefono: " + telefono);
	}
	
	
	
	
	
	//Metodo main es  una funcion "ejecutora"
	public static void main(String[] args) {
		
		// Instancia de un objeto persona
		Persona Felipe = new Persona("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");
		Persona Nahomi = new Persona("Nahomi", 24, "quiensabe@gmail.com", "1234567890");
		Persona Karla = new Persona("Karla", 24, "Karlitz@gmail.com", "2244556677");
		Persona Zula = new Persona("Zula", 15, "chulita@gmail.com", "1234567890");
		//Uso del metodo mostrarInformacion que pertenece al objeto Felipe/Nahomi/etc.
		Felipe.mostrarInformacion();
		Nahomi.mostrarInformacion();
		Karla.mostrarInformacion();
		Zula.mostrarInformacion();
		
		
		
		
	}

}
