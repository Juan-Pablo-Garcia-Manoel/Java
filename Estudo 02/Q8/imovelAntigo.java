
public class imovelAntigo extends imovel
{
    private boolean desconto;
    private double valorDesconto;
    
    public imovelAntigo(String endereco, double preco){
        super(endereco,preco);
    }
    
    //SET
    public void setDesconto(boolean desconto){
        this.desconto = desconto;
    }
    
    public void setValorDesconto(double valorDesconto){
        this.valorDesconto = valorDesconto;
    }
    
    //GET
    public boolean getDesconto(){
        return desconto;
    }
    
    public double getValorDesconto(){
        return valorDesconto;
    }

    //Metodo desconto
    public boolean valorDesconto(){
        if (desconto = true){
            double valor = 0;
            valor = getPreco() - valorDesconto;
        }
        return false;
    }
}
