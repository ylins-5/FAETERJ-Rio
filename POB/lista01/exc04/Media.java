/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 03/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
  4. Cálculo de Média Simples
    Faça um programa que solicite ao usuário três notas (valores decimais)
    e exiba a média aritmética delas.
*/

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();
        
         System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        
         System.out.print("Informe a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media= (nota1 + nota2 + nota3) / 3 ;

        System.out.println("A media e: " + media);

        sc.close();
    }
}