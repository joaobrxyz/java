import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Titulo implements Comparable<Titulo> {
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outro) {
        return this.nome.compareTo(outro.nome);
    }

    public static void main(String[] args) {
        List<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("A"));
        listaTitulos.add(new Titulo("B"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);
        }
    }
}
