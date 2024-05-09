public class App {
    public static void main(String[] args) throws Exception {
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];

    p[0]= new Pessoa("Ceu", 20, "Não-binário");
    p[1] = new Pessoa ("Sol", 21, "Não binário");

    l[0]= new Livro("Acotar", "Saarah J. Mass", 230, p[0]);
    l[1]= new Livro("Acosf", "Saarah J. Mass", 2412, p[1]);
    l[0]= new Livro("Vermelho branco sangue azul", "Saarah J. Mass", 500, p[1]);
        l[0].detalhes();
}
}
