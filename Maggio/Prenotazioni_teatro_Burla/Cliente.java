/**
 * Cliente:
    -nome
    -cognome
    -email
    -metodi opportuni
 */
public class Cliente {
    private String nome;
    private String cognome;
    private String email;
    private int posto;
    //costruttore senza parametri
    public Cliente(){
        this.nome = "Sconosciuto";
        this.cognome = "Sconosciuto";
        this.email = "Sconosciuta";
        this.posto = 0;
    }
    //costruttore con parametri controllati
    public Cliente(String nome, String cognome, String email){
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
        this.posto = 0;
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
    //set Posto
    public void setPosto(Biglietto biglietto){
        if(biglietto != null){
            this.posto = biglietto.getNumero_posto();
        }
    }
    //get Posto
    public int getPosto(){
        return this.posto;
    }
    //toString
    public String toString(){
        String out = "";
        out += "Il nome del titolare è: " + this.nome;
        out += ".\n Il cognome del titolare è: " + this.cognome;
        out += ".\n L'email del titolare è: " + this.email;
        out += ".\n Il numero del posto di questo cliente è: " + this.posto + ".";
        return out;
    }
}