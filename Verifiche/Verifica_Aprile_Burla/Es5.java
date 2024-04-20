/**
 * Scrivi un programma Java che scrive su un file di testo i primi 10 numeri dispari.
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
import java.io.*;
public class Es5{
    public static void main(String args[]){
        //dichiarazione variabili e inizializzazione
        String pathname;
        int counter = 0;
        String output = "";
        //leggo e controllo nome file
        do{
            pathname = JOptionPane.showInputDialog("Inserire nome file");
            if((pathname.equals("")) || (pathname.equals(" "))){
                JOptionPane.showMessageDialog(null, "ERRORE stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((pathname.equals("")) || (pathname.equals(" ")));
        try{
            //preparo scrittura ed eventualmente creo file
            File f = new File(pathname);
            if(f.createNewFile()){
                JOptionPane.showMessageDialog(null, "Il File NON esiste, te lo sto creando...", "Creo file", JOptionPane.WARNING_MESSAGE);
            }
            FileWriter fw = new FileWriter(f);
            PrintWriter scrivo = new PrintWriter(fw);
            for(int i = 0; counter < 10; i++){
                if((i % 2) != 0){
                    if(counter < (10 - 1)){
                        output += i + "; ";
                    }else{
                        output += i;
                    }
                    counter++;
                }
            }
            //output su file
            scrivo.println(output);
            //chiudo flusso
            scrivo.flush();
            scrivo.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRORE di I/O", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}