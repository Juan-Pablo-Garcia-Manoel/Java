import java.time.Duration;

public class Moto extends Veiculo
{
    public Moto(String placa, String modelo, String cor)
    {
        super(placa, modelo, cor);
    }
    
    public Moto()
    {
        super();
    }
    
    @Override
    public double totalTempo()
    {
        Duration duracao = Duration.between(tempoEntrada,tempoSaida);
        double duracaoMinutos = duracao.toMinutes();
        if(duracaoMinutos < 15)
            duracaoMinutos = 15;
        return Math.ceil(duracaoMinutos/15) * 0.5;
    }
}