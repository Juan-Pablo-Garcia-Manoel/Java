import java.util.ArrayList;

public class Vagas
{
    private Veiculo[] veiculos;
    private int maxVagas, totalVeiculos;

    public Vagas()
    {

    }

    public Vagas(int maxVagas)
    {
        this.maxVagas = maxVagas;
        veiculos = new Veiculo[maxVagas];
    }

    public void setMaxVagas(int maxVagas)
    {
        this.maxVagas = maxVagas;
        veiculos = new Veiculo[maxVagas];
    }

    public int getMaxVagas()
    {
        return maxVagas;
    }

    public boolean estacionaVeiculo(Veiculo veiculo)
    {
        int vagaLivre = localizaVagaLivre();

        if(vagaLivre != -1)
        {
            veiculos[vagaLivre] = veiculo;
            veiculo.setNumeroVaga(vagaLivre);
            veiculo.setEntrada();
            return true;
        }
        else
            return false;
    }

    public boolean removeVeiculo(Veiculo veiculo)
    {
        int vagaDoVeiculo = veiculo.getNumeroVaga();

        if(vagaDoVeiculo >= 0)
        {
            veiculos[vagaDoVeiculo] = null;
            veiculo.setSaida();
            return true;
        }
        else
            return false;
    }

    public int localizaVagaLivre()
    {
        int i;
        
        for(i = 0; i < maxVagas; i++)
        {
            if(veiculos[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
}
