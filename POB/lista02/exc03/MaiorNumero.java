import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro numero : ");
        int primeiroNum = sc.nextInt();
        System.out.print("Insira o segundo numero : ");
        int segundoNum = sc.nextInt();

        if(primeiroNum > segundoNum){
            System.out.print("O maior numero lido e: " + primeiroNum);
        }
        else {
            System.out.print("O maior numero lido e: " + segundoNum);
        }
        
        sc.close();
    }
}
