import java.util.ArrayList;

public class competicao
{
  private ArrayList<competidor> competidores;
  
   public competicao(){
        competidores = new ArrayList<>();
    }
    
    public void addCompetido(competidor competidores){
        this.competidores.add(competidores);
    }
    
    public void removerCompetidores(int id){
        this.competidores.remove(id);
    }
    
    public ArrayList<competidor> getCompetidores(){
        return competidores;
    }

}
