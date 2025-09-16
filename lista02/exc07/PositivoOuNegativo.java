import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("O numero e positivo!");
        }
        else {
            System.out.println("O numero e negativo!");
        }

        sc.close();

    }
}
