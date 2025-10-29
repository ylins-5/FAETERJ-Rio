/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 27/09/2025
   
    Lista de Exercícios – 
    Manipulação de ArrayList em Java

    Exercício 1: Adicionar e Exibir Números 

    Descrição:
    Crie um programa que permita ao usuário inserir quantos números desejar em
    um ArrayList<Integer>. Após a inserção, o programa deve exibir todos os números
    digitados.
    Requisitos:
    • Criar um ArrayList<Integer> para armazenar os números.
    • Utilizar um loop while para permitir múltiplas inserções até o usuário
    decidir parar.
    • Exibir os números armazenados no ArrayList.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AddExibirNumeros{
    public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite -1 para parar de adicionar numeros");
        while(true){
            System.out.print("Insira um numero inteiro: ");
            int n = sc.nextInt();

            if(n == -1){
                break;
            }
            numeros.add(n);
        }

        System.out.println("Números digitados: ");
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        sc.close();
	}
}

