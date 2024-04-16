import java.util.ArrayList;

public class Funcionario extends Pessoa
{
    private ArrayList <Cliente> clientes;
    
    public Funcionario(String nome, String cpf)
    {
        super(nome, cpf);
        clientes = new ArrayList <>();
    }
    
    public Funcionario()
    {
        super();
        clientes = new ArrayList <>();
    }
    
    public void addCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }
    
    public Cliente getCliente(int i)
    {
        return clientes.get(i);
    }
}