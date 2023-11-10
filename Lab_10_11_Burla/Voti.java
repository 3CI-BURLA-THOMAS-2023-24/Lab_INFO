
/**
 * Leggere n voti e calcolare la media, nota bene: n>3 e n<20; voto è compreso tra 3 e 10. Visualizzare la media e se l'alunno è promosso o bocciato.
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.*;
public class Voti{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int n, i;
        double voto, media;
        //inizializzazione variabili
        media = 0;
        //controllo dell'input
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Inserire la quantità di voti che si vuole archiviare."));
        }while((n < 3) || (n > 20));
    }
}