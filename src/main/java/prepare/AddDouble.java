/* 
 * Probleme avec les nombres double/float 
 * ex: 0.1 + 0.2 != 0.3 
 * 
 * explication: 
 * La représentation binaire de 0.1 et 0.2 
 * dans le format IEEE 754 n'est pas exactement 0.1 et 0.2
 * 
 * solution:
 * 1. vers decimal ensuite division 
 * 2. avec BigDecimal (class dans java)
 */



package prepare;
import java.math.BigDecimal;

public class AddDouble{


    public static Double additionDouble(double n1, double n2) {
        return n1 + n2;
    }

    public static Double additionDoubleFixed(double n1, double n2){
        double n1Temp = n1 * 10;

        double n2Temp = n2 * 10;

        double res =  (n1Temp + n2Temp) / 10;

        return res;
    }

    public static BigDecimal additionDoubleBigDecimal(String n1, String n2){
        
        BigDecimal num1 = new BigDecimal(n1);
        BigDecimal num2 = new BigDecimal(n2);

        BigDecimal result = num1.add(num2);
        return result;
    }

    


    public static void main(String[] args) {

        double number1 = 0.1;
        double number2 = 0.2;

        double sum = additionDouble(number1, number2);
        double sum2 = additionDoubleFixed(number1, number2);
        BigDecimal sum3 = additionDoubleBigDecimal("0.1", "0.2");

        System.out.println("Résultat de l'addition : " + sum);
        System.out.println("Résultat de l'addition fixed: " + sum2);
        System.out.println("Résultat de l'addition avec BigDecimal: " + sum3);
    }
}