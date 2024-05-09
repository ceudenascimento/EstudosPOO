public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int QuantidadeMembros;

     public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getQuantidadeMembros() {
        return QuantidadeMembros;
    }
    public void setQuantidadeMembros(int quantidadeMembros) {
        QuantidadeMembros = quantidadeMembros;
    }

    //usando polimorfismo de sobreposição

    /*é quando substituimos um método de uma superclasse na sua subclasse usando a mesma assinatura */

/*Assinatura de um método é a quantidade e os tipos de parâmetros, ou seja, a assinatura desses métodos abaixo são 0 parâmetros */
     public abstract void emitirSom();

}
