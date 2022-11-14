package aula3;

import javax.xml.crypto.Data;

public class Funcionario extends Pessoa{

	private float salario;

	public Funcionario(String nomef, Data nascimento, float salario) {
		super(nomef, nascimento);
		this.salario = salario;
	}
	
	@Override
	public String imprimeDados() {
		// TODO Auto-generated method stub
		System.out.println("Nome do funcionario...: "+this.nomef);
		System.out.println("Salario...: "+this.salario);
		System.out.println("Data nascimento funcionario...: "+nascimento.getDataNascimento();
	}
	
private float calculaImposto() {
	// TODO Auto-generated method stub
	return (float) (this.salario * 0.03);
}
}
