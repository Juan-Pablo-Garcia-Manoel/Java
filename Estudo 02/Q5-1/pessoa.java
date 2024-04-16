
public class pessoa
{
   private String nome;
   private endereco endereco;
   private String numero;
   
   public pessoa(String nome,String numero){
       this.nome = nome;
       this.numero = numero;
    }
   
   //SET
   
   public void setNome(String nome){
        this.nome = nome;
    }
    
   public void setNumero(String numer){
        this.numero = numero;
    }
   
   //GET
    
   public String getNome(){
        return nome;
    }
    
   public String getNumero(){
        return numero;
    }
   
   //Metódos
    
   public endereco consultaEndereco(){
       return endereco;
    }
    
   public String consultaNome(){
       return "";
    }
}
