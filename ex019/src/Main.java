import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> max = numeros.stream()
                .max(Integer::compare);
        max.ifPresent(System.out::println);

        // 2 - Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho. No código a seguir, há um exemplo prático do resultado esperado.
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        Map<Integer, List<String>> agrupamento = palavras.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(agrupamento);

        // 3 - Dada a lista de nomes abaixo, concatene-os separados por vírgula. No código a seguir, há um exemplo prático do resultado esperado.
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        String nomesConcat = nomes.stream()
                .collect(Collectors.joining(", "));
        System.out.println(nomesConcat);

        // 4 - Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int resultado = numeros2.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(resultado);

        // 5 - Dada uma lista de números inteiros, separe os números pares dos ímpares.
        List<Integer> numeros3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> numAgrupados = numeros3.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: " + numAgrupados.get(true));
        System.out.println("Ímpares: " + numAgrupados.get(false));

    }
}