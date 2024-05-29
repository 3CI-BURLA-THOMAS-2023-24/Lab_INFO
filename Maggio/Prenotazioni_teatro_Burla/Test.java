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
        Teatro marconiVR = new Teatro("Teatro Ristori", "Verona", 496);
        //creo i tre spettacoli e li aggiungo al teatro
        Spettacolo jazz = new Spettacolo("Jazz", 90, "Musica");
        marconiVR.setSpettacolo(jazz);
        Spettacolo commedia = new Spettacolo("Divinaa Commedia", 60, "Letteratura");
        marconiVR.setSpettacolo(commedia);
        Spettacolo reggaeton = new Spettacolo("Reggaeton", 180, "Musica");
        marconiVR.setSpettacolo(reggaeton);
        //autori spettacolo jazz, aggiunti al rispettivo spettacolo
        Attore patitucci = new Attore("John", "Patitucci", 65, "Bassista");
        jazz.setAttore(patitucci);
        Attore calderazzo = new Attore("Joseph Dominik", "Calderazzo", 59, "Pianista");
        jazz.setAttore(calderazzo);
        Attore weckl = new Attore("Dave", "Weckl", 64, "Batterista");
        jazz.setAttore(weckl);
        //attori spettacolo commedia
        Attore dante = new Attore("Dante", "Alighieri", 35, "Protagonista");
        commedia.setAttore(dante);
        Attore virgilio = new Attore("Virgilio", "Marone", 60, "Guida");
        commedia.setAttore(virgilio);
        //attori spettacolo reggaeton
        Attore lamborghini = new Attore("Elettra", "Lamborghini", 30, "Cantante");
        reggaeton.setAttore(lamborghini);

    }
}
