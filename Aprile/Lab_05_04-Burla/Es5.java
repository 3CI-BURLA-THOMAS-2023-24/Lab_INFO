/**
 * Leggere una matrice n x m di voti, leggere un array di n cognomi ad ogni cognome dell'array corrisponde una riga della matrice. Dire quale alunno ha la media dei voi più alta
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es5 {
    public static void main(String args[]){
        //dichiarazione variabili
        double voti[][], medie[], somma, piuAlta;
        int nVoti[], nCognomi, max;
        String cognomi[], migliore;
        //inizializzazione variabili
        max = 0;
        migliore = "nessuno";
        piuAlta = 0.0;
        //leggo e controllo nStudenti
        do{
            nCognomi = Integer.parseInt(JOptionPane.showInputDialog("Quanti studenti sono da registrare?"));
            if(nCognomi < 1){
                JOptionPane.showMessageDialog(null, "ERRORE di input", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while(nCognomi < 1);
        //alloco array per salvare i cognomi e il numero di voti per ogni studente
        cognomi = new String[nCognomi];
        nVoti = new int[nCognomi];
        //leggo nomi degli studenti e il loro corrispondente nuemro di voti, controllando il tutto
        for(int i = 0; i < nCognomi; i++){
            //leggo e controllo nome
            do{
                cognomi[i] = JOptionPane.showInputDialog("Inserire il cognome dello studente");
                if((cognomi[i].equals("")) || (cognomi[i].equals(" "))){
                    JOptionPane.showMessageDialog(null, "ERRORE stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Cognome registrato", "Ok", JOptionPane.WARNING_MESSAGE);
                }
            }while((cognomi[i].equals("")) || (cognomi[i].equals(" ")));
            //leggo e controllo il numero di voti dello specifico studente
            do{
                nVoti[i] = Integer.parseInt(JOptionPane.showInputDialog("Quanti voti si vogliono associare a questo studente?"));
                if(nVoti[i] < 2){
                    JOptionPane.showMessageDialog(null, "ERRORE! Uno studente NON può avere meno di 2 voti per il calcolo della media di quest'ultimi", "Errore", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Numero registrato", "Ok", JOptionPane.WARNING_MESSAGE);
                    //controllo se il numero di voti dell'attuale studente � il maggiore; in caso affermativo lo assegno alla variabile che svolge il relativo compito
                    if(nVoti[i] > max){
                        max = nVoti[i];
                    }
                }
            }while(nVoti[i] < 2);
        }
        //alloco matrice dei voti
        voti = new double[nCognomi][max];
        //alloco vettore in cui salvo le medie degli studenti
        medie = new double[nCognomi];
        //leggo voti e li salvo nella matrice, inserendo 0 negli spazi vuoti
        for(int r = 0; r < nCognomi; r++){
            somma = 0.0;
            for(int c = 0; c < max; c++){
                if(c < nVoti[r]){
                    do{
                        voti[r][c] = Double.parseDouble(JOptionPane.showInputDialog("Inserire voto dello studente " +cognomi[r]));
                        if((voti[r][c] < 3) || (voti[r][c] > 10)){
                            JOptionPane.showMessageDialog(null, "ERRORE voto non valido", "Errore", JOptionPane.ERROR_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "Voto registrato", "Ok", JOptionPane.WARNING_MESSAGE);
                        }
                    }while((voti[r][c] < 3) || (voti[r][c] > 10));
                    somma+= voti[r][c];
                }
            }
            //calcolo la media dello studente e la salvo nel rispettivo array
            medie[r] = somma / nVoti[r];
            //controllo se la media appena calcolata supera quella maggiore trovata fin'ora
            if(medie[r] > piuAlta){
                piuAlta = medie[r];
            }
        }
        //controllo a chi appartiene la media più alta
        for(int i = 0; i < nCognomi; i++){
            if(piuAlta == medie[i]){
                migliore = cognomi[i];
            }
        }
        //output delle medie
        System.out.println("Ecco l'elenco degli studenti e delle relative medie:");
        for(int r = 0; r < nCognomi; r++){
            System.out.println(cognomi[r] + " --> " + medie[r]);
        }
        //output del migliore
        System.out.println("Lo studente con la media migliore è: " + migliore);
    }
}