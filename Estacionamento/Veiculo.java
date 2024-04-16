import java.time.LocalDateTime;
import java.time.Duration;

public class Veiculo
{
    private String placa, modelo, cor;
    protected LocalDateTime tempoEntrada, tempoSaida;
    private int numeroVaga;
    
    public Veiculo(String placa, String modelo, String cor)
    {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        tempoEntrada = LocalDateTime.now();
    }
    
    public Veiculo()
    {
        
    }
    
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
    
    public String getPlaca()
    {
        return placa;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    
    public String getCor()
    {
        return cor;
    }
    
    public void setEntrada()
    {
        tempoEntrada = LocalDateTime.now();
    }
    
    public LocalDateTime getEntrada()
    {
        return tempoEntrada;
    }
    
    public void setSaida()
    {
        tempoSaida = LocalDateTime.now();
    }
    
    public LocalDateTime getSaida()
    {
        return tempoSaida;
    }
    
    public void setNumeroVaga(int numeroVaga)
    {
        this.numeroVaga = numeroVaga;
    }
    
    public int getNumeroVaga()
    {
        return numeroVaga;
    }
    
    public double totalTempo()
    {
        Duration duracao = Duration.between(tempoEntrada,tempoSaida);
        double duracaoMinutos = duracao.toMinutes();
        if(duracaoMinutos < 15)
            duracaoMinutos = 15;
        return Math.ceil(duracaoMinutos/15);
    }
}
