package atividade1303;

public class Substituindo {

	public static void main(String[] args) {
		String espacos = "ispacos";
		String corrigir = espacos.replace("i", "e");
		
		String todosEspacos="e s p a c o";
		String tiraespacos = todosEspacos.replaceAll(" ", "");
		
		System.out.println("Antes: "+ espacos +" Depois: " + corrigir);
		System.out.println("Antes: "+ todosEspacos + " Depois: " + tiraespacos);

	}

}
