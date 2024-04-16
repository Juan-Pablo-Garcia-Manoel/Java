
public class Investimento
{
    double valorInvestido,taxaMensal;
    
    public Investimento(){
        
    }
    
    public Investimento(double valorInvestido, double taxaMensal){
        this.valorInvestido = valorInvestido;
        this.taxaMensal = taxaMensal;
    }
    
    public void setValorInvestido(double valorInvestido){
        this.valorInvestido = valorInvestido;
    }
    
    public void setTaxaMensal(double taxaMensal){
        this.taxaMensal = taxaMensal;
    }
    
    public double getValorInvestido(){
        return valorInvestido;
    }
    
    public double getTaxaMensal(){
        return taxaMensal;
    }
    
    public double taxa(){
        double valorTaxa = 0;
        valorTaxa = taxaMensal/100;
        return valorTaxa;
    }
    
    public double saldo(){
        double saldo = 0;
        for (int mes = 1; mes <= 12; mes++) {
            saldo += valorInvestido;
            saldo += saldo * taxa();
        }
        return saldo;
    }
}
