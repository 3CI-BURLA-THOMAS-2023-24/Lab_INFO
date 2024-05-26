/**
 * classe Spettacolo
    -nomeSpettacolo
    -durata
    -metodi opportuni

    Modificare le seguenti classi:
    Spettacolo aggiungere un arrayList di attori
 * 
 * @author Thomas Burla
 * @version 2.0
 */
import java.util.*;
public class Spettacolo {
    //variabili d'istanza
    private String nomeSpettacolo;
    private double durata;
    private String categoria;
    private ArrayList<Attore> attori;
    //costruttore senza parametri
    public Spettacolo(){
        this.nomeSpettacolo = "-";
        this.durata = 0.0;
        this.categoria = "-";
        this.attori = null;
    }
    //costruttore con parametri controllati
    public Spettacolo(String nomeSpettacolo, double durata, String categoria, Attore attore){
        //nomeSpettacolo
        if(nomeSpettacolo != null){
            this.nomeSpettacolo = nomeSpettacolo;
        }else{
            this.nomeSpettacolo = "-";
        }
        //durata
        if(durata > 0.0){
            this.durata = durata;
        }else{
            this.durata = 0.0;
        }
        //categoria
        if(categoria != null){
            this.categoria = categoria;
        }else{
            this.categoria = "-";
        }
        //attori
        if(attore != null){
            (this.attori).add(attore);
        }else{
            this.attori = null;
        }
    }
    //set nomeSpettacolo
    public void setNomeSpettacolo(String nome){
        if(nome != null){
            this.nomeSpettacolo = nome;
        }
    }
    //get nomeSpettacolo
    public String getNomeSpettacolo(){
        return this.nomeSpettacolo;
    }
    //set durata
    public void setDurata(double durata){
        if(durata > 0.0){
            this.durata = durata;
        }
    }
    //get durata
    public double getDurata(){
        return this.durata;
    }
    //set categoria
    public void setCategoria(String categoria){
        if(categoria != null){
            this.categoria = categoria;
        }
    }
    //get categoria
    public String getCategoria(){
        return this.categoria;
    }
    //set attore
    public void setAttore(Attore attore){
        if(attore != null){
            (this.attori).add(attore);
        }
    }
    //get attore
    public String getAttore(String nome, String cognome){
        int i = 0;
        boolean trovato = false;
        Attore attore = null;
        while((i < (this.attori.size())) && (trovato == false)){
            attore = this.attori.get(i);
            if((attore.getNome().equalsIgnoreCase(nome)) && (attore.getCognome().equalsIgnoreCase(cognome))){
                trovato = true;
            }
            i++;
        }
        if(trovato == true){
            return attore.toString();
        }
        return "Nessun attore corrispondente alle informazioni fornite";
    }
    //toString
    public String toString(){
        String out = "";
        out+= "Il nome dello spettacolo è: " + this.nomeSpettacolo;
        out+= ".\nLa durata dello spettacolo è: " + this.durata;
        out+= ".\nLa categoria a cui appartiene lo spettacolo è: " + this.categoria;
        out+= ". A questo spettacolo appartengono gli attori: ";
        for(int i = 0; i < attori.size(); i++){
            out+= "\n" + (attori.get(i)).toString();
        }
        return out;
    }
}
