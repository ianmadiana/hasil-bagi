import java.util.Scanner;

public class hasilBagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai1, nilai2, Mod, Perkalian, Pembagian, Tambah;
        Double BagiD;
        String jawab;

        do {
            System.out.print("Masukkan nilai 1: ");
            nilai1=input.nextInt();
            System.out.println("Mod");
            System.out.print("Masukkan nilai 2: ");
            nilai2=input.nextInt();
            System.out.println("");

            Pembagian = nilai1/nilai2;
            Mod = nilai1 % nilai2;
            Perkalian = nilai2*Pembagian;
            Tambah = Perkalian + Mod;
            BagiD = (double)nilai1/(double)nilai2;

            System.out.println("Langkah 1. Hitung mod antara nilai 1 dan nilai 2: ");
            System.out.println(nilai1+" mod "+nilai2+" = "+Mod);
            System.out.println("");
            System.out.println("Langkah 2. Hitung pembagian antara nilai 1 dan nilai 2: ");
            System.out.println(nilai1+"/"+nilai2+" = "+Pembagian+" ("+BagiD+")");
            System.out.println("Ambil nilai sebelum koma");
            System.out.println("");
            System.out.println("Langkah 3. Hitung nilai 2 dikali hasil pembagian pada langkah (2): ");
            System.out.println(nilai2+"*"+Pembagian+" = "+Perkalian);
            System.out.println("");
            System.out.println("Langkah 4. Hitung penjumlahan antara hasil langkah (3) ditambah hasil mod langkah (1): ");
            System.out.println(Perkalian+"+"+Mod+" = "+Tambah);
            System.out.println("");
            System.out.println("Hasil akhir:");
            System.out.println(nilai1 + " mod " + nilai2 + " = " + Mod + ", menghasilkan "+ Pembagian + " sisa " + Mod);
            System.out.println("");

            System.out.print("Ulangi? (y/t): ");
            jawab=input.next();
        }while (jawab.equalsIgnoreCase("y"));
    }
}
