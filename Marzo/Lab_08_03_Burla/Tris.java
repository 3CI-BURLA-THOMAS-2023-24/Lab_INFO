/**
 * 3) Implementare il gioco del Tris
 * 
 * @author Thomas Burla 
 * @version 2.1
 */
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class Tris{
    public static void main(String args[]){
        //dichiarazione variabili
        int n_riga, n_colonna, start, counter, k = 1, player = 0, salva;
        char tabellone[][];
        boolean win = false;
        String nome = "";
        //inizializzazione variabili
        
        //estrazione di chi inizia
        Random generator = new Random();
        start = 1 + generator.nextInt(2);
        JOptionPane.showMessageDialog(null, "Inizia il giocatore "+start);
        //assegno ad un contatore il valore di start in modo tale che, quando sia il turno del giocatore 1, il counter abbia un numero dispari, in caso contrario pari
        counter = start;
        //dichiaro e alloco matrice
        tabellone = new char[3][3];
        //inizializzo le celle della matrice
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                tabellone[r][c] = '-';
            }
        }
        do{
            //leggo in input la posizione di dove si vuole posizionare il segno
            do{
                n_riga = Integer.parseInt(JOptionPane.showInputDialog("In quale riga si vuole posizionare il proprio segno? Contare le righe da 1 a 3."));
                n_colonna = Integer.parseInt(JOptionPane.showInputDialog("In quale colonna della suddetta riga si vuole inserire il segno? Contare le colonne da 1 a 3."));
                //caso in cui la cella sia già occupata
                if((n_riga > 3) || (n_riga < 1) || (n_colonna > 3) || (n_colonna < 1)){
                    JOptionPane.showMessageDialog(null, "Cella inesistente" , "Errore" , JOptionPane.ERROR_MESSAGE);
                    //caso in cui la cella NON esista
                }else if(tabellone[n_riga - 1][n_colonna - 1] != '-'){
                    JOptionPane.showMessageDialog(null, "Cella già occupata, sceglierne un'altra" , "Errore" , JOptionPane.ERROR_MESSAGE);
                }
            }while((n_riga > 3) || (n_riga < 1) || (n_colonna > 3) || (n_colonna < 1) || (tabellone[n_riga - 1][n_colonna - 1] != '-'));
            //in base a chi spetta posizionare, inserisco il X o O nella cella indicata precedentemente
            if((counter % 2) != 0){
                tabellone[n_riga - 1][n_colonna - 1] = 'X';
            }else{
                tabellone[n_riga - 1][n_colonna - 1] = 'O';
            }
            //controllo se qualcuno vince, però servono almeno 5 segni inseriti
            if(k >= 5){
                //controllo l'uguaglianza tra colonne
                for(int c = 0; c < 3; c++){
                    if((tabellone [0][c] == tabellone [1][c]) && (tabellone [1][c] == tabellone [2][c])){
                    win = true;
                    //controllo chi ha vinto
                    if(tabellone [0][c] == 'X'){
                        player = 1;
                    }else{
                        player = 2;
                    }
                    }
                }
                //controllo uguaglianza tra righe
                for(int r = 0; r < 3; r++){
                    if((tabellone [r][0] == tabellone [r][1]) && (tabellone [r][1] == tabellone [r][2])){
                        win = true;
                        if(tabellone [r][0] == 'X'){
                            player = 1;
                        }else{
                            player = 2;
                        }
                    }
                }
                //controllo uguaglianza tra diagonali
                if(((tabellone[0][0] == tabellone [1][1]) && (tabellone [1][1] == tabellone[2][2]))){
                    win = true;
                    if(tabellone [0][0] == 'X'){
                        player = 1;
                    }else{
                        player = 2;
                    }
                }else if(((tabellone[2][0] == tabellone [1][1]) && (tabellone [1][1] == tabellone[0][2]))){
                    win = true;
                    if(tabellone [2][0] == 'X'){
                        player = 1;
                    }else{
                        player = 2;
                    }
                }
            }
            //conto a quante celle ho scritto
            k++;
            counter++;
            //stampo matrice
            for(int r = 0; r < 3; r++){
                for(int c = 0; c < 3; c++){
                    System.out.print(tabellone[r][c]);
                }
                System.out.println("");
            }
            System.out.println("");
        }while((win == false) && (k <= 9));
        //output del vincitore
        if(win == true){
            JOptionPane.showMessageDialog(null, "Vince il giocatore "+player);
        }else{
            JOptionPane.showMessageDialog(null, "Nessun vincitore :(");
        }
        //chiedo all'utente se si vuole salvare in un file di testo il vincitore della prtita
        salva = JOptionPane.showConfirmDialog(null, "Vuoi salvare l'esito della partita in un file di testo?", "Conferma", JOptionPane.YES_NO_CANCEL_OPTION);
        //salvataggio su file del nome del vincitore
        if(salva == JOptionPane.YES_OPTION){
            try{
                //chiedo il nome del file su cui salvare
                nome = JOptionPane.showInputDialog("Inserire il nome del file con la relativa estensione su cui salvare il nome del vincitore. Inserire il file nello stesso path della suddetta classe");
                File f = new File(nome);
                //se il file NON esiste, lo creo
                if(f.createNewFile()){
                    JOptionPane.showMessageDialog(null, "NON esiste alcun file con questo nome. Sto generando un nuovo file...", "Attenzione", JOptionPane.WARNING_MESSAGE);
                }
                FileWriter fr = new FileWriter(f, true);
                PrintWriter out = new PrintWriter(fr);
                //scrivo su file
                if(win == true){
                    out.println("Vince il giocatore "+player);
                }else{
                    out.println("Nessun vincitore :(");
                }
                //chiudo stream
                out.close();
                JOptionPane.showMessageDialog(null, "Esito salvato!");
                //gestisco errori
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERRORE! Risultato NON salvato", "Errore" , JOptionPane.ERROR_MESSAGE);
            }
            //nome del vincitore NON salvato
        }else if(salva == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "L'esito NON è stato salvato");
            //operazione annullata
        }else{
            JOptionPane.showMessageDialog(null, "Operazione annullata");
        }
    }
}