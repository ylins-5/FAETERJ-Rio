import java.util.Scanner;

public class MaiorIdade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.print("Você é maior de idade! ");
        }
        
        sc.close();
    }
}