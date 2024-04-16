import java.util.ArrayList;

public class Populacao
{
     private ArrayList<Pessoa> listaPessoas;
        
     public Populacao(){
         listaPessoas = new ArrayList<Pessoa>();
     }
    
     public void addPessoa(Pessoa pessoa ){
         listaPessoas.add(pessoa);
     }
       
     public ArrayList<Pessoa> getPessoa( ){
         return listaPessoas;
     }
       
    public double menorAltura() {
        double menorAltura = Double.MAX_VALUE;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getAltura() < menorAltura) {
                menorAltura = listaPessoas.get(i).getAltura();
            }
        }
        return menorAltura;
    }

     
    public double maiorAltura() {
        double maiorAltura = 0;
        
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getAltura() > maiorAltura) {
                maiorAltura = listaPessoas.get(i).getAltura();
            }
        }
        
        return maiorAltura;
    }


    
     public double mediaAlturaMulheres(){
        double somaAlturaMulheres = 0;
        int numMulheres = 0;
        for (int i = 0; i < listaPessoas.size(); i++){
            if (listaPessoas.get(i).getSexo().equals("feminino")) {
                somaAlturaMulheres += listaPessoas.get(i).getAltura();
                numMulheres++;
            }
        }
        
        if (numMulheres == 0) {
            return 0;
        }
        
        double mediaAlturaMulheres = somaAlturaMulheres / numMulheres;
        return mediaAlturaMulheres;
     }
     
     public double numeroHomens(){
        int numHomens = 0;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if(listaPessoas.get(i).getSexo().equals("masculino")) {
                numHomens++;
            }
        }
        return numHomens;
     }
     
     public double porcentagemHomens() {
        int numHomens = 0;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getSexo().equals("masculino")){
                numHomens++;
            }
        }
        double porcentagemHomens = 0; 
        porcentagemHomens = (numHomens * 100.0) / listaPessoas.size();
        return porcentagemHomens;
     }

     public double porcentagemMulheres(){
        int totalPessoas = getPessoa().size();
        int numMulheres = 0;
        for (int i = 0; i < listaPessoas.size(); i++)  {
            if (listaPessoas.get(i).getSexo().equals("feminino")) {
                numMulheres++;
            }
        }
        double porcentagemMulheres = 0;
        porcentagemMulheres = (numMulheres * 100.0) / totalPessoas;
        return porcentagemMulheres;
     }

     public double porcentagemMulheres18a35VerdesLouros(){
        int numMulheres18a35VerdesLouros = 0, numMulheres = 0;
        for (int i = 0; i < listaPessoas.size(); i++){
            if (listaPessoas.get(i).getSexo().equals("feminino") && listaPessoas.get(i).getIdade() >= 18 && listaPessoas.get(i).getIdade() <= 35 && listaPessoas.get(i).getCorDosOlhos().equals("verde") && listaPessoas.get(i).getCorDosCabelos().equals("loiro")){
                numMulheres18a35VerdesLouros++;
            }
            if (listaPessoas.get(i).getSexo().equals("feminino")) {
                numMulheres++;
            }
        }
        double porcentagemMulheres18a35VerdesLouros = numMulheres18a35VerdesLouros * 100.0 / numMulheres;
        return porcentagemMulheres18a35VerdesLouros;
    }

}
