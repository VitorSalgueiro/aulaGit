package cinema;

public class Poltrona {
    
    int id;
    int numero;
    EnumStatus statusPoltrona;
    enum status{
        disponivel, indisponivel;
    };
    
    public static int contador = 1;
    
    public Poltrona(){
        this.id = Poltrona.contador;
        Poltrona.contador++;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    
    public int getId(){
        return this.id;
    }
    
    public int getNumero(){
        return this.numero;
    }  
}
