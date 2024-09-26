public class FeaturePhone extends Handphone {

    public FeaturePhone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Feature Phone " + merk + " " + model + " dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("Feature Phone " + merk + " " + model + " dimatikan.");
    }

    @Override
    public void pesan(String nomor) {
        System.out.println("Mengirim pesan ke nomor " + nomor);
    }

    public void mainGameSnake() {
        System.out.println("Memainkan game Snake.");
    }
}
