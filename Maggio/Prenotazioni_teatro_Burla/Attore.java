/**
 * Attore
 * 
 * @author Thomas Burla
 * @version 1.0
 */
public class Attore {
    //variabili d'istanza
    private String nome;
    private int anni;
    //costruttore senza parametri
    public Attore(){
        this.nome = "-";
        this.anni = 0;
    }
    //costruttore con parametri controllati
    public Attore(String nome, int anni){
        //nome
        if(nome != null){
            this.nome = nome;
        }else{
            this.nome = "-";
        }
        //anni
        if(anni > 0){
            this.anni = anni;
        }else{
            anni = 0;
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
    //toString
    public String toString(){
        String out = "";
        out+= "L'attore si chiama: " + this.nome;
        out+= " e ha " + this.anni + "anni";
        return out;
    }
}
