/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 16/09/2025
   
    Lista de Exercícios – 
    Manipulação de Arrays em Java

    Exercício 4: Contagem de Números Pares em um Array

    Descrição:
    Crie um programa que solicite ao usuário 8 números inteiros e armazene-os em
    um array. O programa deve contar e exibir a quantidade de números pares no
    array.

    Requisitos:
    • Criar um array de tamanho 8.
    • Utilizar um loop for para percorrer o array e contar quantos números são
    pares.
    • Exibir a quantidade de números pares encontrados.
*/

import java.util.Scanner;

public class ContagemPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vet = new int [8];

        for (int i=0; i<8; i++){
            System.out.print("Insira um numero inteiro: ");
            int n = sc.nextInt();
            vet[i] = n;
        }

        int qtdPar = 0;
        
        for(int i=0; i<8; i++){
            if (vet[i] % 2 == 0){
                qtdPar++;
            }
        }

        System.out.println("A quantidade de numeros pares encontrados foi: " + qtdPar);

        sc.close();
    }
}
