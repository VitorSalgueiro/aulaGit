package cinema;

public class Atua {
    Ator ator;
    Filme filme;
    
    public void setAtor(Ator ator){
        this.ator = ator;
    }
    
    public void setFilme(Filme filme){
        this.filme = filme;
    }
    
    public Filme getFilme(){
        return this.filme;
    }
    
    public Ator getAtor(){
        return this.ator;
    }
    
}
