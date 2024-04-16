import java.util.ArrayList;

public class comite
{
    private ArrayList<artigo> artigos;
  
    public comite(){
    
    }
    
    public void addArtigo(artigo artigos){
        this.artigos.add(artigos);
    }
    
    public void removerArtigos(int id){
        this.artigos.remove(id);
    }
    
    public ArrayList<artigo> getArtigos(){
        return artigos;
    }
}
