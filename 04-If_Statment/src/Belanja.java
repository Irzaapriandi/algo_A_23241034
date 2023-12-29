import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        // Data member atau Variabel
        int tot_belanja;

        // Membuat objek scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Total Belanja : ");
        tot_belanja = input.nextInt();
         
        // Membuat percabangan
        if (tot_belanja >= 50000) {
            System.out.println("Selamat Dapat Mouse");
        } else {
            System.out.println("Tidak Dapat Mouse");
        }
    }
}