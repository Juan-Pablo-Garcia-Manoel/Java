
public class empregado
{
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public empregado(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public empregado(){
    
    }
    
    //SET
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    //GET
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    //Método
    public double vencimento(){
        return 0;
    }
}
