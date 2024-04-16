public class Carro
{
    boolean ar, cambioAutomatico, vidroAutomatico, alarme, 
    tetoSolar, kitMultimidia, modelo;
    double potenciaDoMotor;
    String pinturaEspecial;
    
    public Carro(){
          
    }
    
    public Carro(boolean ar, boolean cambioAutomático, 
    boolean vidroAutomatico, 
    boolean alarme, boolean tetoSolar, boolean kitMultimidia, 
    double potenciaDoMotor, String pinturaEspecial, 
    boolean modelo){
          this.ar = ar;
          this.cambioAutomatico = cambioAutomático;
          this.vidroAutomatico = vidroAutomatico;
          this.alarme = alarme;
          this.tetoSolar = tetoSolar;
          this.kitMultimidia =  kitMultimidia;
          this.potenciaDoMotor = potenciaDoMotor;
          this.pinturaEspecial = pinturaEspecial;
          this.modelo = modelo;
    }
    
    public void setAr(boolean ar){
        this.ar = ar;
    }
    
    public void setCambioAutomatico(boolean cambioAutomatico){
        this.cambioAutomatico = cambioAutomatico;
    }
    
    public void setVidroAutomatico(boolean vidroAutomatico){
        this.vidroAutomatico = vidroAutomatico;
    }
    
    public void setAlarme(boolean alarme){
        this.alarme = alarme;
    }
    
    public void setTetoSolar(boolean tetoSolar){
        this.tetoSolar = tetoSolar;
    }
    
    public void setKitMultimidia(boolean kitMultimidia){
        this.kitMultimidia = kitMultimidia;
    }
    
    public void setPotenciaDoMotor(double potenciaDoMotor){
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    public void setPinturaEspecial(String pinturaEspecial){
        this.pinturaEspecial = pinturaEspecial;
    }
    
    public void setModelo(boolean modelo){
        this.modelo = modelo;
    }

    public boolean getAr(){
        return ar;
    }
    
    public boolean getCambioAutomatico(){
        return cambioAutomatico;
    }
    
    public boolean getVidroAutomatico(){
        return vidroAutomatico;
    }
    
    public boolean getAlarme(){
        return alarme;
    }
    
    public boolean getTetoSolar(){
        return tetoSolar;
    }
    
    public boolean getKitMultimidia(){
        return kitMultimidia;
    }
    
    public double getPotenciaDoMotor(){
        return potenciaDoMotor;
    }
    
    public String getPinturaEspecial(){
        return pinturaEspecial;
    }
    
    public boolean getModelo(){
        return modelo;
    }
    
    public double pinturaEspecial(){
      if (pinturaEspecial.equals("especial") || pinturaEspecial.equals("metalica") || pinturaEspecial.equals("comemorativa")){
          return 2500;
      }else{
          return 0;
      }
    }
    
    public double modelo(){  
      if (modelo == true){
          return 0.70;
      }else{
          return 0;
      }
    }
    
    public double ipi(){
        double ipi = 1.20;
        if(getPotenciaDoMotor() == 1.0){
            return ipi - 0.10;
        }else{
            return ipi = 1.20;
        }
    }
    
    public double potenciaDoMotor(){
       return getPotenciaDoMotor();
    }
 
    public double ar(){
        if(ar == true){
            return 3000;
        }else{
          return 0;
        }
    }
    
    public double cambioAutomatico(){
        if(cambioAutomatico == true){
            return 5000;
        }else{
          return 0;
        }
    }
    
    public double alarme(){
        if(alarme == true){
            return 800;
        }else{
          return 0;
        }
    }
    
    public double tetoSolar(){
        if(tetoSolar == true){
            return 4000;
        }else{
          return 0;
        }
    }
    
    public double kitMultimidia(){
        if(kitMultimidia == true){
            return 1800;
        }else{
          return 0;
        }
    }
    
    public double valor(){
        double precoOpcionais = ar() + cambioAutomatico() + alarme() + tetoSolar() + kitMultimidia() + pinturaEspecial();
        double precoComImpostos = (precoOpcionais * ipi()) * modelo();
        return precoComImpostos;
    }
    
    public void escolhas(){
      if(ar == true){
            System.out.println("# Ar");
        }
        
      if(cambioAutomatico == true){
            System.out.println("# Cambio Automático");
        }
       
      if(alarme == true){
            System.out.println("# Alarme");
        }
       
      if(tetoSolar == true){
            System.out.println("# Teto Solar");
        }
        
      if(kitMultimidia == true){
             System.out.println("# Kit Multimídia");
        }
        
      if (pinturaEspecial.equals("especial") || pinturaEspecial.equals("metalica") || pinturaEspecial.equals("comemorativa")){
          System.out.println("# Pintura: " + pinturaEspecial);
      }
      
      if (modelo == true){
          System.out.println("# Modelo: Importante");
      }else{
          System.out.println("# Modelo: Não é importante");
      }
      
      System.out.println("# Potência do motor: " + potenciaDoMotor);
      
    }

}
