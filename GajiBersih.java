import java.util.Scanner;

public class GajiBersih {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double jamKerja;
        double tarifPerjam;
        double potonganPajak = 10;
        double gajiBruto;
        double gajiBersih;

        System.out.println("Masukkan jumlah jam kerja: ");
        jamKerja = scanner.nextDouble();
        System.out.println("Masukkan tarif per-jam: ");
        tarifPerjam = scanner.nextDouble();
        
        gajiBruto = jamKerja*tarifPerjam;
        potonganPajak = gajiBruto*0.10;
        gajiBersih = gajiBruto - potonganPajak;
        
        //Hasil
        System.out.println(("Gaji bruto : Rp."+gajiBruto));
        System.out.println("Potongan pajak (10%) : Rp."+potonganPajak);
        System.out.println("GajiBersih : Rp."+ gajiBersih);
    }
    
}
