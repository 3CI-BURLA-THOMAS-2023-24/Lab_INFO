/**
 * classe Spettacolo
    -nomeSpettacolo
    -durata
    -metodi opportuni
 * 
 * @author Thomas Burla
 * @version 1.0
 */
public class Spettacolo {
    //variabili d'istanza
    private String nomeSpettacolo;
    private double durata;
    private String categoria;
    //costruttore senza parametri
    public Spettacolo(){
        this.nomeSpettacolo = "-";
        this.durata = 0.0;
        this.categoria = "-";
    }
    //costruttore con parametri controllati
    public Spettacolo(String nomeSpettacolo, double durata, String categoria){
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
    //toString
    public String toString(){
        String out = "";
        out+= "Il nome dello spettacolo è: " + this.nomeSpettacolo;
        out+= ".\nLa durata dello spettacolo è: " + this.durata;
        out+= ".\nLa categoria a cui appartiene lo spettacolo è: " + this.categoria;
        return out;
    }
}
