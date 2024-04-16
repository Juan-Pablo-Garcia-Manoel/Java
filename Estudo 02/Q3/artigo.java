import java.util.ArrayList;

public class artigo
{
    private ArrayList<aluno> alunos;
    private pessoa pessoa;
    
    public artigo(){
    
    }
  
    public void addAluno(aluno aluno){
        alunos.add(aluno);
    }
    
    public void removerAlunos(int id){
        alunos.remove(id);
    }
    
    public ArrayList<aluno> getAlunos(){
      return alunos;
    }

}
