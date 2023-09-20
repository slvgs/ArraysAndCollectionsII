package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
public static void main(String[] args) {
		
		
		Deque<String> livros = new ArrayDeque<String>();
		
		
		livros.add("O pequeno Príncipe");
		livros.push("Dom quixote");
		livros.push("O hobbit");
		
		
		//como é uma colection Stack, vai começar pelo último até o primeiro da pilha de livros 
//		System.out.println(livros.peek());
//		System.out.println(livros.element());
//		System.out.println(livros.poll());
//		System.out.println(livros.poll());
//		System.out.println(livros.pop());
//		System.out.println(livros.poll());
		
		
		//fila.size() - para ver o tamanho da fila
		//fila.clear() - para limpar a fila
		//fila.isEmpty() - para saber se a fila esta vazia 
		//fila.(remove) lança uma excessão removendo sem chamar o próximo
		//fila.contains(..) - procura o que você procurou. 
		
		
		for(String liv: livros) {
			System.out.println(liv);
		}
		
		
	}

}
