
public class quadrado
{
   public linha linha;
   public double perimetro;
   
   public quadrado(){
       
    }
    
   //calculo perímetro;
   public double perimetro(){
       perimetro = linha.comprimentoLinha() * 4;
       return perimetro;
    }
   
   // SET
   public void setLinha(linha linha){
       this.linha  = linha; 
   }
   
   //GET
   public linha getLinha(){
        return linha;
   }
}
