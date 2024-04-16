import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
    {
        Scanner le = new Scanner(System.in);
        Aposentadoria aposentadoria = new Aposentadoria();
        
        System.out.print("Informe a sua idade: ");
        aposentadoria.setIdade(le.nextInt());
        
        System.out.print("Tempo de trabalho (anos): ");
        aposentadoria.setTempoTrabalhados(le.nextInt());
        
        if(aposentadoria.aposentadoria())
            System.out.println("Estou qualificado a aposentar!");
        else
            System.out.println("Não estou qualificado a aposentar!");
    }
}
