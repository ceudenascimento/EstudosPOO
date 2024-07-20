package heranca;

import java.util.Date;

public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_de_nascimento;
	
	public Pessoa(String _nome, String _cpf, Date _data) {
		this.nome=_nome;
		this.cpf=_cpf;
		this.data_de_nascimento=_data;
	}
}
