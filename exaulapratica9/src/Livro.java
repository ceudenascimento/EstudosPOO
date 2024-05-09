public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalpaginas;
    private int paginaatual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String titulo, String autor, int totalpaginas, Pessoa leitor){
        this.aberto=false;
        this.titulo=titulo;
        this.autor=autor;
        this.totalpaginas=totalpaginas;
        this.paginaatual=0;
        this.leitor=leitor;

    }
    public void detalhes(){
        System.out.println("LIVRO: "+this.getTitulo());
        System.out.println("AUTOR: "+this.getAutor());
        System.out.println("O TOTAL DE PÁGINAS DELE É: "+this.getTotalpaginas());
        System.out.println("Leitor: "+this.getLeitor());
        System.out.println("Pávina atual"+this.getPaginaatual());
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotalpaginas() {
        return totalpaginas;
    }
    public void setTotalpaginas(int totalpaginas) {
        this.totalpaginas = totalpaginas;
    }
    public int getPaginaatual() {
        return paginaatual;
    }
    public void setPaginaatual(int paginaatual) {
        this.paginaatual = paginaatual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //métodos da interface
    @Override
    public void abrir(){
        this.setAberto(true);
    }
    @Override
    public void fechar(){
        this.setAberto(false);
    }
    @Override
    public void folhear(int p){
        if (this.getAberto()==true && p<=totalpaginas){
            System.out.println("Você está folheando o livro");
            this.paginaatual = p;
        }
        else{
            System.out.println("O livro está fechado. Abra ele para folhear");
        }
    }
    @Override
    public void avancarPag(){
        this.setPaginaatual(getPaginaatual()+1);
    }
    @Override
    public void voltarPag(){
        this.setPaginaatual(getPaginaatual()-1);
    }

}
