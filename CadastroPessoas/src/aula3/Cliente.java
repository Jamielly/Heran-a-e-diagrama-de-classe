package aula3;

import javax.xml.crypto.Data;

public class Cliente extends Pessoa {
private int codigo;

public Cliente(String nomecliente, Data nascimento, int codigo) {
	super(nomecliente, nascimento);
	this.codigo = codigo;
}

public String imprimeDados() {
	System.out.println("Nome do cliente...: "+this.nomecliente);
	System.out.println("Codigo do cliente...: "+this.codigo);
	System.out.println("Data de nascimento do cliente...: "+nascimento.getDataNascimento();
}
}
