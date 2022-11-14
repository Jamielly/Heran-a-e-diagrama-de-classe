package aula3;

import javax.xml.crypto.Data;

public class Gerente extends Funcionario {
	public String area;
	
	public Gerente(String area, String nome,Data nascimento, float salario) {
		super();
		this.area = area;
	}
	
	public String imprimeDados() {
		// TODO Auto-generated method stub
		super.imprimeDados();
		System.out.println("Nome do gerente...: "+this.nome);
	
	}
	public float calculaImposto() {
		return (float) (this.salario * 0.05);
	}
}
