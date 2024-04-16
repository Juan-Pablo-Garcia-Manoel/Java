import java.util.ArrayList;

public class turma
{
    private ArrayList<aluno> alunos;
    
    public turma(){
        alunos = new ArrayList<>();
    }
    
     public void addAluno(aluno alunos){
        this.alunos.add(alunos);
    }
    
    public void removerAlunos(int id){
        this.alunos.remove(id);
    }
    
    public ArrayList<aluno> getAlunos(){
        return alunos;
    }

}
