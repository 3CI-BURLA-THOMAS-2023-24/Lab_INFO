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
            n = Integer.parseInt(JOptionPane.showInputDialog("Inserire la quantità di voti che si vuole archiviare, almeno 4 e massimo 19."));
        }while((n <= 3) || (n >= 20));
        //elaborazione
        for(i = 0; i < n; i++){
            do{
                voto = Double.parseDouble(JOptionPane.showInputDialog("Inserire il voto."));
                if((voto < 3) || (voto > 10)){
                    JOptionPane.showMessageDialog(null, "Voto non valido, non è stato inserito!");
                }
            }while((voto < 3) || (voto > 10));
            media = media + voto;
        }
        media = media / n;
        //output
        if(media < 6){
            JOptionPane.showMessageDialog(null,"L'alunno è bocciato con media: "+media);
        }else{
            JOptionPane.showMessageDialog(null,"L'alunno è promosso con media: "+media);
        }
    }
}