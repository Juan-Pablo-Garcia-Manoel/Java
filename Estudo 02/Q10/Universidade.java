import java.util.ArrayList;

public class Universidade
{
   private String nome;
   private ArrayList<Pessoa> Pessoas;
    
   public Universidade(String nome){
       this.nome = nome;
       Pessoas = new ArrayList<Pessoa>();
    }
   
   public void addPessoa(Pessoa Pessoa){
       Pessoas.add(Pessoa) ;
    }    
    
   public ArrayList<Pessoa> getContas(){
       return Pessoas;
    }
    
   public void removeConta(Pessoa Pessoa){
       Pessoas.remove(Pessoa) ;
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
