public class App {
    public static void main(String[] args) throws Exception {
     Mamifero m = new Mamifero();
     Reptil r = new Reptil();
     Peixe p = new Peixe();
     Ave a = new Ave();
    Cachorro c = new Cachorro();
    Canguru can = new Canguru();
     m.setPeso(9.3f);
     m.setIdade(2);
     m.setQuantidadeMembros(4);
     m.locomover();
     m.alimentar();
     m.emitirSom();
     r.setPeso(8.8f);
     p.setPeso(2.0f);
     p.setIdade(1);
     p.setQuantidadeMembros(0);
     p.locomover();
     p.alimentar();
     p.emitirSom();
     p.SoltarBolha();
     a.setPeso(2f);
     a.fazerNinho();
     can.usarBolsa();
     can.locomover();
     c.abanarRabo();
     c.enterrarOsso();
    }
}
