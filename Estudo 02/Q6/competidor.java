import java.util.ArrayList;

public class competidor
{
    private ArrayList<kart> karts;
    public String nome;
    public int pontos;
    
     public competidor(String nome, int pontos){
        karts = new ArrayList<>();
        this.nome = nome;
        this.pontos = pontos;
    }
    
    
    public void addKart(kart karts){
        this.karts.add(karts);
    }
    
    public void removerKarts(int id){
        this.karts.remove(id);
        pontos = pontos - 5;
    }
    
    public ArrayList<kart> getKarts(){
        return karts;
    }
    
    //SET
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPontos(int Pontos){
        this.pontos = pontos;
    }
    
    //GET
    public String getNome(){
        return nome;
    }
    
    public int getPontos(){
        return pontos;
    }
    
}
