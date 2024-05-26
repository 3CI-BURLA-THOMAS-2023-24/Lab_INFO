/**
 * Teatro
   attributi:
    -nome
    -city
    -n_posti
   metodi:
    -2 costruttori
    -set/get/toString

    Modificare le seguenti classi:
    Teatro aggiungere un arrayList di spettacoli
 *
 * @author Thomas Burla
 * @version 1.0
 */
import java.util.*;
public class Teatro {
    private String nome;
    private String city;
    private int n_posti;
    private ArrayList<Spettacolo> spettacoli;
    //costruttore senza parametri
    public Teatro(){
        this.nome = "Sconosciuto";
        this.city = "Sconosciuta";
        this.n_posti = 0;
        this.spettacoli = null;
    }
    //costruttore con parametri controllati
    public Teatro(String nome, String city, int n_posti, Spettacolo spettacolo){
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
        //spettacolo
        if(spettacolo != null){
            this.spettacoli.add(spettacolo);
        }else{
            this.spettacoli = null;
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
    //set spettacolo
    public void setSpettacolo(Spettacolo spettacolo){
        if(spettacolo != null){
            spettacoli.add(spettacolo);
        }
    }
    //get spettacolo
    public String getSpettacolo(String nome){
        Spettacolo spettacolo = null;
        int i = 0;
        boolean trovato = false;
        while((i < spettacoli.size()) && (trovato == false)){
            spettacolo = spettacoli.get(i);
            if((spettacolo.getNomeSpettacolo()).equalsIgnoreCase(nome)){
                trovato = true;
            }
            i++;
        }
        if(trovato == true){
            return spettacolo.getNomeSpettacolo();
        }
        return "Non esiste alcuno spettacolo corrispondente alle informazioni fornite";
    }
    //toString
    public String toString(){
        String out = "";
        out+= "Il nome del teatro è: " + this.nome;
        out+= ". \n Il teatro si trova nella città: " + this.city;
        out+= ". \n La capienza massima del tetro è: " + this.n_posti + "posti";
        out+= ". Nel tatro hanno luogo i seguenti spettacoli: ";
        for(int i = 0; i < spettacoli.size(); i++){
            out+= "\n" + (spettacoli.get(i)).toString();
        }
        return out;
    }
}