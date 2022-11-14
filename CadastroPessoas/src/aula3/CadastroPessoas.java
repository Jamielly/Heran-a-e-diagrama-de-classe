package aula3;

import java.util.ArrayList;

public class CadastroPessoas {

	public int qtdAtual = 0;
	public ArrayList<Pessoa> cadastroPessoas = new ArrayList<Pessoa>();
	
	public void cadastraPessoa(Pessoa pessoa) {
		cadastroPessoas.add(pessoa);
		qtdAtual += 1;
	}
	
	public void imprimeCadastro(Pessoa pessoa) {
		System.out.println(pessoa.imprimeDados());
	}
}
