package heranca.src;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean empregado;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isEmpregado() {
        return empregado;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }

    public Funcionario(String nome, int idade, String sexo, String setor, boolean empregado){
        super(nome, idade, sexo);
        this.empregado=empregado;
        this.setor=setor;
    }

    public void mudarTrabalho(){
        
    }

}
