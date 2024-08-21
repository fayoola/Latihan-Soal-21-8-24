import java.util.Scanner;

public class Diskon {
    public static void main(String [] args) {
        double diskon;
        int hargaBarang;
        int jumlahBarang;
        int totalHarga;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di program menghitung diskon");
        System.out.println("Masukkan harga barang awal: ");
        hargaBarang = scanner.nextInt();
        System.out.println("Masukkan jumlah barang: ");
        jumlahBarang = scanner.nextInt();
        totalHarga = hargaBarang * jumlahBarang;
        System.out.println("Total harga "+ totalHarga);

        System.out.println("Masukkan diskon");
        diskon = scanner.nextDouble();
        diskon = diskon / 100 * totalHarga;
        double harga_akhir = totalHarga * diskon;
        System.out.println("harga total barang akhir"+ harga_akhir);
        
    }
}

