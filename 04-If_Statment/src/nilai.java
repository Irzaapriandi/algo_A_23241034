import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        int nilai;

         Scanner input = new Scanner(System.in);
         System.out.println("Masukkan Nilai");
         nilai = input.nextInt();

         if (nilai >= 80) {
            System.out.println("Mendapat Nilai : A");
         } else if (nilai >=70 && nilai <=79) {
            System.out.println("Mendapat Nilai : B");
         } else if (nilai >=60 && nilai <=69) {
            System.out.println("Mendapat Nilai : C");
         } else if (nilai >=50 && nilai <=59) {
            System.out.println("Mendapat Nilai : D");
         } else {
            System.out.println("Mendapat Nilai : E");
         }
    }
}
