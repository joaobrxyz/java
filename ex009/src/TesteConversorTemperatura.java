public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemparaturaPadrao conversor = new ConversorTemparaturaPadrao();

        conversor.celsiusParaFahrenheit(25);
        conversor.fahrenheitParaCelsius(77);
    }
}
