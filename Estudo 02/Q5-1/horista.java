
public class horista extends empregado
{
   private double precoHora;
   private double horasTrabalhadas;
    
   public horista(double precoHora,double horasTrabalhadas,
   String nome, String sobrenome, String cpf){
        super(nome,sobrenome,cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
   //SET
   public void setPrecoHora(double precoHora){
       this.precoHora = precoHora;
   }
   
   public void sethHorasTrabalhadas(double horasTrabalhadas){
       this.horasTrabalhadas = horasTrabalhadas;
   }
    
   //GET
   public double getPrecoHora(){
       return precoHora;
   }
   
   public double getHorasTrabalhadas(){
       return horasTrabalhadas;
   }
   
   //Método
   public double vencimento(){
       return 0;
   }
}
