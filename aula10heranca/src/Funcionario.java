public class Funcionario extends Pessoa {
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

    public void mudarTrabalho(){
        this.empregado=!this.empregado;//negando o empregado ou seja quando aciono esse metodo se ele tiver empregado fica desempregado 
        //e vice-versa
    }
}
