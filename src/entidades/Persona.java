/*
Notas para trabajar con POO en Java

-Establecemos los pasos para trabajar con nuestras clases, definiendo el siguiente orden:

	- Primero nuestras propiedades o atributos usando variables de JAVA
	- Definimos un constructor con parametros (este constructor se define en la 	clase).
	- Tambien tenemos un constructor llamado "constructor por defecto", que se 	define en la instancia de la clase. El inconveniente que tenemos es que solo 	podemos usar uno de los dos.
	 - Por ultimo, definimos los metodos que nuestro objeto va a utilizar. Aqui utilizamos la teoria de funciones (funciones vacias, funciones que retornar un tipo de valor).


	Notas adicionales:
	
	*Sobrecarga de metodos*
	
	-La finalidad de la sobrecarga de metodos es utilizar el mismo nombre del metodo (persona) e ir variando sus parametros. Con esto evitamos usar "Persona1", "Persona 2", etc. para utilizar el mismo metodo.
	
	-Hay que recordar que los datos generalmente vienen del front (formulario). La sobrecarga nos ayuda en comprender distintas situaciones donde tal vez uno de los campos solicitados en el formulario no sea requerido u obligatorio de llenar. Utilizando la sobrecarga, evitamos que el dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podría acarrear errores en la ejecucion de nuestro codigo. De preferencia, es mejor que el dato quede como nulo.


*/


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
