import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de disciplinas em que o aluno nao alcancou a media: ");
        int quantidade = sc.nextInt();

        if (quantidade == 0){
            System.out.println("Aprovado!");
        } else if (quantidade <= 5){
                System.out.println("Recuperacao!");
        } else {
                System.out.println("Reprovado!");
        }
        
       sc.close();
    }
}
