package heranca2;

public abstract class Pessoa {
	public String nome;
	public String cpf;
	public String telefone;
	
	public Pessoa(String _nome, String _cpf, String _telefone) {
		this.nome=_nome;
		this.cpf=_cpf;
		this.telefone=_telefone;
	}
}
