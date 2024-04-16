import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Informe quantas horas foram trabalhadas: ");
        funcionario.setHorasTrabalhadas(ler.nextInt());
        
        System.out.println("Informe o salário hora: ");
        funcionario.setSalarioHora(ler.nextDouble());
        
        System.out.println("Informe o número de dependentes: ");
        funcionario.setNumeroDependentes(ler.nextInt());
        
        System.out.println("### Informações do salário líquido: ###");
        System.out.println("# Salário bruto: R$: " + funcionario.salarioBruto());
        System.out.println("# Desconto INSS: R$: " + funcionario.inss());
        System.out.println("# Desconto IR: R$" + funcionario.ir());
        System.out.println("# Salário líquido: R$" + funcionario.salarioLiquido());
        
    }
}
