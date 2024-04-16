import java.util.Scanner;

public class Main
{
   public static void main(String[] args){
       
       Scanner ler = new Scanner(System.in);
       
       while (true){
       Investimento investimento = new Investimento();
       
       System.out.println("Informe quanto será investido por mês: ");
       investimento.setValorInvestido(ler.nextDouble());
       
       System.out.println("Informe qual será a taxa de juros mensal: ");
       investimento.setTaxaMensal(ler.nextDouble());

       System.out.println("Saldo do investimento após 1 ano: " +  investimento.saldo() + ". Deseja processar mais um ano? (S/N)");
       if (ler.next().equalsIgnoreCase("N")) {
                break;
       }
    }
   }
}
