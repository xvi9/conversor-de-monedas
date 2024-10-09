import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorMoney {


    public void guardarJson(Principal principal) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(String.valueOf(principal));
        escritura.write(gson.toJson(principal));
        escritura.close();
    }
}
