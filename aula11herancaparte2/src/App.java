public class App {
    public static void main(String[] args) throws Exception {
        //p1 Pessoa = new Pessoa(); Pessoa é classe abstrata e não pode ser instanciada
        AlunoBolsista b1= new AlunoBolsista();
        b1.setNome("junior");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        Aluno a1 = new Aluno();
        a1.setNome("Rosana");
        a1.pagarMensalidade();
    }
}
