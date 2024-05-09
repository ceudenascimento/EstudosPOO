public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();

        p1.setNome("Céu");
        p1.setSexo("M");
        p2.setNome("Joana");
        p2.setCurso("Informática");
        p3.setNome("Sol");
        p4.setNome("Luiza");
        p4.setSexo("F");
        p4.setSalario(2500.75);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
