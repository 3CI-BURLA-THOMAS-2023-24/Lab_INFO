/**
 * La classe Test (main)
    -Creare 3 oggetti Punto
    -visualizzare le coordinate del punto1
    -dire se ci sono due punti coincidenti
    -...

    Implementare la classe Test contenente un menu
    -se si digita 1 Si chiedono i dati per istanziare un oggetto Punto, si modifica la coordinata x e si visualizzando le coordinate
    -se si digita 2 si chiedono i dati per istanziare un oggetto Quadrato e si visualizza perimetro e area
    -se si digita 3 si chiedono i dati per istanziare un oggetto Triangolo equilatero, e si visualizza P, A
    -se si digita 4 si chiedono i dati per istanziare un oggetto Triangolo isoscele, e si visualizza P, A
    -se si digita 5 si chiedono i dati per istanziare un oggetto Triangolo equilatero, e si visualizza P, A
    -se si digita 0 o qualsiasi altro valore intero si esce dal programma
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Test{
    public static void main(String args[]){
        //creo oggetti di classe Punto
        Punto p = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto P")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto P")));
        Punto s = new Punto();
        Punto t = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto T")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto T")));
        Circonferenza circonferenza1 = new Circonferenza();
        //imposto coordinate s
        s.setAscissa(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto S")));
        s.setOrdinata(Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto S")));
        //visualizzo coordinate punti
        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        //controllo se vi sono due punti coincidenti
        if((p.getAscissa() == s.getAscissa()) && (p.getOrdinata() == s.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto P e il punto S sono coincidenti");
        }else if((p.getAscissa() == t.getAscissa()) && (p.getOrdinata() == t.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto T e il punto S sono coincidenti");
        }else if((s.getAscissa() == t.getAscissa()) && (s.getOrdinata() == t.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto T e il punto S sono coincidenti");
        }
        //calcolo equazione circonferenza passante per 3 punti
        JOptionPane.showMessageDialog(null, "I tre punti appartengono alla circonferenza di equazione: " + circonferenza1.calcolaEquazione(p, s, t));
        
    }
}