
public class cidade
{
   public competicao competicao;
   public String sigla;
   
   public cidade(String sigla){
       this.sigla = sigla;
    }
    
   //SET
   public void setSigla(String nome){
        this.sigla = sigla;
    }
    
   public void setCompeticao(competicao competicao){
       this.competicao  = competicao; 
   }
    
    //GET
   public String getsSigla(){
        return sigla;
    }
    
   public competicao getCompeticao(){
        return competicao;
   }
}
