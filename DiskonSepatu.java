import java.util.Scanner;

class Sepatu {
    String merek;
    double harga;
    double diskon;

    public Sepatu(String merek, double harga, double diskon) {
        this.merek = merek;
        this.harga = harga;
        this.diskon = diskon;
    }
}

public class DiskonSepatu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //program tanpa input
        Sepatu[] sepatuArray = {
            new Sepatu("Nike Air", 1500000, 10),
            new Sepatu("Adidas Ultraboost", 2000000, 15),
            new Sepatu("Puma RS-X", 1800000, 20)
        };
        System.out.print("Masukkan jumlah sepatu: ");
        //int jumlahSepatu = scanner.nextInt();
        
        // fungsi try-cat
        int jumlahSepatu = 0;
        try {
            jumlahSepatu = scanner.nextInt();
            scanner.nextLine(); // Consuming newline character

            if (jumlahSepatu <= 0) {
                System.out.println("Jumlah sepatu harus lebih dari 0. Silakan coba lagi.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Jumlah sepatu harus berupa angka. Silakan coba lagi.");
            return;
        }
        scanner.nextLine();
        
        Sepatu[] sepatuArraySepatus = new Sepatu[jumlahSepatu];

        System.out.println("Data Sepatu dan Diskon:");
        for (int i = 0; i < sepatuArray.length; i++) {
            System.out.println("\nMasukkan data sepatu ke-" + (i + 1));
            System.out.print("Merek sepatu: ");
            String nama = scanner.nextLine();

            System.out.print("Harga: ");
            double harga = scanner.nextDouble();

            System.out.print("Diskon (%): ");
            double diskon = scanner.nextDouble();
        
            scanner.nextLine(); // Consuming newline character

            sepatuArray[i] = new Sepatu(nama, harga, diskon);
        }

        // menambahkan variabel totalHargaSetelahDiskon
        double totalHargaSetelahDiskon = 0;

        for (int i = 0; i < sepatuArray.length; i++) {
            Sepatu sepatu = sepatuArray[i];
            double hargaSetelahDiskon = sepatu.harga - (sepatu.harga * sepatu.diskon / 100);
            totalHargaSetelahDiskon += hargaSetelahDiskon;
        }

        System.out.println("\nData Sepatu dan Diskon:");
        for (int i = 0; i < sepatuArray.length; i++) {
            Sepatu sepatu = sepatuArray[i];
            double hargaSetelahDiskon = sepatu.harga - (sepatu.harga * sepatu.diskon / 100);

            System.out.println("\nData sepatu ke-" + (i + 1));
            System.out.println("Nama: " + sepatu.merek);
            System.out.println("Harga: " + sepatu.harga);
            System.out.println("Diskon: " + sepatu.diskon + "%");
            System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);
            System.out.println("Total Harga Setelah Diskon: " + totalHargaSetelahDiskon);
        }
    }
}
