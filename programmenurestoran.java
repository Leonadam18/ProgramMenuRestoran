import java.util.Scanner;

public class programmenurestoran {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int totalmakan = 0;
            int totalminum = 0;
            do{
                System.out.println("==Warung Mamang Gepreks==");
                System.out.println("1. Ayam Geprek Biasa (Rp.12000)\n2. Ayam Geprek Bakar (Rp.13000)\n3. Ayam Geprek Katsu (Rp.10000)\n4. Ayam Geprek Suwir (Rp.5000)");
                System.out.println("Pilih Makan (1/2/3/4):");
                int pilihmakan = scanner.nextInt();

                switch (pilihmakan) {
                    case 1:
                        System.out.println("Berapa banyak? ");
                        int geprekbiasa = scanner.nextInt();
                        totalmakan += 12000 * geprekbiasa;
                        break;
                    case 2:
                        System.out.println("Berapa banyak? ");
                        int geprekbakar = scanner.nextInt();
                        totalmakan += 13000 * geprekbakar;
                        break;
                    case 3:
                        System.out.println("Berapa banyak? ");
                        int geprekkatsu = scanner.nextInt();
                        totalmakan += 10000 * geprekkatsu;
                        break;
                    case 4:
                        System.out.println("Berapa banyak? ");
                        int gepreksuwir = scanner.nextInt();
                        totalmakan += 5000 * gepreksuwir;
                        break;
                    default:
                        System.out.println("Pesanan tidak tersedia.");
                        break;
                }
                System.out.print("Ingin menambah minuman? (y/n): ");
                String pilihan1 = scanner.next();
                if(!pilihan1.equalsIgnoreCase("y")) {
                    break;
                }

                System.out.println("==Warung Mamang Gepreks==");
                System.out.println("1. Es/Anget Teh (Rp.3000)\n2. Es/Anget Jeruk (Rp.3000)\n3. Pop Es (Rp.5000)\n4. Kopi Susu (Rp.5000)");
                System.out.println("Pilih Minum (1/2/3/4):");
                int pilihminum = scanner.nextInt();

                switch (pilihminum) {
                    case 1:
                        System.out.println("Berapa banyak? ");
                        int teh = scanner.nextInt();
                        totalminum += 3000 * teh;
                        break;
                    case 2:
                        System.out.println("Berapa banyak? ");
                        int jeruk = scanner.nextInt();
                        totalminum += 3000 * jeruk;
                        break;
                    case 3:
                        System.out.println("Berapa banyak? ");
                        int popes = scanner.nextInt();
                        totalminum += 5000 * popes;
                        break;
                    case 4:
                        System.out.println("Berapa banyak? ");
                        int kopsus = scanner.nextInt();
                        totalminum += 5000 * kopsus;
                        break;
                    default:
                        System.out.println("Pesanan tidak tersedia.");
                        break;
                }
                System.out.print("Ingin menambah lagi? (y/n): ");
                String pilihan2 = scanner.next();
                if(!pilihan2.equalsIgnoreCase("y")) {
                    break;
                }
            }while(true);
            int total = totalmakan + totalminum;
            System.out.println("Total Pembayaran: Rp."+total);
            System.out.println("==Selamat menikmati==");
        }
    }
}