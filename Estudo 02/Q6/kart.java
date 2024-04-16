
public class kart
{
   boolean ajustePneu;
   boolean regulagemMotor;
   
   public kart(boolean ajustePneu, boolean regulagemMotor){
       this.ajustePneu = ajustePneu;
       this.regulagemMotor = regulagemMotor;
    }
    
   //SET
   public void setAjustePneu(boolean ajustePneu){
        this.ajustePneu = ajustePneu;
   }
   
   public void setRegulagemMotor(boolean regulagemMotor){
        this.regulagemMotor = regulagemMotor;
   }
    
   //GET
   public boolean getAjustePneu(){
        return ajustePneu;
   } 
   
   public boolean getRegulagemMotor(){
        return regulagemMotor;
   } 
   
}
