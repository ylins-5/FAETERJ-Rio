/*
FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Yuri Lins Gomes de Souza
    Data: 10/09/2025
   
    Lista de Exercícios
    Estrutura de Repetição em Java
   
    Exercício 5: Números primos em um intervalo

    Descrição:
    Escreva um programa que solicite dois números ao usuário e exiba todos os
    números primos no intervalo entre eles, utilizando um loop aninhado (for
    dentro de for).

    Requisitos:
    • O programa deve solicitar dois números inteiros positivos (início e fim
    do intervalo).
    • Deve utilizar um loop externo para percorrer os números dentro do
    intervalo.
    • Deve utilizar um loop interno para verificar se cada número é primo.
    • Exibir apenas os números primos encontrados.
*/

import java.util.Scanner;

public class NumerosPrimos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o primeiro numero do intervalo: ");
        int n1 = sc.nextInt();

        System.out.print("Insira o segundo numero do intervalo: ");
        int n2 = sc.nextInt();

        System.out.println("Números primos entre " + n1 + " e " + n2 + ":");

        for(int i = n1; i<=n2; i++){

            boolean primo = true;

            if (i < 2){
                primo = false;
            } else {
                for (int divisor = 2; divisor < i; divisor ++){
                    if(i % divisor == 0){
                        primo = false;
                        break;
                    }
                }
            }

            if (primo){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}