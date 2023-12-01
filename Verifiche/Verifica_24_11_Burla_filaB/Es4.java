/**
 * Stampare la tabellina del 21.
 * @author Thomas Burla 
 */

public class Es4{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int p, i;
        p = 0;
        //elaborazione
        for(i = 1; i <= 10; i++){
            p = p + 21;
            //output
            System.out.println(+p);
        }
    }
}