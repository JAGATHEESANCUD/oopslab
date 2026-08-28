
import java.util.Scanner;

public class Convertor {

    public static void main(String[] args) {

        int code, currencyCode, distanceCode, timeCode;

        Scanner sc = new Scanner(System.in);

        CurrencyConvertor currency = new CurrencyConvertor(sc);
        DistanceConvertor distance = new DistanceConvertor(sc);
        TimeConvertor time = new TimeConvertor(sc);

        System.out.println("Enter the code:");
        System.out.println("1: Currency");
        System.out.println("2: Distance");
        System.out.println("3: Time");

        code = sc.nextInt();

        if (code == 1) {

            System.out.println("Enter the Currency code:");
            System.out.println("1: Euro");
            System.out.println("2: Dollar");
            System.out.println("3: Yen");

            currencyCode = sc.nextInt();

            if (currencyCode == 1) {
                currency.convertInrToEuro();
                currency.convertEuroToInr();
            }
            else if (currencyCode == 2) {
                currency.convertInrToDollar();
                currency.convertDollarToInr();
            }
            else if (currencyCode == 3) {
                currency.convertInrToYen();
                currency.convertYenToInr();
            }
            else {
                System.out.println("Invalid currency code");
            }
        }

        else if (code == 2) {

            System.out.println("Enter the Distance code:");
            System.out.println("1: Meter");
            System.out.println("2: Miles");

            distanceCode = sc.nextInt();

            if (distanceCode == 1) {
                distance.convertMeterToKm();
                distance.convertKmToMeter();
            }
            else if (distanceCode == 2) {
                distance.convertMilesToKm();
                distance.convertKmToMiles();
            }
            else {
                System.out.println("Invalid distance code");
            }
        }

        else if (code == 3) {

            System.out.println("Enter the Time code:");
            System.out.println("1: Minutes");
            System.out.println("2: Seconds");

            timeCode = sc.nextInt();

            if (timeCode == 1) {
                time.convertHourToMinute();
                time.convertMinuteToHour();
            }
            else if (timeCode == 2) {
                time.convertHourToSeconds();
                time.convertSecondsToHour();
            }
            else {
                System.out.println("Invalid time code");
            }
        }

        else {
            System.out.println("Invalid code");
        }

        sc.close();
    }
}

