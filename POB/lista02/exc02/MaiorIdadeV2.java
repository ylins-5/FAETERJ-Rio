import java.util.Scanner;

public class MaiorIdadeV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.print("Você é maior de idade! ");
        }
        else {
            System.out.print("Você é menor de idade! ");
        }
        
        sc.close();
    }
}