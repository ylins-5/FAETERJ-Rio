/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 16/09/2025
   
    Lista de Exercícios – 
    Manipulação de Arrays em Java

    Exercício 5: Busca de Elemento em um Array

    Descrição:
    Implemente um programa que solicite ao usuário 10 números inteiros e os
    armazene em um array. Em seguida, o usuário deve digitar um número para buscar
    no array. O programa deve informar se o número está presente e em qual posição.

    Requisitos:
    • Criar um array de tamanho 10.
    • Solicitar um número ao usuário e verificar se ele está presente no array.
    • Se o número for encontrado, exibir sua posição. Caso contrário, exibir
    "Número não encontrado.".
*/

import java.util.Scanner;

public class BuscaElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vet = new int [10];

        for (int i=0; i<10; i++){
            System.out.print("Insira um numero inteiro: ");
            int n = sc.nextInt();
            vet[i] = n;
        }

        System.out.print("Insira um numero para ser encontrado: ");
        int n = sc.nextInt();

        boolean encontrado = false;
 
        for(int i=0; i< vet.length; i++){
            if (vet[i] == n){
               System.out.println("O numero foi encontrado na posicao: " + i); 
               encontrado = true;
            } 

            if(!encontrado){
                System.out.print("O numero nao foi encontrado");
            }
        }

        sc.close();
    }
}
