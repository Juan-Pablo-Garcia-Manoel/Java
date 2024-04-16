import java.util.Scanner;

public class Main
{
   public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      Populacao populacao = new Populacao();
        
      while (true){
           System.out.println("# Informe os dados do habitante #");
           Pessoa pessoa = new Pessoa();
           
           
           System.out.println("# Nome:");
           pessoa.setNome(ler.next());
           
           System.out.println("# Sexo:");
           pessoa.setSexo(ler.next());
           
           System.out.println("# Altura:");
           pessoa.setAltura(ler.nextDouble());
           
           System.out.println("# A cor dos olhos é " + "azul, " 
           + "verde " + "ou " + "castanho ?");
           pessoa.setCorDosOlhos(ler.next());
           
           System.out.println("# A cor do cabelo é " + "loiro, " 
           + "castanho " + "ou " + "preto ?");
           pessoa.setCorDosCabelos(ler.next());
           
           System.out.println("# Idade:");
           pessoa.setIdade(ler.nextInt());
    
           populacao.addPessoa(pessoa);
           
           System.out.println("Deseja cadastrar outra pessoa (S/N)?");
           if (ler.next().equalsIgnoreCase("N")) {
                break;
           }
      }
      
      
      System.out.println("# Estatísticas da população:");
      System.out.println("# Maior altura: " + populacao.maiorAltura());
      System.out.println("# Menor altura: " + populacao.menorAltura());
      System.out.println("# Média de altura das mulheres: " + populacao.mediaAlturaMulheres());
      System.out.println("# Número de homens: " + populacao.numeroHomens());
      System.out.println("# Porcentagem de homens: " + populacao.porcentagemHomens() + "%");
      System.out.println("# Porcentagem de mulheres: " + populacao.porcentagemMulheres() + "%");
      System.out.println("# Porcentagem de mulheres entre 18 e 35 anos com olhos verdes e cabelos louros: " + populacao.porcentagemMulheres18a35VerdesLouros() + "%");
   
   }
   
}
