
public class linha extends ponto
{
   double comprimento;
   boolean eVertical,eHorizontal;
    
   public linha(double xA,double xB,double yA,double yB){
       super(xA,xB,yA,yB);
    }
   
    //Método calculo tamanho linha
   public double comprimentoLinha(){
        return comprimento = getXA() + getXB() + getYA() + getYB();
   }
    
   public boolean eVertical(){
        if (getXA() != getXB()){
            eVertical = false;
        }
        return true;
   }
    
   public boolean eHorizontal(){
        if (getYA() != getYB()){
            eHorizontal = true;
        }
        return false;
   }
}


