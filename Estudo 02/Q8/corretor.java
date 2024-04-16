import java.util.ArrayList;

public class corretor
{
    private String nome;
    private int idade;
    private ArrayList<imovel> imoveis;
    
    public corretor(String nome,int idade){
        this.nome = nome;
        this.idade =idade;
        imoveis = new ArrayList<>();
    }
    
    //SET e GET e Manuntenção lista imoveis novos.
    
    public void addImovel(imovel imoveis){
        this.imoveis.add(imoveis);
    }
    
    public void removeriImoveis(int id){
        this.imoveis.remove(id);
    }
    
    public ArrayList<imovel> getImoveis(){
        return imoveis;
    }
    
    //SET
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
       this.idade =idade;
    }
    
    //GET
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    //Metodo de venda
    
    public double recebimento(){
       double total = 0;
       for (imovel imovel : imoveis){
            total += imovel.getPreco();
       }
       return total;  
    }
}
