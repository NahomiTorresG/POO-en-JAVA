package entidades;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancia de un empleado (que hereda de persona)
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, 		"evilfelipe@gmail.com", "1234567890", "ABCD123", "90871234567", "BellBoy");
		EvilFelipe.mostrarInformacion();
		
		//Empleado Pikachu = new Empleado("Pikachu", 50, "AAA111", "12312312312", 		"Pokemon")
				
		Persona Naruto = new Persona("Naruto", 30, "naruto@gmail.com", 		"5511223344");
		Naruto.mostrarInformacion();
		
		
		System.out.println(Naruto);
		
		
		
		//Instancia de un cliente
		System.out.println();
		System.out.println("Instancia de un cliente");
		
		Cliente Jesus = new Cliente ("Jesus Gonzalez", "ABCD1234", 157654.00f, "1234");
		Jesus.mostrarInfoCliente();
	
		
		//Modificacion de un atributo
		Jesus.nombre = "Evil Jesus";
		//Jesus.setSaldo(0.00f); modificacion sin setter (error)
		Jesus.setSaldo(0.00f); //Modificado con setter
		
		//Impresion del objeto ya modificado
		System.out.println(); //espacio
		Jesus.mostrarInfoCliente();
	}



}
