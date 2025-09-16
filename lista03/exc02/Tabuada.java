/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 10/09/2025
   
   Lista de Exercícios
   Estrutura de Repetição em Java
   
    Exercício 2: Tabuada de um número
    Descrição:
    Escreva um programa que solicite um número ao usuário e exiba a tabuada
    desse número de 1 a 10, utilizando um loop while.
    Requisitos:
    • O programa deve pedir um número inteiro ao usuário.
    • Utilizar um contador para iterar de 1 a 10.
    • Exibir a multiplicação do número pelo contador em cada iteração.
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um numero: ");
        int n = sc.nextInt();
        
        int i = 1;
        
        int multiplicacao = 0;
        
        while (i <= 10){
            
            multiplicacao = i * n;
            
            System.out.println(n + " x " + i + " = " + multiplicacao);
            
            i++;
        }
        
        sc.close();
    }
}
