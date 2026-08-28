
import java.util.Scanner;
import java.text.DecimalFormat;

public class DistanceConvertor {
    double meter, km, miles;
    Scanner sc;
    DecimalFormat f = new DecimalFormat("##.###");

    public DistanceConvertor(Scanner sc) {
        this.sc = sc;
    }

    public void convertMeterToKm() {
        System.out.println("Enter the meter:");
        meter = sc.nextDouble();
        km = meter * 0.001;
        System.out.println("Kilometers: " + f.format(km));
    }

    public void convertKmToMeter() {
        System.out.println("Enter the Kilometer:");
        km = sc.nextDouble();
        meter = km / 0.001;
        System.out.println("Meters: " + f.format(meter));
    }

    public void convertMilesToKm() {
        System.out.println("Enter the miles:");
        miles = sc.nextDouble();
        km = miles * 1.6093;
        System.out.println("Kilometers: " + f.format(km));
    }

    public void convertKmToMiles() {
        System.out.println("Enter the Kilometer:");
        km = sc.nextDouble();
        miles = km / 1.6093;
        System.out.println("Miles: " + f.format(miles));
    }
}

