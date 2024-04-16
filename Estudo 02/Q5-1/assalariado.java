
public class assalariado extends empregado
{
   private double salario;
   
   public assalariado(double salario,String nome, String sobrenome, String cpf){
       super(nome,sobrenome,cpf);
       this.salario = salario;
    }
    
   //SET
   public void setSalario(double salario){
       this.salario = salario;
   }
    
   //GET
   public double getSalario(){
       return salario;
   }
   
   //Método
   public double vencimento(){
       return 0;
   }
}
