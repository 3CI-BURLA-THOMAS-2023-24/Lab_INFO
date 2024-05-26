/**
 * Attore
 * 
 * @author Thomas Burla
 * @version 1.0
 */
public class Attore {
    //variabili d'istanza
    private String nome;
    private String cognome;
    private int anni;
    private String parte;
    //costruttore senza parametri
    public Attore(){
        this.nome = "-";
        this.cognome = "-";
        this.anni = 0;
        this.parte = "-";
    }
    //costruttore con parametri controllati
    public Attore(String nome, String cognome, int anni, String parte){
        //nome
        if(nome != null){
            this.nome = nome;
        }else{
            this.nome = "-";
        }
        //cognome
        if(cognome != null){
            this.cognome = cognome;
        }else{
            this.cognome = "-";
        }
        //anni
        if(anni > 0){
            this.anni = anni;
        }else{
            anni = 0;
        }
        //parte
        if(parte != null){
            this.parte = parte;
        }else{
            this.parte = "-";
        }
    }
    //set nome
    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }
    //get nome
    public String getNome(){
        return this.nome;
    }
    //set cognome
    public void setCognome(String cognome){
        if(cognome != null){
            this.cognome = cognome;
        }
    }
    //get cognome
    public String getCognome(){
        return this.cognome;
    }
    //set anni
    public void setAnni(int anni){
        if(anni > 0){
            this.anni = anni;
        }
    }
    //get anni
    public int getAnni(){
        return this.anni;
    }
    //set parte
    public void setparte(String parte){
        if(parte != null){
            this.parte = parte;
        }
    }
    //get parte
    public String getparte(){
        return this.parte;
    }
    //toString
    public String toString(){
        String out = "";
        out+= "L'attore si chiama: " + this.nome +  " " + this.cognome;
        out+= ", ha " + this.anni + "anni";
        out+= " e ricopre la parte di " + this.parte + ".";
        return out;
    }
}
