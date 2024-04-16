 public class Funcionario
{

    private int horasTrabalhadas, dependentes;
    private double salarioHora;
    
    public Funcionario(){    
        
    }
    
    public Funcionario(int horasTrabalhadas, double salarioHora , int dependentes ){ 
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
        this.dependentes = dependentes;
    }
     
    public void setHorasTrabalhadas(int horasTrabalhadas){
        if (salarioHora >=0){
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public void setSalarioHora(double salarioHora){
        if (salarioHora >=0 && salarioHora >= this.salarioHora ){
            this.salarioHora = salarioHora;
        }
    }
    
    public void setNumeroDependentes(int dependentes){
        if (dependentes >= 0){
            this.dependentes = dependentes;
        }        
    }
    
    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    
    public double getSalarioHora(){
        return salarioHora;
    }
    
    public int getNumeroDependentes(){
        return dependentes;
    }
   
    public double dependentes(){
        return 50 * dependentes;
    }
    
    public double salarioBruto(){
        double salarioBruto = (horasTrabalhadas * salarioHora) + dependentes();
        return salarioBruto;
    }
    
    public double inss(){
        double inss = 0;
        if(salarioBruto() <= 1000){
            inss =  (salarioBruto() * 8.5)/100;
            return inss;
        } else {
            inss = (salarioBruto() * 9)/100;
            return inss;
        }
        
    }
    
    public double ir(){
        double ir = 0;
        if(salarioBruto() > 500 && salarioBruto()<= 1000){
            ir = (salarioBruto() * 7)/100;
            return ir;
        } else {
             return 0;
        }
        
    }
    
    public double salarioLiquido(){ 
        return (salarioBruto() - inss() - ir());
    }
    
}

