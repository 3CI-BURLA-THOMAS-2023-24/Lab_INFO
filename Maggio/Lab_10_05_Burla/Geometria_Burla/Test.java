/**
 * La classe Test (main)
    -Creare 3 oggetti Punto
    -visualizzare le coordinate del punto1
    -dire se ci sono due punti coincidenti
    -...
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Test{
    public static void main(String args[]){
        //coefficienti per calcolare l'equazione della circonferenza
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double coefficienti[][] = new double[3][3];
        double incognite[][] = new double[3][1];
        double terminiNoti[][] = new double[3][1];
        //creo oggetti di classe Punto
        Punto p = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto P")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto P")));
        Punto s = new Punto();
        Punto t = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto T")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto T")));
        //imposto coordinate s
        s.setAscissa(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto S")));
        s.setOrdinata(Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto S")));
        //visualizzo coordinate p
        JOptionPane.showMessageDialog(null, p);
        //controllo se vi sono due punti coincidenti
        if((p.getAscissa() == s.getAscissa()) && (p.getOrdinata() == s.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto P e il punto S sono coincidenti");
        }else if((p.getAscissa() == t.getAscissa()) && (p.getOrdinata() == t.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto T e il punto S sono coincidenti");
        }else if((s.getAscissa() == t.getAscissa()) && (s.getOrdinata() == t.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto T e il punto S sono coincidenti");
        }
    }
}