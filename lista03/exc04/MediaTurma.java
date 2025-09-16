/*
FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Yuri Lins Gomes de Souza
    Data: 10/09/2025
   
    Lista de Exercícios
    Estrutura de Repetição em Java
   
    Exercício 4: Média de notas de uma turma

    Descrição:
    Desenvolva um programa que calcule a média das notas de uma turma, onde
    o usuário informe quantos alunos há na turma e suas respectivas notas.
    Requisitos:
    • O programa deve solicitar a quantidade de alunos.
    • Deve utilizar um loop for para receber as notas de cada aluno.
    • Utilizar um acumulador para somar todas as notas.
    • No final, exibir a média da turma.
*/

import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de alunos na turma: ");
        int alunos = sc.nextInt();
        
        double notas = 0;
        
        double media = 0;
        
        for(int i = 0; i < alunos; i++){
            
            System.out.print("Insira a nota do aluno: ");
            double nota= sc.nextDouble();
            
            notas += nota;
        }
        
        media = notas / alunos;
        
        System.out.print("A media da turma e: " + media);
        
        sc.close();
    }
}
