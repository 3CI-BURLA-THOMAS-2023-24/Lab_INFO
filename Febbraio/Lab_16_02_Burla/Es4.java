/**
 * Ordinare un vettore letto precedentemente con gli algoritmi proposti in laboratorio.
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es4{
    public static void main(String args[]){
        //dichiarazione variabili
        double v[], t;
        int n;
        boolean ordinato = false;
        //leggo la lunghezza del vettore e la controllo
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Quanti valori deve contenere il vettore?"));
            if(n <= 1){
                JOptionPane.showMessageDialog(null, "ERRORE! Un vettore deve contenere almeno due valori");
            }
        }while(n <= 1);
        //alloco vettore
        v = new double[n];
        //riempio vettore
        for(int i = 0; i < n; i++){
            v[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore double nel vettore"));
        }
        //svolgo finchè il vettore non è ordinato
        while(ordinato == false){
            //se non scambio valori, il vettore è ordinato
            ordinato = true;
            for(int i = 0; i < (n - 1); i++){
                if(v[i] > v[i + 1]){
                    //scambio
                    t = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = t;
                    //se effettuo uno scambio, il vettore NON è ordinato
                    ordinato = false;
                }
            }
        }
        //output
        System.out.println("Ecco il vettore ordinato: ");
        for(int i = 0; i < n; i++){
            System.out.println(v[i]);
        }
    }
}