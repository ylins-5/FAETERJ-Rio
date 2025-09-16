/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 16/09/2025
   
    Lista de Exercícios – 
    Manipulação de Arrays em Java

    Exercício 1: Maior e Menor Valor em um Array

    Descrição:
    Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em
    um array. Após isso, o programa deve exibir o maior e o menor número do array.
    
    Requisitos:
    • Criar um array de tamanho 5.
    • Utilizar um loop for para percorrer o array e encontrar o maior e o menor
    valor.
    • Exibir o maior e o menor número armazenados no array.
*/

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vet = new int [5];

        for (int i=0; i<5; i++){
            System.out.print("Insira um numero inteiro: ");
            int n = sc.nextInt();
            vet[i] = n;
        }

        int maior = vet[0], menor = vet[0];
        
        for(int i=0; i< vet.length; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
            if(vet[i] < menor){
                menor = vet[i];
            }

        }
        
        System.out.println("O maior valor e: " + maior);
        System.out.println("O menor valor e: " + menor);
        
        sc.close();
    }
}