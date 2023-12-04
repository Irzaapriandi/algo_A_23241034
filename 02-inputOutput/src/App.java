import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // deklarasi variable dan tipe data
        String nama;
        int nim;
        String prodi;
        double tinggi_badan;

        // membuat scanner baru
        Scanner input = new Scanner(System.in);

        System.out.println("Form Data Mahasiswa UNDIKMA");
        System.out.println("===========================");
        // Membuat form
        System.out.println("Masukkan Nama Mahasiswa : ");
        nama = input.nextLine();

        System.out.println("Masukkan Prodi : ");
        prodi = input.nextLine();

        System.out.println("Masukkan NIM : ");
        nim = input.nextInt();

        System.out.println("Tinggi Badan : ");
        tinggi_badan = input.nextDouble();


        System.out.println("Data Mahasiswa UNDIKMA");
        System.out.println("======================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Tinggi Badan : " + tinggi_badan);
    }
}
