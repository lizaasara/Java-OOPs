import java.util.Scanner;

public class Complex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading real and imaginary parts of the first complex number
        System.out.print("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = sc.nextDouble();

        // Reading real and imaginary parts of the second complex number
        System.out.print("Enter real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = sc.nextDouble();

        // Adding the real and imaginary parts separately
        double realSum = real1 + real2;
        double imagSum = imag1 + imag2;

        // Displaying the result
        System.out.println("Sum of the complex numbers: " + realSum + " + " + imagSum + "i");

        sc.close();
    }
}
