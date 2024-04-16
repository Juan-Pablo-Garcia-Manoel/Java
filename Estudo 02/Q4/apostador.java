import java.util.ArrayList;

public class apostador
{
    private loterica loterica;
    private String nome;
    private ArrayList<jogo> jogos;
    
    public apostador(String nome){
        jogos = new ArrayList<>();
        this.nome = nome;
    }
    
    //SET e GET e Manipulação da lista
    
    public void addJogo(jogo jogos){
        this.jogos.add(jogos);
    }
    
    public void removerJogos(int id){
        this.jogos.remove(id);
    }
    
    public ArrayList<jogo> getJogos(){
        return jogos;
    }
    
    //SET
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    //GET
    
    public String getNome(){
        return nome;
    }
    
}
