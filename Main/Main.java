package Main;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lens lens1 = new Lens("Sony","50mm", true);
        Lens lens2 = new Lens("Minolta", "85mm", false);

        System.out.println("Lens 1");
        System.out.println(lens1.brand);
        System.out.println(lens1.focalLength);
        System.out.println(lens1.isPrime);

        System.out.println("Lens 2");
        System.out.println(lens2.brand);
        System.out.println(lens2.focalLength);
        System.out.println(lens2.isPrime);

    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens (String brand, String focalLength, boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
