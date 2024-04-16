
public class aluno
{
    private turma turma;
    private String nome;
    private boolean escolha;
    
    public aluno(String nome,boolean escolha){
        this.nome = nome;
        this.escolha = escolha;
    }
    
    //Set
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEscolha(boolean escolha){
        this.escolha = escolha;
    }
    
    public void setTurma(turma turma){
       this.turma  = turma; 
    }
    
    //Get
    
    public String getNome(){
        return nome;
    }
    
    public boolean getEscolha(){
        return escolha;
    }
    
    public turma getTurma(){
        return turma;
    }
    
}
