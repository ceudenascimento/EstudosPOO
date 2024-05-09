public class App {
    public static void main(String[] args) throws Exception {
    
        Cachorro x = new Cachorro();
        x.reagir("Olá");//testando com as diferentes assinaturar
        x.reagir("Apanhar");
        x.reagir(11,45f);
        x.reagir(19,00f);
        x.reagir(false);
        x.reagir(true);
    }
}