
public class Jogador extends Atleta
{
    private int Numero;
    private int Posicao;
    
    public Jogador(int Numero,int Posicao,String Nome,double Peso){
        super(Nome,Peso);
        this.Numero = Numero;
        this.Posicao = Posicao;
    }
    
    //SET
    public void setNumero(int Numero){
        this.Numero = Numero;
    }
   
    public void setPosicao(int Posicao){
        this.Posicao = Posicao;
    }
    
    //GET
    public int getNumero(){
        return Numero;
    }
   
    public int getPosicao(){
        return Posicao;
    }
}
