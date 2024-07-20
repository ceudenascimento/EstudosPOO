package heranca2;

public class Professor extends Pessoa{
	public double salario;
	public String disciplinas;
	public Professor(String _nome, String _cpf, String _telefone, double _salario, String _disciplinas) {
		super(_nome, _cpf, _telefone);
		this.salario=_salario;
		this.disciplinas=_disciplinas;
	}
}
