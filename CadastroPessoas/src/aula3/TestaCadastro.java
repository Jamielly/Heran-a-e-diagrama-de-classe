package aula3;

public class TestaCadastro {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Mariana bacana", new Data(01,01,2001),10);
		Funcionario funcionario = new Funcionario("Andre mane", new Data(02,12,1998),1250);
		Gerente gerente = new Gerente("Renatao bobao", new Data(02,01,1994),5260,"gerencia");
		
		CadastroPessoas cadastro = new CadastroPessoas();
		
		cadastro.cadastraPessoa(gerente);
		cadastro.cadastraPessoa(funcionario);
		cadastro.cadastraPessoa(cliente);
		
		cadastro.imprimeCadastro(gerente);
		cadastro.imprimeCadastro(funcionario);
		cadastro.imprimeCadastro(cliente);
		
		System.out.println("Quantidade de pessoas...: " + cadastro.qtdAtual);
		
	}
}
