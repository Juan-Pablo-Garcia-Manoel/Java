import java.util.ArrayList;

public class instituicao
{
   private ArrayList<professor> professores;
    
    public instituicao(){
        professores = new ArrayList<>();
    }
    
     public void addProfessor(professor professores){
        this.professores.add(professores);
    }
    
    public void removerProfessores(int id){
        this.professores.remove(id);
    }
    
    public ArrayList<professor> getProfessores(){
        return professores;
    }
   
}
