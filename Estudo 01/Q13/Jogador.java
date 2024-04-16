public class Jogador
{
    private String escolha;
    private Jogador adversario;
    
    JogoDaVelha jogodavelha = new JogoDaVelha();
    
    public Jogador(String escolha, Jogador adversario){
        if(validaEscolha(escolha)){
            this.escolha = escolha;
            this.adversario = adversario;
        }else{
            System.out.println("A escolha deve ser X ou Y");
        }
    }
    
    public void setEscolha(String escolha){
         this.escolha = escolha;
    }
    
    public String getEscolha(){
        return escolha;
    }
    
    public boolean validaEscolha(String escolha){
        if (escolha.equals("X")) {
            this.escolha = "X";
            adversario.setEscolha("Y");
            return true;
        } else if (escolha.equals("Y")) {
            this.escolha = "Y";
            adversario.setEscolha("X");
            return true;
        } else {
             System.out.println("A escolha deve ser X ou Y");
             return false;
        }
    }
    
    public void jogar(){
        
    }
    
}
