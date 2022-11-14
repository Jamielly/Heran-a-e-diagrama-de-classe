package aula3;

public class Data {
	
	private int dia, mes, ano;

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public String getDataNascimento() {
		return Integer.toString(dia) + "/" + 
			Integer.toString(mes) + "/" +
				Integer.toString(ano);
}
	}

