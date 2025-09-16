/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 03/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
  5. Conversão de Idade para Dias
    Desenvolva um programa que leia a idade de uma pessoa em anos e 
    exiba a quantidade aproximada de dias que ela já viveu.
*/

import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a sua idade em anos: ");
        int idade = sc.nextInt();
        
         int idadeDias = idade * 365;

        System.out.println("Sua idade em dias e: " + idadeDias);

        sc.close();
    }
}
