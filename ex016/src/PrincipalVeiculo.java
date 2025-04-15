import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Mitsubishi", "Lancer", 2013);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(veiculo);
        System.out.println(json);
    }
}
