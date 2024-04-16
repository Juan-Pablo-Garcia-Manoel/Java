import java.util.ArrayList;

public class loterica
{
    private ArrayList<apostador> apostadores;
    
    public loterica(){
        apostadores = new ArrayList<>();
    }
    
    //SET e GET e Manipulação da lista
    
    public void addJogo(apostador apostadores){
        this.apostadores.add(apostadores);
    }
    
    public void removerApostadores(int id){
        this.apostadores.remove(id);
    }
    
    public ArrayList<apostador> getApostadores(){
        return apostadores;
    }
}
