/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 27/09/2025
   
    Lista de Exercícios – 
    Manipulação de ArrayList em Java

    Exercício 4: Contagem de Ocorrências de um Número
    Descrição:

    Desenvolva um programa que solicite ao usuário inserir 10 números inteiros em
    um ArrayList<Integer>. Depois, peça ao usuário para digitar um número e informe
    quantas vezes esse número aparece na lista.
    Requisitos:
    
    • Criar um ArrayList<Integer> para armazenar os números.
    • Utilizar um loop for para contar quantas vezes o número aparece na lista.
    • Exibir a quantidade de ocorrências do número digitado pelo usuário.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ContagemOcorrencias {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int n = sc.nextInt();
            numeros.add(n);
        }

        System.out.print("Digite um número para verificar quantas vezes ele aparece: ");
        int numeroBusca = sc.nextInt();

        int contador = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numeroBusca) {
                contador++;
            }
        }

        System.out.println("\nO número " + numeroBusca + " aparece " + contador + " vez(es) na lista.");

        sc.close();
    }
}
