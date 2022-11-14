package aula3;

import javax.xml.crypto.Data;

public abstract class Pessoa {
private String nomecliente;
private Data nascimento;

public Pessoa(String nomecliente, Data nascimento) {
	super();
	this.nomecliente = nomecliente;
	this.nascimento = nascimento;
}
	public abstract String imprimeDados();

}
