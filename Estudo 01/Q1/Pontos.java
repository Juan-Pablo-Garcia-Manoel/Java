public class Pontos
{
    //Variáveis
    int x1;
    int x2;
    int y1;
    int y2;
    
    //Métodos Construtores
    public Pontos(){
    
    }
    
    public Pontos(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    //Métodos Calculo Delta X e Y
        
    public double deltaX(){
        return x1 - x2;
    }
    
    public double deltaY(){
        return y1 - y2;
    }
    
    //Método Calcula a distância entre 2 pontos
    
    public double distancia(){
        return Math. sqrt(Math.pow(deltaX(),2) + Math.pow(deltaY(),2));
    }
}
