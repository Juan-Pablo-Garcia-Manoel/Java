import java.util.Scanner;

public class Main
{
      public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.print("Digite o nome da pessoa: ");
        pessoa.setNome(ler.nextLine());
        
        System.out.print("Digite o ano de nascimento da pessoa: ");
        pessoa.setAnoNascimento(ler.nextInt());
        
        System.out.print("Digite o e-mail da pessoa: ");
        String email = ler.next();
        
        pessoa.minhaIdade();
    }
}
