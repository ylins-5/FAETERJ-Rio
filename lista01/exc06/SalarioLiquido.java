/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 03/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
  6. Cálculo do Salário
    Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. 
    O programa deve calcular e exibir o salário líquido.
*/

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu salario bruto: ");
        float salarioBruto= sc.nextFloat();
        
        System.out.print("Informe o valor desconado pelo INSS: ");
        float valorDesconto= sc.nextFloat();
        
        float sLiquido = salarioBruto - valorDesconto;

        System.out.println("Seu salario liquido e: " + sLiquido);

        sc.close();
    }
}