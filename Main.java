
public class Main {
    public static void main(String[] args) {
        //dichiaro l'oggetto
        Auto miaAuto = new Auto(2000, "AB123CD", "Fiat", "500");

        // metodo set
        miaAuto.setCilindrata(2500);
        miaAuto.setTarga("XY456ZW");

        // metodo get
        System.out.println("Cilindrata: " + miaAuto.getCilindrata());
        System.out.println("Targa: " + miaAuto.getTarga());
        System.out.println("Marca: " + miaAuto.getMarca());
        System.out.println("Modello: " + miaAuto.getModello());
    }
}
