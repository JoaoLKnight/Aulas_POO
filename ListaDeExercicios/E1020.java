package ListaDeExercicios;

import java.util.Scanner;

public class E1020 {
    public static void main (String[] args){
        
        Scanner vai = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de dias: ");
        int dias =vai.nextInt();
        
        int ano = dias/365;
        int anoR = dias % 365;
        
        int mes = anoR/30;
        int dia = anoR % 30;
        
        System.out.println ("Ano: "+ano);
        System.out.println ("Mes: "+ mes);
        System.out.println ("Dias: "+dia);
    }
}
