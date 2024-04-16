import java.util.Scanner;

public class Main
{
   public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       Triangulo triangulo = new Triangulo();
       
       System.out.println("Informe o valor do lado A");
       triangulo.setLadoA(ler.nextDouble());
       
       System.out.println("Informe o valor do lado B");
       triangulo.setLadoB(ler.nextDouble());
       
       System.out.println("Informe o valor do lado C");
       triangulo.setLadoC(ler.nextDouble());
       
       System.out.println("Perímetro:" + triangulo.perimetro());
       
       System.out.println("Tipo de triângulo:"+ triangulo.tipo());

       System.out.println("Área: " + triangulo.area());
       
   }
}
