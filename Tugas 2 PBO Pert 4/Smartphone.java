public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void kirimPesan(String nomor) {
        System.out.println("Mengirim pesan dari smartphone ke nomor " + nomor + ": halo, selamat pagi!");
    }

    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone " + merk + " " + model + ".");
    }

    // Metode tambahan untuk mengirim email ke alamat tertentu
    public void kirimEmail() {
        String email = "handraputra05@gmail.com";
        String subjek = "Pesan dari Smartphone";
        String isiPesan = "Halo, ini pesan otomatis dari smartphone " + merk + " " + model;
        System.out.println("Mengirim email ke " + email + " dengan subjek '" + subjek + "' dan pesan: " + isiPesan);
    }
}
