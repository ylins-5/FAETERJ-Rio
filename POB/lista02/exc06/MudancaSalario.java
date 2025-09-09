import java.util.Scanner;

public class MudancaSalario {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o salario bruto do funcionario: ");
    double salarioBruto = sc.nextDouble();

    System.out.print("Insira o sexo do funcionario (M/F): ");
    char sexo = sc.next().charAt(0);

    double desconto;
    double salarioLiquido;

    if (sexo == 'M' || sexo == 'm'){
        desconto = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - desconto;
    }
    else{
        desconto = salarioBruto * 0.03;
        salarioLiquido = salarioBruto - desconto;
    }
    
    System.out.println("Desconto: R$ " + desconto);
    System.out.println("Salário Líquido: R$ " + salarioLiquido);

    sc.close();

    }
}
