public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    // ini merupakan kontruktor dari kelas hewan. kontruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Hewan(String namaHewan) {
        nama = namaHewan;
    }

    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahkakiHewan) {
        jumlahKaki = jumlahkakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama hewan: " + nama);
        System.out.println("Berat hewan : " + berat + " kg");
        System.out.println("Jumlah kaki: " + jumlahKaki);
    }
}
