package heranca2;

public class Funcionario extends Pessoa{
	public double salario;
	public String cargo;
	public Funcionario(String _nome, String _cpf, String _telefone, double _salario, String _cargo) {
		super(_nome, _cpf, _telefone);
		this.salario=_salario;
		this.cargo=_cargo;
	}
	
	
}
