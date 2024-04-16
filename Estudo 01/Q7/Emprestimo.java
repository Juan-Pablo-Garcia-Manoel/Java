public class Emprestimo
{
    private double valor, juros;
    private int periodo;
    
    public Emprestimo()
    {
        
    }
    
    public Emprestimo(double valor, double juros, int periodo)
    {
        this.valor = valor;
        this.juros = juros;
        this.periodo = periodo;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void setJuros(double juros){
        this.juros = juros;
    }
    
    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }
    
    public double getValor(){
        return valor;
    }
    
    public double getJuros(){
        return juros;
    }
    
    public int getPeriodo(){
        return periodo;
    }
    
    public double juros(){
        double valorJuros = 0;
        valorJuros = (juros/100);
        return valorJuros; 
    }
    
    public double mensalidade()
    {
        double mensalidade = 0;
        return mensalidade = valor * (juros() / (1 - Math.pow(1 + juros(), - periodo)));
    }
    
    public double totalPago()
    {
        double totalPago = 0;
        return totalPago = mensalidade() * periodo;
    }
    
    public double totalJuros()
    {
        double totalJuros = 0;
        return totalPago() - valor;
    }
    
}