/**
 * Scrivi un programma Java che conta e visualizza quante parole ci sono in un file di testo.
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class Es4{
    public static void main(String args[]){
        //dichiarazione variabili e inizializzazione
        String pathname;
        String riga[];
        int nWord = 0;;
        //leggo e controllo nome file
        do{
            pathname = JOptionPane.showInputDialog("Inserire nome file");
            if((pathname.equals("")) || (pathname.equals(" "))){
                JOptionPane.showMessageDialog(null, "ERRORE stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((pathname.equals("")) || (pathname.equals(" ")));
        try{
            //preparo lettura
            File f = new File(pathname);
            FileReader fr = new FileReader(f);
            Scanner leggo = new Scanner(fr);
            while(leggo.hasNextLine()){
                riga = (leggo.nextLine()).split(" "); 
                nWord += riga.length;
            }
            //output
            JOptionPane.showMessageDialog(null, "Nel file ci sono: " + nWord + " parole");
            //chiudo flusso
            leggo.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRORE di I/O", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}