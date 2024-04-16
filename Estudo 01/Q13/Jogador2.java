
public class Jogador2 extends Jogador
{
   
   public Jogador2(Jogador1 jogador1) {
        super("", jogador1);
   }
   
   @Override
   public void setEscolha(String escolha) {
        super.setEscolha(escolha);
   }
    
   @Override
   public void jogar() {
        System.out.println("Jogador 2 escolheu: " + getEscolha());
   }
   
}   
