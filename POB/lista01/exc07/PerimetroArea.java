/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 03/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
 7. Cálculo do Perímetro e Área de um Retângulo
    Faça um programa que solicite a base e a altura de um retângulo e
    exiba o seu perímetro e sua área.
*/

import java.util.Scanner;

public class PerimetroArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a base do retangulo: ");
        float base= sc.nextFloat();
        
        System.out.print("Informe a altura do retangulo: ");
        float altura= sc.nextFloat();
        
        float perimetro = 2 * (base + altura);
        
        float area = base * altura;

        System.out.println("O perimetro do reatangulo e: " + perimetro);
        System.out.println("A area do retangulo e: " + area);

        sc.close();
    }
}