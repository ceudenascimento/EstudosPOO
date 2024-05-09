public class AlunoBolsista extends Aluno{
    private float Bolsa;

    public float getBolsa() {
        return Bolsa;
    }

    public void setBolsa(float bolsa) {
        Bolsa = bolsa;
    }

    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de "+this.nome);
    }
    @Override
    public void pagarMensalidade(){ 
        //sobreescrevendo o método da classe Aluno 
        //que foi herdado por essa classe - AlunoBolsista
        System.out.println(this.nome + " é bolsista. Pagamento facilitado.");
    }

}
