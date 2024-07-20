package exerciciosjava;

import java.util.Scanner;

public class exercicio6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta;
        int pontos = 0;
        System.out.println("\n______\nJOGO DO ASSASSINO\n______\nResponda as perguntas abaixo com s==SIM ou n==NÃO:\n");
        System.out.println("SINOPSE:\nA cidade de New Haven é conhecida por ser tranquila e pacata, até que um misterioso assassinato abala a comunidade.\nA vítima, o Sr. John Richards, um renomado empresário da cidade, foi encontrado morto em sua mansão na noite de sexta-feira.\nA polícia está investigando e precisa entrevistar várias pessoas que podem ter algum envolvimento no crime.");
        System.out.print("Telefonou para a vítima? ");
        resposta = sc.next().charAt(0);
        if (resposta=='s' || resposta=='S'){
            pontos=pontos+1;
        }
        System.out.print("Estava no local do crime? ");
        resposta = sc.next().charAt(0);
        if (resposta=='s' || resposta=='S'){
            pontos=pontos+1;
        }
        System.out.print("Mora perto da vítima? ");
        resposta = sc.next().charAt(0);
        if (resposta=='s' || resposta=='S'){
            pontos=pontos+1;
        }
        System.out.print("Tinha alguma dívida com a vítima? ");
        resposta = sc.next().charAt(0);
        if (resposta=='s' || resposta=='S'){
            pontos=pontos+1;
        }
        System.out.print("Já trabalhou com a vítima? ");
        resposta = sc.next().charAt(0);
        if (resposta=='s' || resposta=='S'){
            pontos=pontos+1;
        }
        if(pontos==2){
            System.out.println("Suspeito!!!");
        }
        else if (pontos==3 || pontos==4){
        System.out.println("Cúmplice");
        }
        else if (pontos==5){
            System.out.println("ASSASSINO!!!");
        }
        else{
            System.out.println("INOCENTE!!!");
        }

    }
}