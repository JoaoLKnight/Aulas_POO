package ListaDeExercicios;

import java.util.Scanner;

public class E1038 {
    public static void main (String[] args){
    Scanner vai = new Scanner(System.in);
    
    System.out.println("CODIGO \t ESPECIFICACAO \t PRECO");
    System.out.println("1 \t Cachorro quente 4.00");
    System.out.println("2 \t X-salada \t 4.50");
    System.out.println("3 \t X-Bacon\t 5.00");
    System.out.println("4 \t Torrada Simples 2.00");
    System.out.println("5 \t Refrigerante\t 1.50");
    
    System.out.println("Digite o codido do aliemto desejado e logo apos a quantidade:");
    int cod = vai.nextInt();
    int qnt = vai.nextInt();
    
    switch (cod){
        case 1:
        System.out.println("O Valor total a pagar: "+qnt*4.00);
        break;
        case 2:
        System.out.println("O Valor total a oagar: "+ qnt*4.50);                                                                                                                                                                        
        break;
        case 3:
        System.out.println("O Valor total a oagar: "+qnt*5.00);
        break;
        case 4 :
        System.out.println("O Valor total a oagar: "+qnt*2.00);
        break;
        case 5:System.out.println("O Valor total a oagar: "+qnt*1.50);
        break;
        default: 
        System.out.println("Codigo nao existe!!!");
    }
    }
}
