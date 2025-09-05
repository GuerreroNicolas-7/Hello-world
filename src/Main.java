// We need to import the tools we want to use
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int number;
        int sum = 0;
        for(int i = 0; i <= 5; i++){
            number = randomGenerator.nextInt((200 - 1) + 1 ) + 1;
            sum += number;
        }
        System.out.print(sum);





    }
}