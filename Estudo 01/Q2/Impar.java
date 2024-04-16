public class Impar
{
    int numeroInicial;
    int numeroFinal;
    
    public Impar(){
       
    }
    
    public Impar(int numeroInicial, int numeroFinal){
        this.numeroInicial = numeroInicial;
        this.numeroFinal = numeroFinal;
    }
    
    public void setNumeroInicial(int numeroInicial){
        this.numeroInicial = numeroInicial;
    }
    
    public void setNumeroFinal(int numeroFinal){
        this.numeroFinal = numeroFinal;
    }
    
    public int getNumeroInicial(){
        return numeroInicial;
    }

    public int getNumeroFinal(){
        return numeroFinal;
    }
    
    public void ehImpar(){
        int resultado = 0;
        
        for(int i = numeroInicial + 1; i < (numeroFinal + 1) - 1; i++)
        {
            if(i % 2 == 1){
               System.out.print(i + " ");
            }
        }
        
    }
    
}
