/**
 * leggere in input gli anni di una persona e dire se � maggiorenne o minorenne (se anni <0 o >120 visualizzare ERRORE)
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import java.util.Scanner;
public class Es1{
    public static void main(String args[]){
        //dichiarazione variabili
        int anni;
        //controllo dell'input
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("Inserire un'età per verificare se la persona è maggiorenne o minorenne");
            anni = inp.nextInt();
            //messaggi di eventuale errore
            if((anni < 0) || (anni > 120)){
                System.out.println("Errore di input, reinserire il valore!");
            }
        }while((anni < 0) || (anni > 120));
        //output
        if(anni >= 18){
            System.out.println("Maggiorenne");
        }else{
            System.out.println("Minorenne");
        }
        inp.close();
    }
}