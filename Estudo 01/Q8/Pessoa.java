public class Pessoa
{   
   String nome, sexo, corDosOlhos, corDosCabelos;
   int idade;
   double altura;
   
   public Pessoa(){
    
   }
   
   public Pessoa(String nome, String sexo, double altura, String corDosOlhos, 
   String corDosCabelos, int idade){
     
            this.nome = nome;
            this.sexo = sexo;
            this.altura = altura;
            this.corDosOlhos = corDosOlhos;
            this.corDosCabelos = corDosCabelos;
            this.idade = idade;

   }

   public void setNome(String nome){
        this.nome = nome;
   }
   
   public void setSexo(String sexo){
        this.sexo = sexo;
   }
   
   public void setAltura(double altura){
        this.altura = altura;
   }
     
   public void setCorDosOlhos(String corDosOlhos){
        this.corDosOlhos = corDosOlhos;
   }
   
   public void setCorDosCabelos(String corDosCabelos){
        this.corDosCabelos = corDosCabelos;
   }
   
   public void setIdade(int idade){
        this.idade = idade;
   }
   
   public String getNome( ){
        return nome;
   }
   
   public String getSexo( ){
        return sexo;
   }
   
   public double getAltura( ){
        return altura;
   }
   
   public String getCorDosOlhos( ){
        return corDosOlhos;
   }
   
   public String getCorDosCabelos( ){
        return corDosCabelos;
   }
   
   public int getIdade( ){
        return idade;
   }

}
