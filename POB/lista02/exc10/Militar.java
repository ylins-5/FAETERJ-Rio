import java.util.Scanner;

public class Militar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o seu ano de nascimento: ");
    int anoNascimento = sc.nextInt();

    int idade = 2025 - anoNascimento;
    
    System.out.print("Insira o seu sexo (M/F): ");
    char sexo = sc.next().charAt(0);

    if ((sexo == 'M' || sexo == 'm') && idade >= 18){
        System.out.println("Servico Militar obrigatorio");
    }
    else{
        System.out.println("Isento de Servico Militar ");
    }
    
    sc.close();

    }
}