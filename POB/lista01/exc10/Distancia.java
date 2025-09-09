/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 03/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
    10. Distância Entre Dois Pontos
    Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos
     no plano cartesiano e calcule a distância entre eles.

    Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)
*/

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ponto x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Informe o ponto y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Informe o ponto x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Informe o ponto y2: ");
        double y2 = sc.nextDouble();

        double quadradoX = (x2 - x1) * (x2 - x1);
        double quadradoY = (y2 - y1) * (y2 - y1);

        double distancia = Math.sqrt(quadradoX + quadradoY);

        System.out.println("A distância entre os pontos é: " + distancia);

        sc.close();
    }
}


