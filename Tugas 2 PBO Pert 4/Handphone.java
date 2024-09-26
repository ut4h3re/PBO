public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone " + merk + " " + model + " dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone " + merk + " " + model + " dimatikan.");
    }

    public void kirimPesan(String nomor) {
        System.out.println("Mengirim pesan ke nomor " + nomor + ": halo, apa kabar?");
    }
}
