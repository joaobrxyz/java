public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
