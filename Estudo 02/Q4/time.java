
public class time
{
    private String nome;
    private int placar;
    
     public time(String nome, int placar){
        this.nome = nome;
        this.placar = placar;
    }
    
    //SET
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPlacar(int placar){
        this.placar = placar;
    }
    
    //GET
    
    public String getNome(){
        return nome;
    }
    
    public int getPlacar(){
        return placar;
    }
}
