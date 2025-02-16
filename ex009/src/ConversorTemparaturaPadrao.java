public class ConversorTemparaturaPadrao implements ConversorTemparatura {

    @Override
    public void celsiusParaFahrenheit(double temperaturaEmCelsius) {
        double f = temperaturaEmCelsius * 1.8 + 32;
        System.out.println("A temperatura em fahrenheit é: " + f);
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaEmFahrenheit) {
        double c = (temperaturaEmFahrenheit - 32) / 1.8;
        System.out.println("A temperatura em fahrenheit é: " + c);
    }
}
