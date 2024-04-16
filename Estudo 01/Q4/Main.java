import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       Carro carro = new Carro();
       
       System.out.println("### Monte o seu carro: ###");
       
       System.out.println("Deseja ar (S/N) ? ");
       carro.setAr(ler.next().equalsIgnoreCase("S"));
       
       System.out.println("Deseja câmbio automático (S/N) ? ");
       carro.setCambioAutomatico(ler.next().equalsIgnoreCase("S"));
       
       System.out.println("Deseja vidro automático (S/N) ? ");
       carro.setVidroAutomatico(ler.next().equalsIgnoreCase("S"));

       System.out.println("Deseja alarme (S/N) ? ");
       carro.setAlarme(ler.next().equalsIgnoreCase("S"));
       
       System.out.println("Deseja teto solar (S/N) ? ");
       carro.setTetoSolar(ler.next().equalsIgnoreCase("S"));
       
       System.out.println("Deseja kit multimídia (S/N) ? ");
       carro.setKitMultimidia(ler.next().equalsIgnoreCase("S"));
       
       System.out.println("Qual a potência o motor ? ");
       carro.setPotenciaDoMotor(ler.nextDouble());
       
       System.out.println("Informe se a pintura será Especial, Metálica, Comemorativa ou Comum ?");
       carro.setPinturaEspecial(ler.next());
       
       System.out.println("Este é um carro importante (S/N) ?");
       carro.setModelo(ler.next().equalsIgnoreCase("S"));

       System.out.println("### Escolhas: ###");
       carro.escolhas();
       System.out.println("# O valor do carro do é: " + carro.valor());
   }
}
