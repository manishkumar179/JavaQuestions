interface Temperature{
    double cToF(double cel);
    double fToC(double fah);
}

 class TemperatureConverter implements Temperature{
    public double cToF(double cel){
        return (cel * 9 / 5) + 32;
    }

    public double fToC(double fah){
        return (fah-32)*5/9;
    }
    
}


public class TestTemperature {
    public static void main(String[] args) {

         TemperatureConverter converter = new TemperatureConverter();

        double cel = 25;
        double fahrenheit = converter.cToF(cel);

        System.out.println(cel + " °C = " + fahrenheit + " °F");

        double fah = 98.6;
        double celcius = converter.fToC(fah);

        System.out.println(fah + " °F = " + celcius + " °C");

    }
}
