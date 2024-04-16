import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.Duration;

public class Estacionamento
{
    private String nomeFantasia, cnpj;
    private ArrayList <Funcionario> funcionarios;
    private ArrayList <Cliente> clientes;
    private double totalPagoVeiculo, valorPorMinuto, totalArrecadado;
    private Vagas vagas;
    private int vagasDisponiveis, maxVagas, totalVeiculos;
    private LocalDateTime inicioPeriodo, fimPeriodo;

    public Estacionamento(String nomeFantasia, String cnpj, double valorPorMinuto)
    {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.valorPorMinuto = valorPorMinuto;
        funcionarios = new ArrayList <>();
        clientes = new ArrayList <>();
        totalArrecadado = 0;
        totalVeiculos = 0;
        inicioPeriodo = LocalDateTime.now();
        vagas = new Vagas();
    }

    public Estacionamento()
    {
        funcionarios = new ArrayList <>();
        clientes = new ArrayList <>();
        totalArrecadado = 0;
        totalVeiculos = 0;
        inicioPeriodo = LocalDateTime.now();
        vagas = new Vagas();
    }
    
    public void setMaxVagas(int i)
    {
        vagas.setMaxVagas(i);
    }
    
    public int getMaxVagas()
    {
        return vagas.getMaxVagas();
    }

    public void setValorPorMinuto(double valorPorMinuto)
    {
        this.valorPorMinuto = valorPorMinuto;
    }

    public double getValorPorMinuto()
    {
        return valorPorMinuto;
    }

    public void setNomeFantasia(String nomeFantasia)
    {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeFantasia()
    {
        return nomeFantasia;    
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }

    public String getCnpj()
    {
        return cnpj;
    }

    public void addFuncionario(Funcionario funcionario)
    {
        funcionarios.add(funcionario);
    }

    public Funcionario getFuncionario(int i)
    {
        return funcionarios.get(i);
    }
    
    public boolean existeFuncionario()
    {
        if(funcionarios.size() != 0)
            return true;
        else
            return false;
    }
    
    public Funcionario localizaFuncionario(String cpfFuncionario)
    {
        for(int i = 0; i < funcionarios.size();i++)
        {
            if(cpfFuncionario.equals(getFuncionario(i).getCpf()))
            {
                return getFuncionario(i);
            }
        }
        return null;
    }

    public void addCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public Cliente getCliente(int i)
    {
        return clientes.get(i);
    }
        
    public boolean existeCliente()
    {
        if(clientes.size() != 0)
            return true;
        else
            return false;
    }

    public Cliente localizaCliente(String cpfCliente)
    {
        for(int i = 0; i < clientes.size();i++)
        {
            if(cpfCliente.equals(getCliente(i).getCpf()))
            {
                return getCliente(i);
            }
        }
        return null;
    }

    public void entrada(Veiculo veiculo)
    {
        if(vagas.estacionaVeiculo(veiculo))
        {
            System.out.println("Entrada registrada.");
            totalVeiculos++;
        }
        else
            System.out.println("Não há vagas diponíveis no momento.");
    }

    public void saida(Veiculo veiculo)
    {
        if(vagas.removeVeiculo(veiculo))
        {
            System.out.println("Saída registrada.");
        }
        else
            System.out.println("Veículo não encontado.");
    }
    
    public double totalAPagar(Veiculo veiculo)
    {
        totalArrecadado += veiculo.totalTempo() * valorPorMinuto;
        return veiculo.totalTempo() * valorPorMinuto;
    }
    
    public void imprimeInformacoes(Cliente cliente)
    {
        Veiculo veiculoCliente = cliente.getVeiculo();
        
        System.out.println("## Nome do cliente: "+cliente.getNome());
        System.out.println("## Modelo carro: "+veiculoCliente.getModelo());
        System.out.println("## Cor: "+veiculoCliente.getCor());
        System.out.println("## Placa: "+veiculoCliente.getPlaca());
        System.out.println("## Vaga: "+veiculoCliente.getNumeroVaga());
        System.out.println("## Entrada: "+veiculoCliente.getEntrada());
        if(veiculoCliente.getSaida() != null)
            System.out.println("## Saída: "+veiculoCliente.getSaida());
    }

    public void faturamento()
    {
        fimPeriodo = LocalDateTime.now();
        Duration duracao = Duration.between(inicioPeriodo,fimPeriodo);
        double duracaoHoras = duracao.toHours();
        if(duracaoHoras < 1)
            duracaoHoras = 1;
        System.out.println("### Total arrecado: R$"+totalArrecadado);
        System.out.println("### Quantidade de veiculos atendidos: "+totalVeiculos);
        System.out.println("### Media de veiculos (por hora): "+(totalVeiculos/duracaoHoras));
    }
}