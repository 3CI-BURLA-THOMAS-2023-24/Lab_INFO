/**
 * Leggere due vettori di interi e creare il vettore somma.
    es-->

    v1 -> 2 3 4 5 6

    v2 -> 1 2 1 2 3

    vs -> 3 5 5 7 9
 *
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es2 {
    public static void main(String args[]){
        //dichiarazione variabili
        int v1[], v2[], vs[], l1, l2, ls, counter, a, b;
        //inizializzazione variabili
        counter = 0;
        //leggo dimensione vettore 1
        do{
            l1 = Integer.parseInt(JOptionPane.showInputDialog("Il seguente programma legge due vettori e poi restitutisce il vettore somma. Quanto deve essere grande il primo vettore?"));
            //messaggio di errore
            if(l1 <= 0){
                JOptionPane.showMessageDialog(null, "ERRORE! Un vettore non può avere dimensione negativa o nulla");
            }
        }while(l1 <= 0);
        //leggo dimensione vettore 2
        do{
            l2 = Integer.parseInt(JOptionPane.showInputDialog("Quanto deve essere grande il secondo vettore?"));
            //messaggio di errore
            if(l2 <= 0){
                JOptionPane.showMessageDialog(null, "ERRORE! Un vettore non può avere dimensione negativa o nulla");
            }
        }while(l2 <= 0);
        //alloco i tre vettori, assegnandovi la dimensione del vettore massimo dei due di input e salvando però in due variabili differenti la dimensione effettiva inserita dall'utente in modo tale da lasciare vuoti gli slot in più aggiunti solo per fare il calcolo finale
        a = l1;
        b = l2;
        if(l1 >= l2){
            l2 = l1;
            ls = l1;
        }else{
            l1 = l2;
            ls = l2;
        }
        v1 = new int[l1];
        v2 = new int[l2];
        vs = new int[ls];
        //leggo vettore1
        for(int i = 0; i < a; i++){
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore per riempire il vettore 1"));
        }
        //leggo vettore2
        for(int i = 0; i < b; i++){
            v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore per riempire il vettore 2"));
        }
        //preparo vettore somma e output
        System.out.println("Il vettore somma contiene i seguenti valori: ");
        do{
            vs[counter] = v1[counter] + v2[counter];
            System.out.println(+vs[counter]);
            counter++;
        }while(counter < ls);
    }
}