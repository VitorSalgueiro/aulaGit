package cinema;

public class Filme {
    
    public static int contador = 1;
    
    private int id;
    private String nome;
    private EnumStatus statusFilme;
    private EnumIdioma idiomaFilme;
    private EnumGenero generoFilme;
    private EnumClassificacao classificacaoFilme;
    private int duracao;
    private String desc;
    Sessao sessao;
    
    public Filme(){
        this.id = Filme.contador;
        Filme.contador++;
    }
    
    public void setSessao(Sessao sessao){
        this.sessao = sessao;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    }
   
    public String getNome(){
        return this.nome;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
    public Sessao getSessao(Sessao sessao){
        return this.sessao;
    }
    
}