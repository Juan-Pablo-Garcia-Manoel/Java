public class Cliente extends Pessoa
{
    private Veiculo veiculo;
    
    public Cliente(String nome, String cpf) 
    {
        super(nome, cpf);
    }
    
    public Cliente()
    {
        super();
    }
    
    public void setVeiculo(Veiculo veiculo)
    {
        this.veiculo = veiculo;
    }
    
    public Veiculo getVeiculo()
    {
        return veiculo;
    }
}