/**
 *  Realizzare un programma che memorizzi in due stringhe i nomi di due squadre di calcio
         Creare due array, uno per squadra, con i goal delle prime 5 partite di ogni squadra
    Il programma in output mostrerà:
        • La squadra vincente o il pareggio;
        • Il numero di goal totali segnati da entrambe le squadre
    Es:
    s1 : ”Verona” 
    s2 : ”Chievo”
    vs1 : 2, 0, 1, 1, 0
    vs2 : 1, 1, 0, 0, 1
    Output : “Vince il Verona con 4 goal” Punti Chievo: 3

    Esercizio squadra di calcio 2 pt
 *
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class SquadraCalcio{
    public static void main(String args[]){
        //dichiarazione variabili
        String s1, s2;
        int v1[], v2[], somma1, somma2;
        //inizializzazione variabili
        somma1 = 0;
        somma2 = 0;
        //leggo e controllo il nome della squadra 1
        do{
            s1 = JOptionPane.showInputDialog("Inserire il nome della prima squadra di calcio");
            if((s1.equals("")) || (s1.charAt(0) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while((s1.equals("")) || (s1.charAt(0) == ' '));
        //leggo e controllo il nome della squadra 2
        do{
            s2 = JOptionPane.showInputDialog("Inserire il nome della seconda squadra di calcio");
            if((s2.equals("")) || (s2.charAt(0) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while((s2.equals("")) || (s2.charAt(0) == ' '));
        //alloco vettore 1
        v1 = new int[5];
        //alloco vettore 2
        v2 = new int[5];
        //leggo vettore 1
        for(int i = 0; i < 5; i++){
            do{
                v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire i goal della squadra 1"));
                if(v1[i] < 0){
                    JOptionPane.showMessageDialog(null, "ERRORE di input, numero negativo. Reinserire il valore");
                }
            }while(v1[i] < 0);
            JOptionPane.showMessageDialog(null, "Valore memorizzato");
            somma1+= v1[i];
        }
        //leggo vettore 2
        for(int i = 0; i < 5; i++){
            do{
                v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire i goal della squadra 2"));
                if(v2[i] < 0){
                    JOptionPane.showMessageDialog(null, "ERRORE di input, numero negativo. Reinserire il valore");
                }
            }while(v2[i] < 0);
            JOptionPane.showMessageDialog(null, "Valore memorizzato");
            somma2+= v2[i];
        }
        //output risultati
        if(somma1 == somma2){
            System.out.println("PAREGGIO! \n Punteggio "+s1+" --> "+somma1+"\n Punteggio "+s2+" --> "+somma2);
        }else if(somma1 > somma2){
            System.out.println("VINCE "+s1+ "\n Punteggio "+s1+" --> "+somma1+"\n Punteggio "+s2+" --> "+somma2);
        }else{
            System.out.println("VINCE "+s2+ "\n Punteggio "+s2+" --> "+somma2+"\n Punteggio "+s1+" --> "+somma1);
        }
    }
}