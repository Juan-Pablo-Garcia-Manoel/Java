
public class Aposentadoria
{
    private int idade, tempoTrabalhados;
    
    public Aposentadoria()
    {
        
    }
    
    public Aposentadoria(int idade, int tempoTrabalhados)
    {
        this.idade = idade;
        this.tempoTrabalhados = tempoTrabalhados;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setTempoTrabalhados(int tempoTrabalhados){
        this.tempoTrabalhados = tempoTrabalhados;
    }
    
    public int getIdade(){
        return idade;
    }

    public int getTempoTrabalhados(){
        return tempoTrabalhados;
    }
    
    public boolean aposentadoria()
    {
        if(idade >= 65)
            return true;
        else if(tempoTrabalhados >= 30)
            return true;
        else if(idade >= 60 && tempoTrabalhados >= 25)
            return true;
        else
            return false;
    }
}
