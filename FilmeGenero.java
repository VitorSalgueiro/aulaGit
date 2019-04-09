package cinema;

public class FilmeGenero {
    
    Filme filme;
    Genero genero;
    

    public void setFilme(Filme filme){
        this.filme = filme;
    }
    
    public void setGenero(Genero genero){
        this.genero = genero;
    }
    
    public Filme getFilme(){
        return this.filme;
    }
    
    public Genero getGenero(){
        return this.genero;
    }
    
}