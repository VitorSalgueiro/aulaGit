package cinema;

public class Fila {
    
    int id;
    String letra;    
    Poltrona poltrona;
    
    public static int contador = 1;
    
    public Fila(){
        this.id = Fila.contador;
        Fila.contador++;
    }
    
    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public void setPoltrona(Poltrona poltrona) {
        this.poltrona = poltrona;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getLetra(){
        return this.letra;
    }
    
    public Poltrona getPoltrona(){
        return this.poltrona;
    }
    
}
