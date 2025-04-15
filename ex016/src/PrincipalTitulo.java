import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalTitulo {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Pânico", "Terror");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}
