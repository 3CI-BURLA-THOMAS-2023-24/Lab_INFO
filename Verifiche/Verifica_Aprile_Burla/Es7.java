/**
 * Scrivi un programma Java che legge da un file di testo una matrice e la stampa invertendo i valori nelle righe.
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class Es7{
    public static void main(String args[]){
        //dichiarazione variabili e inizializzazione
        String pathname;
        String delimiter;
        String riga[];
        ArrayList <Integer> somme = new ArrayList <Integer> ();
        String t;
        //leggo e controllo nome file
        do{
            pathname = JOptionPane.showInputDialog("Inserire nome file");
            if((pathname.equals("")) || (pathname.equals(" "))){
                JOptionPane.showMessageDialog(null, "ERRORE stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((pathname.equals("")) || (pathname.equals(" ")));
        //leggo e controllo delimiter
        do{
            delimiter = JOptionPane.showInputDialog("Inserire il delimiter usato nel file csv");
            if((delimiter.equals("")) || (delimiter.equals(" "))){
                JOptionPane.showMessageDialog(null, "ERRORE stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((delimiter.equals("")) || (delimiter.equals(" ")));
        try{
            //preparo lettura
            File f = new File(pathname);
            FileReader fr = new FileReader(f);
            Scanner leggo = new Scanner(fr);
            //leggo righe
            while(leggo.hasNextLine()){
                //divido colonne
                riga = (leggo.nextLine()).split(delimiter);
                for(int i = 0; (i < (riga.length) / 2); i++){
                    t = riga[i];
                    riga[i] = riga[(riga.length - 1) - i];
                    riga[(riga.length - 1) - i] = t;
                }
            }
            //output
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRORE di I/O", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}