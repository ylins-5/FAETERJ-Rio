import java.util.Scanner;

public class TrianguloV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor A: ");
        int a = sc.nextInt();
        System.out.print("Insira o valor B: ");
        int b = sc.nextInt();
        System.out.print("Insira o valor C: ");
        int c = sc.nextInt();

        if ((a > b+c) && (b > a+c) && (c > a+b)){
            System.out.print("Não forma um triangulo!");
        } else if( a==b && b==c) {
            System.out.print("Equilatero!");
        } else if(a != b && a!= c && b !=c ){
            System.out.print("Escaleno!");
        } else{
            System.out.print("Isosceles!");
        }

        sc.close();
    }
}