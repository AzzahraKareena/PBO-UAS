class Barang {
    // Atribut
    private String nama;  // Menyimpan nama barang
    private int harga;  // Menyimpan harga barang
    private int stok;  // Menyimpan jumlah stok barang

    // Konstruktor
    public Barang(String nama, int harga, int stok) {
        this.nama = nama;  // Inisialisasi atribut nama dengan nilai parameter nama
        this.harga = harga;  // Inisialisasi atribut harga dengan nilai parameter harga
        this.stok = stok;  // Inisialisasi atribut stok dengan nilai parameter stok
    }

    // Metode
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + nama);  // Menampilkan nama barang ke layar
        System.out.println("Harga: Rp" + harga);  // Menampilkan harga barang ke layar
        System.out.println("Stok Tersedia: " + stok);  // Menampilkan jumlah stok barang ke layar
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;  // Menambahkan nilai jumlah ke atribut stok
        System.out.println("Stok barang berhasil ditambahkan sebanyak " + jumlah);  // Menampilkan pesan ke layar
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {  // Memeriksa apakah jumlah kurang dari atau sama dengan stok
            stok -= jumlah;  // Mengurangi nilai jumlah dari atribut stok
            System.out.println("Stok barang berhasil dikurangi sebanyak " + jumlah);  // Menampilkan pesan ke layar
        } else {
            System.out.println("Stok barang tidak mencukupi.");  // Menampilkan pesan ke layar
        }
    }
}

// Contoh penggunaan kelas Barang
public class UAS{
    public static void main(String[] args) {
        // Membuat objek barang1
        Barang barang1 = new Barang("Buku Tulis", 5000, 10);  // Membuat objek Barang dengan nilai atribut tertentu
        barang1.tampilkanInfo();  // Memanggil metode tampilkanInfo() pada objek barang1

        // Menambah stok barang1 sebanyak 5
        barang1.tambahStok(5);  // Memanggil metode tambahStok(5) pada objek barang1

        // Mengurangi stok barang1 sebanyak 3
        barang1.kurangiStok(3);  // Memanggil metode kurangiStok(3) pada objek barang1

        // Membuat objek barang2
        Barang barang2 = new Barang("Pensil", 2000, 20);  // Membuat objek Barang dengan nilai atribut tertentu
        barang2.tampilkanInfo();  // Memanggil metode tampilkanInfo() pada objek barang2

        // Menambah stok barang2 sebanyak 10
        barang2.tambahStok(10);  // Memanggil metode tambahStok(10) pada objek barang2

        // Mengurangi stok barang2 sebanyak 30
        barang2.kurangiStok(30);  // Memanggil metode kurangiStok(30) pada objek
    }
}