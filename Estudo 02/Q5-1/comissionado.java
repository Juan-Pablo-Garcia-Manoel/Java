
public class comissionado extends empregado
{
   private double totalVenda;
   private double taxaComissao;
   
   public comissionado(double totalVenda, double taxaComissao,
   String nome, String sobrenome, String cpf){
       super(nome,sobrenome,cpf);
       this.totalVenda = totalVenda;
       this.taxaComissao = taxaComissao;
    }
   
    public comissionado(){
    
    }
    
   //SET
   public void setTotalVenda(double totalVenda){
       this.totalVenda = totalVenda;
   }
   
   public void setTaxaComissao(double taxaComissao){
       this.taxaComissao = taxaComissao;
   }
    
   //GET
   public double getTotalVenda(){
       return totalVenda;
   } 
  
   public double getTaxaComissao(){
       return taxaComissao;
   }  
   
   //Método
   public double vencimento(){
       return 0;
    }
}
