/**
 * Leggere un vettore di l valori interi, vedi esercizio 1, leggere un valore intero k e dire se il valore è presente nel vettore.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es3 {
    public static void main(String args[]){
        //dichiarazione delle variabili e inizializzazione
        int l, v[], k, counter = 0;
        boolean presente = false;
        boolean ripetuto;
        //leggo l
        do{
            l = Integer.parseInt(JOptionPane.showInputDialog("Quanti valori vuoi inserire?"));
            if(l <= 0){
                JOptionPane.showMessageDialog(null, "ERRORE! Non puoi inserire un numero di valori negativo o nullo");
            }
        }while(l <= 0);
        //allocazione array
        v = new int[l];
        //lettura valori array
        for(int i = 0; i < l; i++){
            do{
                ripetuto = false;
                v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore intero"));
                //controllo che non venga inserito un valore già presente
                for(int j = 0; j < i; j++){
                    if(v[i] == v[j]){
                        ripetuto = true;
                    }
                }
                if(ripetuto == true){
                    JOptionPane.showMessageDialog(null, "ERRORE! Questo valore è già stato inserito");
                }
            }while(ripetuto == true);
        }
        //input valore di controllo
        k = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore per verificare se è presente nell'array"));
        //verifico se il valore di controllo si trova nell'array
        while((presente == false) && (counter < l)){
            if(k == v[counter]){
                presente = true;
            }
            counter++;
        }
        //output
        if(presente == true){
            JOptionPane.showMessageDialog(null, "Il valore è presente nel vettore");
        }else{
            JOptionPane.showMessageDialog(null, "Il valore NON è presente nel vettore");
        }
    }
}