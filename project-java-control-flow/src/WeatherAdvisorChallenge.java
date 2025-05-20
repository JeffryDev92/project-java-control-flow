public class WeatherAdvisorChallenge {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Let's count the numbers from 1 to 100, and tell you when these numbers are multiple of 3 or 5.");
        System.out.println("If the number is multiple of 3, I will say 'Fizz'.");
        System.out.println("If the number is multiple of 5, I will say 'Buzz'.");
        System.out.println("If the number is multiple of both, I will say 'FizzBuzz'.");
        System.out.println("Let's start counting!");
        for (int i = 1; i <= 100; i++) {
            number = i;
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
