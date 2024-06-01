/**
 *  Fare in modo che il cliente possa acquistare uno o più biglietti
    Creare la classe Main che crea un teatro, tre spettacoli con gli attori e gestisce le prenotazioni 
    dei biglietti ad un determinato spettacolo, calcolando il costo tenendo conto delle riduzione per i bambini 
    fino a 12 anni e degli adulti con più di 65 anni
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;
public class Test {
    public static void main(String args[]){
        try{
            //dichiarazione e inizializzazione variabili
            //variabile usata per la JOptionPane(riquadro di scelta si/no)
            int ripeti = 0;
            //nome cliente
            String nome = "";
            //cognome cliente
            String cognome = "";
            //email cliente
            String email = "";
            //anni cliente
            int anni = 0;
            //prezzo del biglietto che desidera comprare il cliente
            double prezzo = 0;
            //tipo di spettacolo al quale il cliente vuole partecipare
            String categoria = "";
            //numero di posto(al momento il cliente sceglie quello che vuole; in aggiornamento futuro si prevede un controllo e un'assegnazione a carico del teatro in funzione del prezzo)
            int numero_posto = 0;
            //importo totale prenotazione
            double totale = 0.0;
            //ArrayList delle prenotazioni
            ArrayList <Prenotazione> prenotazioni = new ArrayList <Prenotazione> ();
            //preparo file da cui leggere le categorie degli spettacoli, nelle varie righe
            File f = new File("categoria.csv");
            FileReader fr = new FileReader(f);
            Scanner leggoCategorie = new Scanner(fr);
            String categorie[] = (leggoCategorie.nextLine()).split(";");
            leggoCategorie.close();
            boolean esisteCategoria;
            int c;
            //creo elenco categorie da visualizzare
            String messaggioCategorie = "Inserire il tipo di spettacolo al quale si vuole partecipare. Scegliere tra i seguenti: ";
            for(int i = 0; i < categorie.length; i++){
                messaggioCategorie += "\n" + categorie[i];
            }
            //preparo file da cui leggere i prezzi e i relativi posti
            File f2 =  new File("costoBiglietti.csv");
            FileReader fr2 = new FileReader(f2);
            Scanner leggoPrezzi = new Scanner (fr2);
            boolean esistePrezzo;
            int p;
            //creo array da utilizzare per salvare il prezzo dei posti (come String)il cui numero è compreso in un certo intervallo
            String postiStr[];
            //array in cui salvo i valori di postiStr[] convertiti in double
            double posti[];
            //creo arraylist su cui salvare i prezzi e i relativi posti, memorizzando un array per ogni riga
            ArrayList <double[]> prezziPosti = new ArrayList <double[]>();
            //ciclo per leggere le righe del file
            while(leggoPrezzi.hasNextLine()){
                //salvo in un array di String i valori letti (i primi due indicano gli estremi dell'intervallo di posti, il terzo il loro costo)
                postiStr = (leggoPrezzi.nextLine()).split(";");
                //alloco un vettore di double di dimensioni uguali al vettore di String da cui convertire
                posti = new double[postiStr.length];
                //converto in double i valori dell'array
                for(int i = 0; i < postiStr.length; i++){
                    posti[i] = Double.parseDouble(postiStr[i]);
                }
                //salvo l'array di double nell'arraylist
                prezziPosti.add(posti);
            }
            leggoPrezzi.close();
            //preparo messaggio da visualizzare
            String messaggioPrezzo = "Inserire il prezzo del biglietto che si vuole comprare, in relazione al posto, scegliendo tra i seguenti: ";
            for(int a = 0; a < prezziPosti.size(); a++){
                //per l'ultima fascia di prezzo, non considero l'estremo superiore dell'intervallo (che arbitrariamente è 0)
                if(a == prezziPosti.size() - 1){
                    messaggioPrezzo += "\nPosti--> " + (int)((prezziPosti.get(a))[0]) + "+" + "; Costo--> " + (prezziPosti.get(a))[2] + "€";
                }else{
                    messaggioPrezzo += "\nPosti--> " + (int)((prezziPosti.get(a))[0]) + "-" + (int)(prezziPosti.get(a))[1] + "; Costo--> " + (prezziPosti.get(a))[2] + "€";
                }
            }
            messaggioPrezzo += "\nTenere a mente che per i minori di 12 anni e per gli over 65 verrà applicato in automatico uno sconto del 50% rispetto all'importo indicato";
            //creo teatro
            Teatro marconiVR = new Teatro("ITIS Marconi", "Verona", 1800);
            //creo tre spettacoli e li aggiungo al teatro
            Spettacolo jazz = new Spettacolo("Jazz", 90, "Musica");
            marconiVR.setSpettacolo(jazz);
            Spettacolo commedia = new Spettacolo("Divina Commedia", 60, "Letteratura");
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
            //ciclo per salvare le prenotazioni su una arraylist
            do{
                Prenotazione prenotazione = new Prenotazione();
                //ciclo per clienti e biglietti
                do{
                    //controllo nome
                    do{
                        nome = JOptionPane.showInputDialog("Inserire il nome del cliente");
                        if((nome.equals("")) || (nome.equals(" "))){
                            JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                        }
                    }while((nome.equals("")) || (nome.equals(" ")));
                    //controllo cognome
                    do{
                        cognome = JOptionPane.showInputDialog("Inserire il cognome del cliente");
                        if((cognome.equals("")) || (cognome.equals(" "))){
                            JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                        }
                    }while((cognome.equals("")) || (cognome.equals(" ")));
                    //controllo email
                    do{
                        email = JOptionPane.showInputDialog("Inserire l'email del cliente");
                        if((email.equals("")) || (email.equals(" "))){
                            JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                        }
                    }while((email.equals("")) || (email.equals(" ")));
                    //controllo anni
                    do{
                        anni = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'età del cliente"));
                        if(anni <= 0){
                            JOptionPane.showMessageDialog(null, "ERRORE! Valore non valido", "Errore", JOptionPane.ERROR_MESSAGE);
                        }
                    }while(anni <= 0);
                    //creo oggetto di classe Cliente (uno per ogni persona)
                    Cliente cliente = new Cliente(nome, cognome, email, anni);
                    //salvo il cliente nella prenotazione
                    prenotazione.setCliente(cliente);
                    //faccio acquistare i biglietti dei diversi spettacoli al cliente
                    do{
                        //controllo prezzo del biglietto
                        esistePrezzo = false;
                        do{
                            prezzo = Double.parseDouble(JOptionPane.showInputDialog(messaggioPrezzo));
                            //verifico che l'utente abbia inserito un prezzo esistente tra quelli proposti
                            p = 0;
                            while((p < prezziPosti.size()) && (esistePrezzo == false)){
                                if((prezziPosti.get(p))[2] == prezzo){
                                    esistePrezzo = true;
                                }
                                p++;
                            }
                            if(esistePrezzo == false){
                                JOptionPane.showMessageDialog(null, "Nessun biglietto corrisponde al prezzo indicato!", "Errore", JOptionPane.ERROR_MESSAGE);
                            }else{
                                //applico uno sconto del 50% sul prezzo indicato dall'utente se il titolare ha meno di 12 anni o più di 65
                                if((cliente.getAnni() < 12) || (cliente.getAnni() > 65)){
                                    prezzo/= 2;
                                }
                            }
                        }while(esistePrezzo == false);
                        //controllo numero_posto del biglietto
                        do{
                            numero_posto = Integer.parseInt(JOptionPane.showInputDialog("In quale posto si vuole sedere?"));
                            if(numero_posto <= 0){
                                JOptionPane.showMessageDialog(null, "ERRORE! Valore non valido", "Errore", JOptionPane.ERROR_MESSAGE);
                            }
                        }while(numero_posto <= 0);
                        //controllo tipo di spettacolo
                        esisteCategoria = false;
                        do{
                            categoria = JOptionPane.showInputDialog(messaggioCategorie);
                            //verifico che la stringa non sia vuota
                            if((categoria.equals("")) || (categoria.equals(" "))){
                                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                            }
                            //verifico che nell'array di categorie vi sia quella specificata dall'utente
                            c = 0;
                            while((c < categorie.length) && (esisteCategoria == false)){
                                if(categorie[c].equalsIgnoreCase(categoria)){
                                    esisteCategoria = true;
                                }
                                c++;
                            }
                            if(esisteCategoria == false){
                                JOptionPane.showMessageDialog(null, "La categoria specificata non esiste!", "Errore", JOptionPane.ERROR_MESSAGE);
                            }
                        }while((categoria.equals("")) || (categoria.equals(" ")) || (esisteCategoria == false));
                        //creo l'oggetto di classe Biglietto
                        Biglietto biglietto = new Biglietto(prezzo, numero_posto, cliente, categoria);
                        //associo il biglietto sia alla prenotazione che all'utente
                        prenotazione.setBiglietto(biglietto);
                        cliente.setBiglietto(biglietto);
                        //chiedo se vi sono altri biglietti da acquistare con lo stesso titolare
                        ripeti = JOptionPane.showConfirmDialog(null, "Vuoi acquistare altri biglietti?", "Acquista", JOptionPane.YES_NO_OPTION);
                    }while(ripeti == JOptionPane.YES_OPTION);
                    //chiedo se per la prenotazione vi sono altri clienti
                    ripeti = JOptionPane.showConfirmDialog(null, "Per questa prenotazione, vi sono altri clienti?",  "Clienti", JOptionPane.YES_NO_OPTION);
                }while(ripeti == JOptionPane.YES_OPTION);
                //calcolo l'importo totale della prenotazione
                for(int i = 0; i < prenotazione.numeroBiglietti(); i++){
                    totale += (prenotazione.getBiglietto(i)).getPrezzo();
                }
                //visualizzo importo
                JOptionPane.showMessageDialog(null, "L'importo totale della prenotazione è di " + totale + "€", "Importo totale", JOptionPane.WARNING_MESSAGE);
                //chiedo se vi sono altre prenotazioni
                ripeti = JOptionPane.showConfirmDialog(null, "Vi sono altre prenotazioni da effettuare?" , "Prenota", JOptionPane.YES_NO_OPTION);
            }while(ripeti == JOptionPane.YES_OPTION);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRORE di I/O", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}