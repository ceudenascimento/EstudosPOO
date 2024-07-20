package heranca2;

public class Aluno extends Pessoa{
	public String matricula;
	public Aluno(String _nome, String _cpf, String _telefone, String _matricula){
		super(_nome, _cpf, _telefone);
		this.matricula=_matricula;
	}
}
