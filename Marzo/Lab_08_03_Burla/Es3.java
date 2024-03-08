/**
 * 3) Implementare il gioco del Tris
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
import java.util.*;
public class Es3{
    public static void main(String args[]){
        //dichiarazione variabili
        int n_riga, n_colonna, start, counter, k = 1, player = 0;
        char tabellone[][];
        boolean win = false;
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
                n_riga = Integer.parseInt(JOptionPane.showInputDialog("In quale riga si vuole posizionare il proprio segno?"));
                n_colonna = Integer.parseInt(JOptionPane.showInputDialog("In quale colonna della suddetta riga si vuole inserire il segno"));
                //caso in cui la cella sia già occupata
                if(tabellone[n_riga - 1][n_colonna - 1] != '-'){
                    JOptionPane.showMessageDialog(null, "Cella già occupata, sceglierne un'altra");
                    //caso in cui la cella NON esista
                }else if((n_riga > 3) || (n_riga < 1) || (n_colonna > 3) || (n_colonna < 1)){
                    JOptionPane.showMessageDialog(null, "Cella inesistente");
                }
            }while((n_riga > 3) || (n_riga < 1) || (n_colonna > 3) || (n_colonna < 1) || (tabellone[n_riga - 1][n_colonna - 1] != '-'));
            //in base a chi spetta posizionare, inserisco il X o O nella cella indicata precedentemente
            if((counter % 2) != 0){
                tabellone[n_riga - 1][n_colonna - 1] = 'X';
            }else{
                tabellone[n_riga - 1][n_colonna - 1] = 'O';
            }
            //controllo se qualcuno vince, però servono almeno 5 segni inseriti
            while((k >= 5) || (win = false)){
                //controllo l'uguaglianza tra colonne
                for(int c = 0; c < 3; c++){
                    if((tabellone [0][c] == tabellone [1][c]) && (tabellone [1][c] == tabellone [2][c])){
                    win = true;
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
                    if(tabellone [0][0] == 'X'){
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
        JOptionPane.showMessageDialog(null, "Vince il giocatore "+player);
    }
}