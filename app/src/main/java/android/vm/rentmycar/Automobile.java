package android.vm.rentmycar;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by panar on 30/01/2017.
 */

public class Automobile {

    private String marca,modello,datainizio,datafine,citta;

    public Automobile(String marca, String modello, String datainizio,String datafine, String citta) {
        this.marca = marca;
        this.modello = modello;
        this.datainizio = datainizio;
        this.datafine= datafine;
        this.citta = citta;
    }

    public Automobile(){}

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("modello", modello);
        result.put("marca", marca);
        result.put("datainizio", datainizio);
        result.put("datafine", datafine);
        result.put("citta", citta);
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

    public String getDatainizio() {
        return datainizio;
    }

    public void setDatainizio(String datainizio) {
        this.datainizio = datainizio;
    }

    public String getDatafine() {
        return datafine;
    }

    public void setDatafine(String datafine) {
        this.datafine = datafine;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }
}
