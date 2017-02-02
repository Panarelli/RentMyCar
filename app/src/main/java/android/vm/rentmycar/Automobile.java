package android.vm.rentmycar;

import java.util.HashMap;
import java.util.Map;

import static android.R.attr.name;

/**
 * Created by panar on 30/01/2017.
 */

public class Automobile {

    private String marca,modello,data;
    private int numeroposti;

    public Automobile() {
    }

    public Automobile(String marca, String modello, String data, int numeroposti) {
        this.marca = marca;
        this.modello = modello;
        this.data = data;
        this.numeroposti = numeroposti;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("Marca", marca);
        result.put("Modello", modello);
        result.put("Data", data);
        result.put("Numero Posti", numeroposti);
        return result;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumeroposti() {
        return numeroposti;
    }

    public void setNumeroposti(int numeroposti) {
        this.numeroposti = numeroposti;
    }
}
