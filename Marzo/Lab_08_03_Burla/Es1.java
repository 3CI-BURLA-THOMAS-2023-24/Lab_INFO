/**
 * Leggere un array e un valore k, ordinare l'array, dire se k è presente nell'array
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichiarazione variabili
        double k, v[], t;
        int l;
        boolean ordinato = false, trovato = false;
        //leggo e controllo l
        do{
            l =  Integer.parseInt(JOptionPane.showInputDialog("Quanti valori deve contenere l'array?"));
            if(l <= 1){
                JOptionPane.showMessageDialog(null, "ERRORE! Un vettore deve contenere almeno due valori");
            }
        }while(l <= 1);
        //alloco vettore
        v = new double[l];
        //riempio vettore
        for(int i = 0; i < l; i++){
            v[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore double"));
        }
        //ordino array
        while(ordinato == false){
            ordinato = true;
            for(int i = 0; i < (l - 1); i++){
                if(v[i] > v[i + 1]){
                    t = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = t;
                    ordinato = false;
                }
            }
        }
        //chiedo valore da cercare
        k = Double.parseDouble(JOptionPane.showInputDialog("Quale valore vuoi cercare nel vettore?"));
        //cerco valore
        for(int i = 0; (i < l) && trovato == false; i++){
            //controllo se i/2 è uguale al valore da cercare
            if(v[l / 2] == k){
                trovato = true;
            }else if(v[l / 2] < k){
                //se il valore da cercare è minore del valore in posizione i/2, cerco nell'intervallo inferiore
                for(int a = 0; (a < (i / 2)) && trovato == false; a++){
                    if(v[a] == k){
                        trovato = true;
                    }
                }
            }else{
                //se il valore da cercare è maggiore del valore in posizione i/2, cerco nell'intervallo superiore
                for(int a = (i / 2) + 1; (a < l) && trovato == false; a++){
                    if(v[a] == k){
                        trovato = true;
                    }
                }
            }
        }
        //output
        if(trovato == true){
            JOptionPane.showMessageDialog(null, "Il valore è presente");
        }else{
            JOptionPane.showMessageDialog(null, "Il valore NON è presente");
        }
    }
}