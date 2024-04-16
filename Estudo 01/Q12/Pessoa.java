import java.time.LocalDate;

public class Pessoa
{
    String nome,email;
    int anoNascimento,idade;
    Data dataAtual = new Data();
    
    public Pessoa(){
        if (dataValida(anoNascimento)){
            this.anoNascimento = anoNascimento;
        }
        this.nome = nome;
        this.email = email;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getAnoNascimento() {
        return anoNascimento;
    }
    
    private boolean dataValida(int anoNascimento) {
        if (anoNascimento < 1) {
            return false;
        } else {
            return true;
        }
    }
    
    public void minhaIdade(){
        idade = dataAtual.getAno() - getAnoNascimento();
        if (idade > 17) {
            System.out.println(nome + " possui " + idade + " superior a 17 anos.");
        } else {
            System.out.println(nome + " possui " + idade + " inferior a 17 anos.");
        }
    }
}
