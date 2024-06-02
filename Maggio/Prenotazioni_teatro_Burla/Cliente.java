/**
 * Cliente:
    -nome
    -cognome
    -email
    -metodi opportuni
 */
import java.util.*;
public class Cliente {
    private String nome;
    private String cognome;
    private String email;
    private ArrayList <Biglietto> biglietti;
    private int anni;
    //costruttore senza parametri
    public Cliente(){
        this.nome = "Sconosciuto";
        this.cognome = "Sconosciuto";
        this.email = "Sconosciuta";
        this.biglietti = new ArrayList <Biglietto> ();
        this.anni = 0;
    }
    //costruttore con parametri controllati
    public Cliente(String nome, String cognome, String email, int anni){
        //nome
        if(nome != null){
            this.nome = nome;
        }else{
            this.nome = "Sconosciuto";
        }
        //cognome
        if(cognome != null){
            this.cognome = cognome;
        }else{
            this.cognome = "Sconosciuto";
        }
        //email
        if(email != null){
            this.email = email;
        }else{
            this.email = "Sconosciuto";
        }
        //anni
        if(anni > 0){
            this.anni = anni;
        }else{
            this.anni = 0;
        }
        //biglietti
        this.biglietti = new ArrayList <Biglietto> ();

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
    //set email
    public void setEmail(String email){
        if(email != null){
            this.email = email;
        }
    }
    //get email
    public String getEmail(){
        return this.email;
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
    //set biglietto
    public void setBiglietto(Biglietto biglietto){
        if(biglietto != null){
            this.biglietti.add(biglietto);
        }
    }
    //get biglietto, dato il titolare
    public String getBiglietto(String titolare){
        Biglietto biglietto = null;
        boolean trovato = false;
        int i = 0;
        while((trovato == false) && (i < (this.biglietti).size())){
            biglietto = (this.biglietti).get(i);
            if((biglietto.getTitolare()).equalsIgnoreCase(titolare)){
                trovato = true;
            }
            i++;
        }
        if(trovato == true){
            return biglietto.toString();
        }
        return "Nessun biglietto corrispondente al nominativo";
    }
    //toString
    public String toString(){
        String out = "";
        Biglietto biglietto = null;
        out += "Il nome del titolare è: " + this.nome;
        out += ".\nIl cognome del titolare è: " + this.cognome;
        out += ".\nL'email del titolare è: " + this.email;
        out += ".\nIl cliente ha " + this.anni + " anni.";
        out += "\nIl cliente possiede i seguenti biglietti: ";
        for(int i = 0; i < this.biglietti.size(); i++){
            biglietto = biglietti.get(i);
            out += "\nBIGLIETTO " + (i + 1) + "--> Prezzo: " + biglietto.getPrezzo() + "; Posto: " + biglietto.getNumero_posto() + "; Tipo di spettacolo: " + biglietto.getTipoSpettacolo();
        }
        return out;
    }
}