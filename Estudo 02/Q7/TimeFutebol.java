import java.util.ArrayList;

public class TimeFutebol
{
    private String Nome;
    private String Cidade;
    private String Estado;
    private ArrayList<Jogador> Jogadores;
    
    public TimeFutebol(String Nome,String Cidade,String Estado){
        this.Nome = "São Paulo";
        this.Cidade =" São Paulo ";
        this.Estado = "SP";
        Jogadores = new ArrayList<>();
    }
    
    //SET e GET e Manipulação da lista de Jogadores
    
    public void addogador(Jogador Jogadores){
        this.Jogadores.add(Jogadores);
    }
    
    public void removerogadores(int id){
        this.Jogadores.remove(id);
    }
    
    public ArrayList<Jogador> getJogadores(){
        return Jogadores;
    }
    
    //SET
    public void setNome(String Nome){
        this.Nome = Nome;
    }
   
    public void setCidade(String Cidade){
        this.Cidade = Cidade;
    }
    
    public void setEstado(String Estado){
        this.Estado = Estado;
    }
    
    //GET
    public String getNome(){
        return Nome;
    }
   
    public String getCidade(){
        return Cidade;
    }
    
    public String getEstado(){
        return Estado;
    }
}
