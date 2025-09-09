import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero : ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.print("O numero lido e par!" );
        }
        else {
            System.out.print("O numero lido e impar!");
        }
        
        sc.close();
    }
}
