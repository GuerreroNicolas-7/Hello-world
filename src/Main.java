// We need to import the tools we want to use
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int number;
        int sum = 0;
        for(int i = 0; i <= 5; i++){
            number = randomGenerator.nextInt((500 - 1) + 1 ) + 500;
            System.out.println(number);

            sum += number;
        }
        System.out.print(sum);





    }
}