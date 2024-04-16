
public class Jogador1 extends Jogador
{
   
    public Jogador1(Jogador2 jogador2) {
        super("", jogador2);
    }
    
    @Override
    public void setEscolha(String escolha) {
        super.setEscolha(escolha);
    }
    
    @Override
    public void jogar() {
       System.out.println("Jogador 1 escolheu: " + getEscolha());
    }

}
