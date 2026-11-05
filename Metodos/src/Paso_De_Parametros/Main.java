package Paso_De_Parametros;

public class Main {

	public static void main(String[] args) {
			
		Persona p1 = new Persona("Carlos");
		System.out.println("Primera Persona: "+p1.getName());
		
		Persona p2 = new Persona("Juan");
		System.out.println("Segunda Persona: "+p2.getName());
		
		
		Test.swap(p1, p2);
		System.out.println("Primera Persona: "+p1.getName());
		System.out.println("Segunda Persona: "+p2.getName());

	}

}
