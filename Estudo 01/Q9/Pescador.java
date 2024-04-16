import java.util.ArrayList;

public class Pescador
{
    private ArrayList<Peixe> peixes;
    
    public Pescador()
    {
       peixes = new ArrayList<>();
    }
    
    public void addPeixe(Peixe peixe){
        peixes.add(peixe);
    }
    
    public ArrayList<Peixe> getPeixe(){
        return peixes;
    }
    
    public double somaPesos() {
        double soma = 0; 
        for (int i = 0; i < peixes.size(); i++) {
            if (peixes.get(i).getPeso() > 50) { 
                soma += (peixes.get(i).getPeso() - 50); 
            }
        }
        return soma; 
    }
    
    public double Multa(){
         return somaPesos() * 4;
    }

}
  