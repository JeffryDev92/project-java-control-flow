public class WeatherAdvisor {
    public static void main(String[] args) {
        int temperature = 35 ;

        System.out.println("The temperature is " + temperature + "°C.");

        if (temperature > 30) {
            System.out.println("It's a hot day. Stay hydrated!");
        } else if (temperature > 20) {
            System.out.println("It's a warm day. Enjoy the weather!");
        } else if (temperature > 10) {
            System.out.println("It's a cool day. Wear a light jacket.");
        } else {
            System.out.println("It's a cold day. Stay warm!");
        }
    }
}