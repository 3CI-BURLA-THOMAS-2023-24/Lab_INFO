 

/**
 * Implementare la classe Teatro
   attributi:
    -nome
    -city
    -n_posti
   metodi:
    -2 costruttori
    -set/get/toString
 *
 * @author Thomas Burla
 * @version 1.0
 */
public class Teatro {
    private String nome;
    private String city;
    private int n_posti;
    //costruttore senza parametri
    public Teatro(){
        this.nome = "Sconosciuto";
        this.city = "Sconosciuta";
        this.n_posti = 0;
    }
    //costruttore con parametri controllati
    public Teatro(String nome, String city, int n_posti){
        //nome
        if(nome != null){
            this.nome = nome;
        }else{
            this.nome = "Sconosciuto";
        }
        //city
        if(city != null){
            this.city = city;
        }else{
            this.city = "Sconosciuta";
        }
        //n_posti
        if(n_posti > 0){
            this.n_posti = n_posti;
        }else{
            this.n_posti = 0;
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
    //set city
    public void setCity(String city){
        if(city != null){
            this.city = city;
        }
    }
    //get city
    public String getCity(){
        return this.city;
    }
    //set n_posti
    public void setN_posti(int n_posti){
        if(n_posti > 0){
            this.n_posti = n_posti;
        }
    }
    //get n_posti
    public int getN_posti(){
        return n_posti;
    }
    //toString
    public String toString(){
        String out = "";
        out+= "Il nome del teatro è: " + this.nome;
        out+= ". \n Il teatro si trova nella città: " + this.city;
        out+= ". \n La capienza massima del tetro è: " + this.n_posti + "posti.";
        return out;
    }
}