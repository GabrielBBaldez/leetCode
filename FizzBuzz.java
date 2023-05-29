import java.io.IOException;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        printFizzBuzz();
    }

    /*Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead
     of the number and for multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
    Method signature: void printFizzBuzz();*/
    public static void printFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            boolean isDivisivelPor3 = i % 3 == 0;
            boolean isDivisivelPor5 = i % 5 == 0;

            if (isDivisivelPor3 && isDivisivelPor5) {
                System.out.println("FizzBuzz");
            } else if (isDivisivelPor3) {
                System.out.println("Fizz");
            } else if (isDivisivelPor5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
