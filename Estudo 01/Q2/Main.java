import java.util.Scanner;

public class Main
{
   public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       Impar impar = new Impar();
       
       System.out.println("Informe o valor inicial:");
       impar.setNumeroInicial(ler.nextInt());
       
       System.out.println("Informe o valor final:");
       impar.setNumeroFinal(ler.nextInt());
       
       System.out.println("Resultado:"+"\t");
       impar.ehImpar();
       
       
   }
}       
