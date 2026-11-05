package Paso_De_Parametros;

public class Test {
	
	public static void swap(Persona p1, Persona p2) {
	
		Persona temp = new Persona(p1.getName());
		p1.setName(p2.getName());
		p2.setName(temp.getName());
		
	}

}
