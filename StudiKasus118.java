import java.util.Scanner;

public class StudiKasus118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18_000;
        int 
        jumlahCup, uangBayar, totalHarga, 
        diskon, totalBayar, 
        kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang yang dibayar: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if(totalHarga >= 100_000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon yang diterima: " + diskon);
        System.out.println("Total yang dibayar: " + totalBayar);

        if(uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang kurang: " + kurang);
        }
        sc.close();
    }
}