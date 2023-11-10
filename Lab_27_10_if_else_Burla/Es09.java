/**
 * Letto il voto di una verifica, dire se esso è sufficiente, insufficiente, più che sufficiente.
 * @author Thomas Burla
 * @version 1.0
*/
import javax.swing.*;
public class Es09{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double voto;
        //inizializzazione delle variabili
        voto = Double.parseDouble(JOptionPane.showInputDialog("Inserire il voto per stabilire se è insuffieciente, sufficiente o più che sufficiente."));
        //elaborazione
        if(voto < 6){
            System.out.println("Il voto non è sufficiente.");
        }else if(voto < 8){
            System.out.println("Il voto è sufficiente.");
        }else{
            System.out.println("Il voto inserito è più che sufficiente.");
        }
    }
}