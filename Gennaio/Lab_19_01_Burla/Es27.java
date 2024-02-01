/**
 * Prese due stringhe, stamparle in ordine alfabetico.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import java.util.Scanner;
public class Es27 {
    public static void main(String args[]){
        //dichiarazione variabili
        String input1 , input2, lower1, lower2;
        boolean uguale;
        int alfabeto, counter;
        //inizializzazione variabili
        counter = 0;
        //la variabile alfabeto servirà per l'output, i valori che assume sono puramente arbitrari
        alfabeto = 0;
        Scanner input = new Scanner(System.in);
        //controllo che la stringa input1 non sia vuota
        do{
            System.out.println("Inserire una stringa");
            input1 = input.nextLine();
            //messaggio di eventuale errore
            if(input1.equals("")){
                System.out.println("ERRORE! Stringa vuota");
            }
        }while(input1.equals(""));
        //controllo che la stringa input2 non sia vuota
        do{
            System.out.println("Inserire un'altra stringa per visualizzare le due stringhe in ordine alfabetico");
            input2 = input.nextLine();
            //messaggio di eventuale errore
            if(input2.equals("")){
                System.out.println("ERRORE! Stringa vuota");
            }
        }while(input2.equals(""));
        //per confronatre le due stringhe, innanzitutto le trasformo in stringhe di sole lettere minuscole
        lower1 = input1.toLowerCase();
        lower2 = input2.toLowerCase();
        //leggo e confronto i caratteri, ripetendo le operazioni finchè non trovo due caratteri diversi
        do{
            uguale = false;
            //con caratteri uguali attivo la variabile che consente di ripetere il confronto usando i caratteri successivi
            if(lower1.charAt(counter) == lower2.charAt(counter)){
                uguale = true;
            //in caso di caratteri diversi, confronto il loro codice Unicode/ASCII
            }else if(lower1.charAt(counter) < lower2.charAt(counter)){
                alfabeto = 1;
            }else{
                alfabeto = 2;
            }
            counter++;
        }while((uguale == true) && (counter < lower1.length()) && (counter < lower2.length()));
        //output
        switch(alfabeto){
            case 0: System.out.println("Le due stringhe sono uguali");
                    break;
            case 1: System.out.println(input1);
                    System.out.println(input2);
                    break;
            case 2: System.out.println(input2);
                    System.out.println(input1);
                    break;
        }
    }
}