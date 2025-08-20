public enum Moeda {
    DOLAR(0.18),
    EURO(0.16),
    REAL(1);

    private final double cambio;

    Moeda(double cambio){
        this.cambio = cambio;
    }

    public double converterPara(double valorEmReais) {
        return valorEmReais * cambio;
    }
}
