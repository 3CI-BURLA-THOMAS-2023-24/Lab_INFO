/**
 * Due numeri sono amici quando ciascuno di essi è uguale alla somma dei divisori propri dell'altro. Leggere due numeri e dire se sono amici. Verificare che 220 e 284 sono amici.
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.*;
public class Es05{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int x, y, s, i;
        //inizializzazione delle variabili
        s = 0;
        do{
            x = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero intero e positivo"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero intero e positivo per verificare se è amico dell'altro"));
        }while((x <= 0) || (y <= 0));
       //elaborazione
        for(i = 1; i < y; i++){
            if((y % i) == 0){
                s = s + i;
            }
        }
        if(s == x){
            JOptionPane.showMessageDialog(null, "I due numeri sono amici");
        }else{
            JOptionPane.showMessageDialog(null, "I due numeri NON sono amici");
        }
    }
}