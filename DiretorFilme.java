package cinema;

public class DiretorFilme {
    Diretor diretor;
    Filme filme;
    
    public void setFilme(Filme filme){
        this.filme = filme;
    }
    
    public void setDiretor(Diretor diretor){
        this.diretor = diretor;
    }
    
    public Filme getFilme(){
        return this.filme;
    }
     
    public Diretor getDiretor(){
        return this.diretor;
    }
    
}
