package demo;

/**
 *
 * @author Moises Alvarado
 */
public class MainClass_calculadora {
    // declarations
    int pNumber1;
    int pNumber2;
    
    // operations
    static int suma(int pNumero1, int pNumero2){
        return pNumero1 + pNumero2;
    }
    static int resta(int pNumero1, int pNumero2){
        return pNumero1 - pNumero2;
    }
    static int multiplicacion(int pNumero1, int pNumero2){
        return pNumero1 * pNumero2;
    }
    static int division(int pNumero1, int pNumero2){
        return pNumero1 / pNumero2;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma: " + suma(20,20));
        System.out.println("Resta: " + resta(20,20));
        System.out.println("Multiplicacion: " + multiplicacion(20,20));
        System.out.println("Division: " + division(20,20));
        
    }
    
}
