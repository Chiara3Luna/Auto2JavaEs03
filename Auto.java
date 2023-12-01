// Auto.java
public class Auto {
    //queste sono le proprietà
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    //faccio il costruttore
    public Auto(int cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    // get per ottenere valore proprietà
    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    // set per impostare il valore delle proprietà
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
}

