package cinema;

public class Diretor {
    
    int id;
    String nome;
    EnumStatus statusDiretor;
    
    public static int contador = 1;
    
    public Diretor(){
        this.id = Diretor.contador;
        Diretor.contador++;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
}