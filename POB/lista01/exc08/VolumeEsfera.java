/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 03/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
 8. Cálculo do Volume de uma Esfera
    Crie um programa que leia o raio de uma esfera e calcule o seu volume.
    Fórmula: V = (4/3) * π * raio³.
    Use π = 3.14159.
*/

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o raio da esfera: ");
        double raio= sc.nextDouble();
        
        double n = 3.14159;
        
        double volume = (4/3) * n * (raio * raio * raio);
        
        System.out.println("O volume da esfera e: " + volume);

        sc.close();
    }
}