/*
FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Yuri Lins Gomes de Souza
   Data: 27/09/2025
   
    Lista de Exercícios – 
    Manipulação de ArrayList em Java

    Exercício 2: Remover um Elemento da Lista

    Descrição:
    Escreva um programa que solicite ao usuário inserir 5 nomes em um
    ArrayList<String>. Em seguida, peça para o usuário informar um nome para ser
    removido da lista. Exiba a lista após a remoção.

    Requisitos:
    • Criar um ArrayList<String> para armazenar os nomes.
    • Utilizar remove() para excluir o nome informado.
    • Se o nome não existir na lista, exibir uma mensagem informando.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverElementoLista {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira um nome: ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }

        System.out.print("\nDigite o nome que deseja remover: ");
        String nomeRemovido = sc.nextLine();
        nomes.remove(nomeRemovido);

        System.out.println("Lista atualizada: ");
        for(int j = 0; j < nomes.size(); j++){
            System.out.println(nomes.get(j));
        }

        sc.close();
    }
}


