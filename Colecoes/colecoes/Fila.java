package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		//Offer e Add -> Adicionam elemento na fila
		//Diferença é o comportamento quando a fila esta cheia 
		fila.add("Ana");
		fila.offer("Marcos"); //retorna false caso a fila esteja cheia 
		fila.add("Bia");//retorna uma execessão caso a fila esteja cheia 
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Os dois imprime o primeiro da fila e se caso a fila estiver vazia o peek vai retornar nulo e o element irá jogar uma excessão (erro)
		System.out.println(fila.peek());//quando a fila esta vazia retorna null
		
		System.out.println(fila.element());//quando a fila esta vazia retorna excessão 
	
		
		//fila.size() - para ver o tamanho da fila
		//fila.clear() - para limpar a fila
		//fila.isEmpty() - para saber se a fila esta vazia 
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // ele chama o primeiro da fila já removendo, chamando o próximo
		
		//fila.(remove) lança uma excessão removendo sem chamar o próximo
		//fila.contains(..) - procura o que você procurou. 
		
	}
}
