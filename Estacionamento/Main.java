import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public  static void main(String[] args){
        Estacionamento estacionamento = new Estacionamento();

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do estacionamento: ");
        estacionamento.setNomeFantasia( ler.next() );

        System.out.println("Informe o CNPJ do estacionamento: ");
        estacionamento.setCnpj( ler.next() );

        System.out.println("Informe o valor do quarto de hora (15 min): ");
        estacionamento.setValorPorMinuto( ler.nextDouble() );

        System.out.println("Informe o número máximo de vagas: ");
        estacionamento.setMaxVagas( ler.nextInt() );

        while(true){
            int escolha = menu(estacionamento);
            if(escolha == 6){
                break;
            } else if(escolha == 1){
                cadastroFuncionario(estacionamento);
            } else if(escolha == 2){
                if(estacionamento.existeFuncionario())
                    cadastrarCliente(estacionamento);
                else
                {
                    System.out.println("Primeiro eh necessario cadastrar um funcionario.");
                    cadastroFuncionario(estacionamento);   
                }
            } else if(escolha == 3){
                if(estacionamento.existeCliente())
                    registrarEntrada(estacionamento);
                else
                {
                    System.out.println("Nao ha clientes.");
                    cadastrarCliente(estacionamento);
                }
            } else if(escolha == 4){
                if(estacionamento.existeCliente())
                    registrarSaida(estacionamento);
                else
                {
                    System.out.println("Nao ha clientes.");
                    cadastrarCliente(estacionamento);
                }
            } else if(escolha == 5){
                estacionamento.faturamento();
            }
        }

    }

    public  static int menu(Estacionamento estacionamento){
        System.out.println("###" + "Estacionamento " + estacionamento.getNomeFantasia() + "###");
        System.out.println("####### MENU ########");
        System.out.println("## 1) Cadastrar funcionário:");
        System.out.println("## 2) Cadastrar cliente:");
        System.out.println("## 3) Registrar entrada:");
        System.out.println("## 4) Registrar saida:");
        System.out.println("## 5) Faturamento:");
        System.out.println("## 6) Sair");
        Scanner ler = new Scanner(System.in);
        return ler.nextInt();        
    }

    public  static void cadastroFuncionario(Estacionamento estacionamento){
        Scanner ler = new Scanner(System.in);
        System.out.println("### CADASTRO FUNCIONÁRIO ###");
        Funcionario funcionario = new Funcionario();

        System.out.println("Informe o nome do funcionário: ");
        funcionario.setNome( ler.next() );

        System.out.println("Informe o cpf do funcionário: ");
        funcionario.setCpf( ler.next() );

        estacionamento.addFuncionario(funcionario);
        System.out.println("Funcionário cadastrado com sucesso");

    }

    public  static void cadastrarCliente(Estacionamento estacionamento){
        Funcionario meuFuncionario = null;
        Veiculo veiculo = new Veiculo();
        Scanner ler = new Scanner(System.in);

        System.out.println("### CADASTRO CLIENTE ###");
        Cliente cliente = new Cliente();
        do
        {
            System.out.println("CPF do funcionario que ira cadastrar: ");
            String cpfFuncionario = ler.next();
            meuFuncionario = estacionamento.localizaFuncionario(cpfFuncionario);
        }
        while(meuFuncionario == null);

        meuFuncionario.addCliente(cliente);
        estacionamento.addCliente(cliente);

        System.out.println("Informe o nome do cliente: ");
        cliente.setNome( ler.next() );

        System.out.println("Informe o cpf do cliente: ");
        cliente.setCpf( ler.next() );

        System.out.println("Informe o veiculo do cliente (carro), (moto) ou (caminhao): ");
        String resposta = ler.next();        

        veiculo = (resposta.equalsIgnoreCase("carro")) ? new Carro() : 
        (resposta.equalsIgnoreCase("moto")) ? new Moto() : 
        new Caminhao();

        System.out.println("Informe a placa do veículo: ");
        veiculo.setPlaca(ler.next());

        System.out.println("Informe o modelo do veículo: ");
        veiculo.setModelo(ler.next());

        System.out.println("Informe a cor do veículo: ");
        veiculo.setCor(ler.next());

        cliente.setVeiculo(veiculo);

        System.out.println("Cliente e seu veículo cadastrado com sucesso");
    }

    public static void registrarEntrada(Estacionamento estacionamento) {
        Scanner ler = new Scanner(System.in);
        Cliente meuCliente = null; 

        do
        {
            System.out.println("Informe o cpf do Cliente");
            String cpfCliente = ler.next();
            meuCliente = estacionamento.localizaCliente(cpfCliente);
        }
        while(meuCliente == null);
        estacionamento.entrada(meuCliente.getVeiculo());
    }

    public static void registrarSaida(Estacionamento estacionamento){
        Scanner ler = new Scanner(System.in);
        Cliente meuCliente = null; 

        do
        {
            System.out.println("Informe o cpf do Cliente");
            String cpfCliente = ler.next();
            meuCliente = estacionamento.localizaCliente(cpfCliente);
        }
        while(meuCliente == null);
        estacionamento.saida(meuCliente.getVeiculo());
        System.out.println("Saida registrada.");
        totalAPagar(estacionamento, meuCliente);
    }

    public static void totalAPagar(Estacionamento estacionamento, Cliente cliente){
        System.out.println("Total a pagar: R$"+estacionamento.totalAPagar(cliente.getVeiculo()));
    }
}
