package colecoes;

import java.util.ArrayList;

public class List {
	//Pode ser heterogêneo 
		//Pode ser homogêneo 
		//Aceita oBJS duplicados
		// É ordenado 
		//É indexado
		
		
		@SuppressWarnings("unlikely-arg-type")
		public static void main(String[] args) {
			
			ArrayList<Usuario> lista = new ArrayList<>();
			
			Usuario u1 = new Usuario("Ana");
			
			lista.add(u1);
			lista.add(new Usuario("Carlos"));
			lista.add(new Usuario("Lia"));
			lista.add(new Usuario("Bia"));
			lista.add(new Usuario("Manu"));
			
			System.out.println(lista.get(3));// acessar pelo índice 
			System.out.println(lista.get(2));
			
			
			System.out.println(lista.remove(3));
			System.out.println(lista.remove(new Usuario("Carlos")));
			System.out.println(lista.contains( new Usuario("Manu")));
			
			for(Usuario u: lista) {
				System.out.println(u);
			}
			
		}

}
