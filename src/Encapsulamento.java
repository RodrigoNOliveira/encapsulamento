import java.util.Scanner;

public class Encapsulamento {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();
        System.out.println();
        

        System.out.print("Digite a idade do funcionario: ");
        int idade = scanner.nextInt();
        System.out.println();
        scanner.nextLine();


        System.out.print("Digite o cargo do funcionario: ");
        String cargo = scanner.nextLine();
        System.out.println();
        
      
        System.out.print("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();
        System.out.println();

        Funcionario f = new Funcionario(nome, idade, cargo, salario);

        
        System.out.println(f);
        System.out.println();

        System.out.print("Digite a porcentagem a ser adicionada ao salario: ");
        double aumento = scanner.nextDouble();
        f.aumentaSalario(aumento);
        scanner.nextLine();
        System.out.println();

        System.out.print("Digite o novo cargo do funcionario: ");
        cargo = scanner.nextLine();
        f.trocarCargo(cargo);

        System.out.println();
        System.out.println("O funcionario está de ferias: " + f.getEstaDeFerias());

        System.out.println();
        System.out.println(f);

        f.darFerias();

        System.out.println();
        System.out.println("O funcionario está de ferias: " + f.getEstaDeFerias());

        f.tirarFerias();
        System.out.println();
        System.out.println("O funcionario está de ferias: " + f.getEstaDeFerias());
        scanner.close();

    }
}
