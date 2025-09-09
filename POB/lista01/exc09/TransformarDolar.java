/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 03/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
    9. Conversão de Moeda
    Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia.
    O programa deve calcular e exibir o valor equivalente em dólares (US$).
*/


import java.util.Scanner;

public class TransformarDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor em reais (R$): ");
        float real = sc.nextFloat();

        System.out.print("Informe a cotação do dólar hoje: ");
        float dolar = sc.nextFloat();

        float converte = real / dolar;

        System.out.println(real + " R$ é equivalente a: " + converte + " US$");

        sc.close();
    }
}