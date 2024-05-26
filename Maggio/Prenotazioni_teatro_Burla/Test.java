/**
 *  Fare in modo che il cliente possa acquistare uno o più biglietti
    Creare la classe Main che crea un teatro, tre spettacoli con gli attori e gestisce le prenotazioni 
    dei biglietti ad un determinato spettacolo, calcolando il costo tenendo conto delle riduzione per i bambini 
    fino a 12 anni e degli adulti con più di 65 anni
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Test {
    public static void main(String args[]){
        //creo teatro
        Teatro ristoriVR = new Teatro("Teatro Ristori", "Verona", 496);
        //creo i tre spettacoli 
        Spettacolo jazz = new Spettacolo("Jazz", 90, "Musica");
        Spettacolo danza = new Spettacolo("Danza", 60, "Musica");
        Spettacolo serateAutore = new Spettacolo("Serate d'autore", 180, "Incontri");
        //autori spettacolo jazz
        Attore patitucci = new Attore("John", "Patitucci", 65, "Bassista");
        Attore calderazzo = new Attore("Joseph Dominik", "Calderazzo", 59, "Pianista");
        Attore weckl = new Attore("Dave", "Weckl", 64, "Batterista");
    }
}
