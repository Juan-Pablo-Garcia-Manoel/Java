
public class ponto
{
   private double xA,xB;
   private double yA,yB;
   
   public ponto(double xA, double xB, double yA, double yB){
       this.xA = xA;
       this.xB =xB;
       this.yA = yA;
       this.yB = yB;
    }
    
   //SET
   
   public void setXA(double xA){
        this.xA = xA;
    }
   
   public void setXB(double xB){
        this.xB = xB;
    }
    
   public void setYA(double yA){
        this.yA = yA;
    }
   
   public void setYB(double yB){
        this.yB = yB;
    }
    
   //GET
   public double getXA(){
        return xA;
    }
   
   public double getXB(){
        return xB;
    }
    
   public double getYA(){
        return yA;
    }
   
   public double getYB(){
        return yB;
    } 
}
