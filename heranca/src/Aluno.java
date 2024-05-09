package heranca.src;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String sexo, int matricula, String curso){
        super(nome, idade, sexo);//chamada do construtor da classe Pessoa pra herdar os atributos da instância
        this.matricula=matricula;
        this.curso=curso;
    }
}
