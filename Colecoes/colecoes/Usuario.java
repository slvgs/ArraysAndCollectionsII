package colecoes;

import java.util.Objects;

public class Usuario {
String nome;
	
	Usuario(String nome){
		this.nome = nome;
	}
	
	public String toString() {
		return "é  " + this.nome;
	} // implicitamente caso chamar qualquer método no list com o obj usuário ele irá imprimir no console junto com o metodo "toString" já declarado aqui no obj usuário 
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}


}
