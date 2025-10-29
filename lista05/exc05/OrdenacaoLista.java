/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 27/09/2025
   
    Lista de Exercícios – 
    Manipulação de ArrayList em Java

    Exercício 5: Ordenação de Lista de Números
    Descrição:
    Crie um programa que solicite ao usuário inserir quantos números desejar em
    um ArrayList<Integer>. Em seguida, ordene os números em ordem crescente e
    exiba a lista ordenada.
    
    Requisitos:
    • Criar um ArrayList<Integer> para armazenar os números.
    • Utilizar Collections.sort() para ordenar os números.
    • Exibir a lista ordenada após a ordenação.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números inteiros (digite -1 para encerrar):");

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            numeros.add(n);
        }

        Collections.sort(numeros);

        System.out.println("Lista ordenada: ");
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        sc.close();
    }
}

