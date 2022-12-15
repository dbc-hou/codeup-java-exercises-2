import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Gimme an integer: ");
//        int myInt = sc.nextInt();
//        System.out.println("You game me " + myInt + ".");
//        System.out.print("Gimme three words, separated by spaces: ");
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//        System.out.println("The first word is " + firstWord + ".");
//        System.out.println("The second word is " + secondWord + ".");
//        System.out.println("The third word is " + thirdWord + ".");
//        System.out.print("What is the width of this room in feet?");
//        double width = sc.nextDouble();
//        System.out.print("And what is the length of this room in feet?");
//        double length = sc.nextDouble();
//        double areaOfRoom = area(width,length);
//        double perimeterOfRoom = perimeter(width,length);
//        System.out.println("The area of this room is " + areaOfRoom + " feet; the perimeter is " + perimeterOfRoom + " feet.");

        System.out.print("Enter an integer: ");
        int isItPrime = sc.nextInt();
        if (isItPrime < 0) {
            isItPrime = Math.abs(isItPrime);
            System.out.println("Smart-ass! Converting that to a positive integer because this operation involves square roots.");
        }
        if (isPrime(isItPrime)) {
            System.out.println(isItPrime + " is a prime number.");
        } else {
            System.out.println(isItPrime + " is not a prime number.");
        }
    }

    public static double area(double a, double b) {
        return a * b;
    }

    public static double perimeter(double a, double b) {
        return (2 * a) + (2 * b);
    }

    public static boolean isPrime(int i) {

        int squareRoot = (int) Math.sqrt(i);

        if (i == 2) {
            return true;
        } else if (i % 2 == 0) {
            return false;
        }

        for (int j = 3; j <= squareRoot; j+=2) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }
}
