package br.edu.univas;

import java.util.Scanner;

public class Menu {
    
    public static void menu(){
        System.out.println("Menu dos Polígonos");
        System.out.println("  1. Quadrado");
        System.out.println("  2. Triângulo");
        System.out.println("  3. Retângulo");
        System.out.println("  4. Losango");
        System.out.println("  9. Sair");
        System.out.println("Escolha uma opção:");
    }
    
    
    public static void main(String[] args) {
        int opcao;
        float altura,base,diagonal,diagonal1;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            
			switch(opcao){
            case 1:
            	System.out.println("insira abaixo os valores para calcular a area do quadrado");
            	System.out.println("insira o valor da base do quadrado:");
            	base = entrada.nextFloat();
            	System.out.println("insira o valor da altura do quadrado:");
            	altura = entrada.nextFloat();
            	System.out.println("A area do quadrado é = " + base  * altura);
                break;
                
            case 2:
            	System.out.println("insira abaixo os valores para calcular a area do triângulo");
            	System.out.println("insira o valor da base do triangulo:");
            	base = entrada.nextFloat();
            	System.out.println("insira o valor da altura do triangulo:");
            	altura = entrada.nextFloat();
            	System.out.println("A area do triângulo é =" + base * altura / 2);
                break;               
            
            case 3:
            	System.out.println("insira abaixo os valores para calcular a area do retângulo");
            	System.out.println("insira o valor base do retângulo:");
            	base = entrada.nextFloat();
            	System.out.println("insira o valor da altura do retãngulo:");
            	altura = entrada.nextFloat();
            	System.out.println("A area do retãngulo é =" + base * altura);
            	break;
                
            case 4:
            	System.out.println("insira abaixo os valores para calcular a area do losango");
            	System.out.println("insira o valor da diagonal do losango:");
            	diagonal = entrada.nextFloat();
            	System.out.println("insira o valor da diagona1 do losango:");
            	diagonal1 = entrada.nextFloat();
            	System.out.println("A area do losango é =" + diagonal * diagonal1 / 2);
               break;
            
            case 9:
            	System.out.println("Sair do Menu");
            	break;
            	
            default:
                System.out.println("Opção inválida! por favor, digite uma opção correta!");
            }
        } while(opcao != 9);
    }
}

