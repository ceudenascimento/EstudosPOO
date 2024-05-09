public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("AU AU AU AU");
    }    //método de SOBRECARGA do cachorro
        public void reagir(String frase){
            if (frase.equals("Toma comida") || frase.equals("Olá")){
                System.out.println("abanar e latir");
            }
            else{
                System.out.println("rosnar grrrrrr");
            }
        }
        public void reagir(int hora, int minuto){
            if (hora<12){
                System.out.println("Abanar");
            }
            else if(hora>=18){
                System.out.println("ignorar");
            }
            else{
                System.out.println("Abanar e latir");
            }
        }
        public void reagir  (boolean dono){
            if (dono==true){
                System.out.println("abanar");
            }
            else{
                System.out.println("Rosnar e latir");
                this.emitirSom();
            }
        }
        public void reagir (float altura, float peso){
            if (idade<5) {
                if (peso<10) {
                    System.out.println("abanar");
                } else {
                    System.out.println("Latir");
                }
            } else if (peso<10) {
                System.out.println("Rosnar");
            }
            else{
                System.out.println("Ignorar");
            }
        } 

}
