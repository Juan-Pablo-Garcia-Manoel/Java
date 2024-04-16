
public class professor
{
    private instituicao instituicao;
    private String nome;
    private boolean ehGraduado,possuiEspecializacao,
    ehMestre,ehDoutor,ministraEAD;
    private int horaAula;
    private double salario;
    
    public professor(String nome,boolean ehGraduado,
    boolean possuiEspecializacao, boolean ehMestre,
    boolean ehDoutor, boolean ministraEAD,
    int horaAula, double salario){
        this.nome = nome;
        this.ehGraduado = ehGraduado;
        this.possuiEspecializacao = possuiEspecializacao;
        this.ehMestre = ehMestre;
        this.ehDoutor = ehDoutor;
        this.ministraEAD = ministraEAD;
        this.horaAula = horaAula;
    }
    
    // Metodo Calcula Salario
    
    public double Salario(){
        double salario = 0;
        salario = (25 * horaAula)
        + SalarioEspecializado()
        + SalarioMestre() +
        + SalarioDoutor() + 
        SalarioEAD();
        return salario;
    }
    
    public double SalarioEspecializado(){
        if(possuiEspecializacao == true){
          salario = salario * 0.15;
        }
        return salario;
    }
    
    public double SalarioMestre(){
        if(ehMestre == true){
          salario = salario * 0.45;
        }
        return salario;
    }
    
    public double SalarioDoutor(){
        if(ehDoutor == true){
           salario = salario * 0.75;
        }
        return salario;
    }
    
    public double SalarioEAD(){
        if(ministraEAD == true){
           salario = (25 * horaAula) / 0.25;
        }
        return salario;
    }
    
    //SET
    
    public void setInstituicao(instituicao instituicao){
       this.instituicao  = instituicao; 
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void setHoraAula(int horaAula){
        this.horaAula = horaAula;
    }
    
    public void setEhGraduado(boolean ehGraduado){
        this.ehGraduado = ehGraduado;
    }
    
    public void setPossuiEspecializacao (boolean possuiEspecializacao){
        this.possuiEspecializacao = possuiEspecializacao;
    }
    
    public void setEhMestre (boolean ehMestre){
        this.ehMestre = ehMestre;
    }
    
    public void setEhDoutor (boolean ehDoutor){
        this.ehDoutor = ehDoutor;
    }
    
    public void setMinistraEAD (boolean ministraEAD){
        this.ministraEAD = ministraEAD;
    }
    
    //GET
    
    public instituicao getInstituicao(){
        return instituicao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public int getHoraAula(){
        return horaAula;
    }
    
    public boolean getEhGraduado(){
        return ehGraduado;
    }
    
    public boolean getPossuiEspecializacao(){
        return possuiEspecializacao;
    }
    
    public boolean getEhMestre(){
        return ehMestre;
    }
    
    public boolean getEhDoutor(){
        return ehDoutor;
    }
    
    public boolean getMinistraEAD(){
        return ministraEAD;
    }
}
