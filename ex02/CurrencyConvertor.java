
import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConvertor {
    double rupee, dollar, euro, yen;
    Scanner sc;
    DecimalFormat f = new DecimalFormat("##.###");

    public CurrencyConvertor(Scanner sc) {
        this.sc = sc;
    }

    public void convertInrToEuro() {
        System.out.println("Enter amount in rupees:");
        rupee = sc.nextDouble();
        euro = rupee / 80;
        System.out.println("Euro: " + f.format(euro));
    }

    public void convertEuroToInr() {
        System.out.println("Enter amount in Euro:");
        euro = sc.nextDouble();
        rupee = euro * 80;
        System.out.println("Rupees: " + f.format(rupee));
    }

    public void convertInrToDollar() {
        System.out.println("Enter amount in rupees:");
        rupee = sc.nextDouble();
        dollar = rupee / 66;
        System.out.println("Dollar: " + f.format(dollar));
    }

    public void convertDollarToInr() {
        System.out.println("Enter amount in dollar:");
        dollar = sc.nextDouble();
        rupee = dollar * 66;
        System.out.println("Rupees: " + f.format(rupee));
    }

    public void convertInrToYen() {
        System.out.println("Enter amount in rupees:");
        rupee = sc.nextDouble();
        yen = rupee / 0.61;
        System.out.println("Yen: " + f.format(yen));
    }

    public void convertYenToInr() {
        System.out.println("Enter amount in Yen:");
        yen = sc.nextDouble();
        rupee = yen * 0.61;
        System.out.println("Rupees: " + f.format(rupee));
    }
}

