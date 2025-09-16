/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 03/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
  3. Conversão de Temperatura
    Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.
    Fórmula: F = (C × 9/5) + 32.
*/
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Celsius: ");
        double temp = sc.nextDouble();

        double fahrenheit = (temp * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit e: " + fahrenheit);

        sc.close();
    }
}