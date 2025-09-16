/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 16/09/2025
   
    Lista de Exercícios – 
    Manipulação de Arrays em Java

    Exercício 3: Inversão de Elementos de um Array

    Descrição:
    Escreva um programa que solicite ao usuário 6 números inteiros e os armazene
    em um array. Em seguida, exiba os números na ordem inversa à de entrada.
    
    Requisitos:
    • Criar um array de tamanho 6.
    • Utilizar um loop for para preencher o array.
    • Utilizar outro loop for para exibir os elementos na ordem inversa.
*/

import java.util.Scanner;

public class InversaoDeElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vet = new int [6];

        for (int i=0; i<6; i++){
            System.out.print("Insira um numero inteiro: ");
            int n = sc.nextInt();
            vet[i] = n;
        }
        
        for(int i=vet.length - 1; i>=0; i--){
            System.out.println(vet[i]);
        }

        sc.close();
    }
}
