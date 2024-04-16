
public class Atleta
{
   protected String Nome;
   private double Peso;
   
   public Atleta(String Nome,double Peso){
       this.Nome = Nome;
       this.Peso = Peso;
    }
    
   //SET
   public void setNome(String Nome){
        this.Nome = Nome;
    }
   
   public void setPeso(double Peso){
        this.Peso = Peso;
    }
    
   //GET
   public String getNome(){
        return Nome;
    }
   
   public double getPeso(){
        return Peso;
    }
    
}
