import java.util.Scanner;

public class Eleitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o seu ano de Nascimento: ");
        int nascimento = sc.nextInt();

        int idade = 2025 - nascimento;

        if(idade >= 16){
            System.out.print("Apto a ser Eleitor!");
        }
        else {
            System.out.print("Inapto a ser Eleitor!");
        }
        
        sc.close();
    }
}
