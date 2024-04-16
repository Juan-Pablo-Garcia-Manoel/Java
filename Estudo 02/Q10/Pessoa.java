
public class Pessoa
{
    public Universidade Universidade;
    private String nome;
    private String dataNascimento;
    
    public Pessoa(String nome,String dataNascimento){
       this.nome = nome;
       this.dataNascimento = dataNascimento;
    }
    
    //SET
    
    public void setUniversidade(Universidade Universidade){
        this.Universidade = Universidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento =dataNascimento;
    }
    
    //GET
    
        public Universidade getUniversidade(){
        return Universidade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public String meusDados(){
        return ("Meu nome é: "+ 
        getNome() + "e minha universidade é" + 
        getUniversidade());
    }
}
