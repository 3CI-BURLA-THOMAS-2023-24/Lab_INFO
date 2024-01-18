/**
 * Leggere 3 numeri e metterli in ordine crescente.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import java.util.Scanner;
public class Es4{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double a, b, c;
        //input dei tre valori
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il primo numero");
        a = input.nextDouble();
        System.out.println("Inserire il secondo numero");
        b = input.nextDouble();
        System.out.println("Inserire il terzo numero");
        c = input.nextDouble();
        //preparazione output
        System.out.println("In ordine crescente, in numeri sono: ");
        //elaborazione con if annidate
        if(a < b){
            if(a < c){
                System.out.println(a);
                if(b < c){
                    System.out.println(b);
                    System.out.println(c);
                }else{
                    System.out.println(c);
                    System.out.println(b);
                }
            }else if(a == c){
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }else{
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }else{
            if(b < c){
                System.out.println(b);
                if(a < c){
                    System.out.println(a);
                    System.out.println(c);
                }else{
                    System.out.println(c);
                    System.out.println(a);
                }
            }else if(b == c){
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }else{
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }
        input.close();
    }
}