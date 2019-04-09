package cinema;

import java.sql.Timestamp;


public class Sessao {

    int id;
    Timestamp inicio;
    Timestamp fim;
    boolean dublado;
    boolean oculos3d;
    TabelaPreco tabelaPreco;
    Filme filme;
    Sala sala;
    String letra;
    
    public static int contador = 1;
    
    public Sessao(){
        this.id = Sessao.contador;
        Sessao.contador++;
    }
    
    public void setInicio(Timestamp inicio) {
        this.inicio = inicio;
    }
    
    public void setFim(Timestamp fim) {
    	this.fim = fim;
    }
    
    public void setLetra(String letra) {
        this.letra = letra;
    } 
    
    public void setOculos3d(boolean oculos3d) {
        this.oculos3d = oculos3d;
    }
    
    public void setTabelaPreco(TabelaPreco tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }
    
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public int getId(){
        return this.id;
    }
    
    public Timestamp getInicio(){
        return this.inicio;
    }
    
    public boolean getDublado(){
        return this.dublado;
    }
    
    public boolean getOculos3d(){
        return this.oculos3d;
    }
    
    public TabelaPreco getTabelaPreco(){
        return this.tabelaPreco;
    }
    
    public Filme getFilme(){
        return this.filme;
    }
    
    public Sala getSala(){
        return this.sala;
    }
    
}
