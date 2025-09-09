import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.print("Insira o segundo valor: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma);
        
        sc.close();
    }
}
