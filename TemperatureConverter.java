import java.util.Scanner;
 public class TemperatureConverter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature value:");
        double temperature = input.nextDouble();

        System.out.println("Enter the unit of measurement of the given temperature above :");
        char unit = input.next().toUpperCase().charAt(0);

        switch(unit){
            case 'C': convertFromCelsius(temperature);
                      break;
            case 'F': convertFromFahrenheit(temperature);
                      break;
            case 'K': convertFromKelvin(temperature);
                      break;
            default : System.out.println("Invalid input of unit");
        }
        input.close();


    }
    public static void convertFromCelsius(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.println("Celsius:" + celsius + "°C");
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Kelvin: " + kelvin + "K");

    }
    public static void convertFromFahrenheit(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Celsius:" + celsius + "°C");
        System.out.println("Kelvin: " + kelvin + "K");

    }
    public static void convertFromKelvin(double kelvin){
        double fahrenheit =  (kelvin - 273.15) * 9/5 + 32;
        double celsius = kelvin - 273.15;
        System.out.println("Kelvin: " + kelvin + "K");
        System.out.println("Celsius:" + celsius + "°C");
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
        


    }
}









