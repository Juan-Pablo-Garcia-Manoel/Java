
public class produto
{
    private long codigo;
    private String nome;
       
    public produto(String nome,long codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    //SET
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    
    //GET
    
    public String getNome(){
        return nome;
    }
    
    public long getCodigo(){
        return codigo;
    }
    
    //Método
    
    public String consultaNome(){
        return "";
    }
    
}
