
public class imovel
{
    private String endereco;
    private double preco;
    private boolean venda;
    
    public imovel(String endereco,double preco){
        this.endereco = endereco;
        this.preco = preco;
    }
    
    //SET
    public void seteEndereco(String Endereco){
        this.endereco = endereco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setVenda(boolean venda){
        this.venda = venda;
    }
    
    //GET
    public String getEndereco(){
        return endereco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public boolean getVenda(){
        return venda;
    }
    
    public String compraFeita(){
        if (venda = true){
             return "Compra efetuada";
        }else{
            return "Compra não efetuada";
        }
    }
    
}
