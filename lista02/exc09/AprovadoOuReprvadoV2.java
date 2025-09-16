import java.util.Scanner;

public class AprovadoOuReprvadoV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.print("Insira a segunda nota: ");
        int nota2 = sc.nextInt();

        int media = (nota1 + nota2)/2;

        System.out.println("Sua media foi: " + media);

        if (media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.print("Insira a sua terceira nota: ");
            int nota3 = sc.nextInt();

            media = (nota1 + nota2 + (nota3*2))/4;
            System.out.println("Sua nova media e: " + media);

            if (media >= 6){
                System.out.println("Aprovado!");
            } else{
                System.out.println("Reprovado!");
            }
        }

        sc.close();
    }
}
