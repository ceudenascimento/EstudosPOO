package poobasico;

public class main {

	public static void main(String[] args) {
		//instanciando uma classe pessoa
		ClassePessoa aluno01=new ClassePessoa();
		aluno01.nome="Ceu";
		aluno01.comer(aluno01.nome);
		
		ClassePessoa aluno02=new ClassePessoa();
		aluno02.nome="Luquinhas";
		aluno02.comer(aluno02.nome);
		
		AtributosClasse pessoa1=new AtributosClasse();
		System.out.printf("O aluno %s %s tem %d anos de idade", pessoa1.nome, pessoa1.sobrenome, pessoa1.idade);
		
	}

}
