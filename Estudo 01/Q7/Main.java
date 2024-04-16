import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
    {
        Scanner ler =  new Scanner(System.in);
        Emprestimo emprestimo = new Emprestimo();
        
        System.out.print("Valor de emprestimo: ");
        emprestimo.setValor(ler.nextDouble());
        
        System.out.print("Porcentagem de juros: ");
        emprestimo.setJuros(ler.nextDouble());
        
        System.out.print("Informe o período: ");
        emprestimo.setPeriodo(ler.nextInt());
        
        System.out.println("Valor da mensalidade: " + emprestimo.mensalidade());
        System.out.println("Total pago: " + emprestimo.totalPago());
        System.out.println("Total pago de juros: "+ emprestimo.totalJuros());
    }
}
