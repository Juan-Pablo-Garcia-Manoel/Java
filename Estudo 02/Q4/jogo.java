import java.util.ArrayList;

public class jogo
{
    public loterica loterica;
    private ArrayList<time> times;
    private int numeroCartao;
    
    public jogo(int numeroCartao){
        times = new ArrayList<>();
        this.numeroCartao = numeroCartao;
    }
    
    public void addTimes(time times){
        this.times.add(times);
    }
    
    public void removerTimes(int id){
        this.times.remove(id);
    }
    
    public ArrayList<time> getTimes(){
        return times;
    }
    
    //SET
    
    public void setNumeroCartao(int numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    
    //GET
    
    public int getNumeroCartao(){
        return numeroCartao;
    }
    
    // Metodo Resultado vencedor
    
    // Metodo Resultado segundo vencedor
    
    // Metodo Resultado empate
}
