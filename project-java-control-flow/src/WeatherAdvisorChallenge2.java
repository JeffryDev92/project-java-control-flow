import java.util.Scanner;

public class WeatherAdvisorChallenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.println("Welcome, choose two numbers between 1 and 200 separate by a space");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Let's count the numbers from " + num1 + " to " + num2 + ".");
        System.out.println("If the number is multiple of 3, 5 or 7 I will say 'FizzBuzzBoom'.");
        for (int i = num1; i <= num2; i++) {
            number = i;
            if (number % 3 == 0) {
                System.out.println("FizzBuzzBoom");
            } else if (number % 5 == 0) {
                System.out.println("FizzBuzzBoom");
            } else if (number % 7 == 0) {
                System.out.println("FizzBuzzBoom");
            } else {
                System.out.println(number);
            }
        }
        scanner.close();
    }    
}
