/**
 * Scrivi un programma Java che legge da un file di testo (csv) una matrice di interi e calcola la somma di ogni riga.
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class Es6{
    public static void main(String args[]){
        //dichiarazione variabili e inizializzazione
        String pathname;
        String delimiter;
        String riga[];
        ArrayList <Integer> somme = new ArrayList <Integer> ();
        int line = 0;
        int somma = 0;
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
                somma = 0;
                //divido colonne
                riga = (leggo.nextLine()).split(delimiter);
                //calcolo somma
                for(int i = 0; i < riga.length; i++){
                    somma += Integer.parseInt(riga[i]);
                }
                somme.add(somma);
            }
            //output
            for(int i = 0; i < somme.size(); i++){
                System.out.println(somme.get(i));
            }
            leggo.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRORE di I/O", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}