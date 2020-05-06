
package Exercicio2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner vai= new Scanner (System.in);
        Cliente cli= new Cliente();
        Gerente ge= new Gerente();
        Vendedor vend= new Vendedor();
           
    System.out.println("Digite o nome do cliente/idade/sexo");
    cli.setNome(vai.next());
    cli.setIdade(vai.nextInt());
    cli.setSexo(vai.next());
    System.out.println("Digite o Valor da divida e Ano de nscimento(CLIENTE):");
    cli.setValorDivida(vai.nextDouble());
    cli.setAnoNascim(vai.nextInt());
    
    
    System.out.println("Digite o nome do Gerente/idade/sexo");
    ge.setNome(vai.next());
    ge.setIdade(vai.nextInt());
    ge.setSexo(vai.next());
    System.out.println("Digite Matricula e salario (gerente):");
    ge.setMatricula(vai.next());
    ge.setSalario(vai.nextDouble());
    System.out.println("Digite vome da gerencia:");
    ge.setNomeGerencia(vai.next());
    
    
    System.out.println("Digite o nome do vendendor/idade/sexo");
    vend.setNome(vai.next());
    vend.setIdade(vai.nextInt());
    vend.setSexo(vai.next());
    System.out.println("Digite Matricula e salario (vendedor):");
    vend.setMatricula(vai.next());
    vend.setSalario(vai.nextDouble());
    System.out.println("Digite valor total da venda e quantidade de vendas:");
    vend.setValorVendas(vai.nextDouble());
    vend.setQntVendas(vai.nextInt());
    
    
    }
    
}