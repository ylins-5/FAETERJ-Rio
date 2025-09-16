/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 16/09/2025
   
    Lista de Exercícios – 
    Manipulação de Arrays em Java

    Exercício 2: Cálculo da Média de Notas

    Descrição:
    Desenvolva um programa que peça ao usuário para inserir 4 notas e armazene-as
    em um array. Depois, o programa deve calcular e exibir a média das notas.
    
    Requisitos:
    • Criar um array de tamanho 4 para armazenar as notas.
    • Utilizar um loop for para somar todas as notas e calcular a média.
    • Se a média for maior ou igual a 7, exibir "Aprovado", senão, exibir
    "Reprovado".
*/
import java.util.Scanner;

public class MediaNotas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [] vet = new float [4];

        for (int i=0; i<4; i++){
            System.out.print("Insira uma nota: ");
            float n = sc.nextFloat();
            vet[i] = n;
        }

        float soma = 0;
        int divisor = 0;
        
        for(int i=0; i< vet.length; i++){
            soma += vet[i];
            divisor++;
        }

        float media = soma/divisor;

        if (media >= 7) {
            System.out.println("Aprovado! Sua media foi: " + media);
        } else {
            System.out.println("Reprovado! Sua media foi: " + media);
        }
        
        sc.close();
    }
}