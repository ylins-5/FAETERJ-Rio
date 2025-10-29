/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 27/09/2025
   
    Lista de Exercícios – 
    Manipulação de ArrayList em Java

    Exercício 3: Soma de Números e Cálculo da Média

    Descrição:
    Crie um programa que solicite ao usuário inserir números em um
    ArrayList<Double> até que ele digite -1. Depois, exiba a soma e a média dos
    números inseridos (excluindo o -1).

    Requisitos:
    • Criar um ArrayList<Double> para armazenar os números.
    • Utilizar um loop while para permitir inserções até o usuário digitar -1.
    • Utilizar um loop for para calcular a soma e a média dos números inseridos.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        double n;

        System.out.println("Digite números para adicionar à lista (digite -1 para encerrar):");
        while (true) {
            n = sc.nextDouble();

            if (n == -1) {
                break; 
            }

            numeros.add(n);
        }

        double soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }

        if (numeros.size() > 0) {
            double media = soma / numeros.size();

            System.out.println("Números digitados: " + numeros);
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        sc.close();
    }
}