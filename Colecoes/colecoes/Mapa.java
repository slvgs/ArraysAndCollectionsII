package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
public static void main(String[] args) {
		
		Map<Integer, String> usuario = new HashMap<Integer, String>();
		
		usuario.put(1, "Roberto"); // método put adiciona se caso n existir e substitui/alterar caso existir 
		usuario.put(2,"Ricardo");
		usuario.put(3,"Rebeca");
		usuario.put(4,"Renata");
		usuario.put(5,"Renan");
		
		System.err.println(usuario.size());
		System.out.println(usuario.isEmpty());
		System.out.println(usuario.keySet());
		System.out.println(usuario.values());
		System.out.println(usuario.entrySet());
		System.out.println(usuario.containsKey(2));
		System.out.println(usuario.containsValue("Rebeca"));
		System.out.println(usuario.get(2));
		
		for (int chave: usuario.keySet()) {
			System.out.println(chave);
		}
		
		for(String chaves: usuario.values()) {
			System.err.println(chaves);
		}
		
		for(Entry<Integer, String> registro: usuario.entrySet()) {
			
			System.out.print(registro.getKey() + "==>");
			System.out.println(registro.getValue());
		}
		
		
		
		
	
	
	
	
	
	}

}
