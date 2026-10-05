import java.util.Scanner;

public class StudiKasus218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, jenisKegiatan;
        String pesan = "Status: ";
        byte jumlahDokumen, peringkat;
        int statusPendanaan; 
        
        System.out.print("Masukkan nama mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Masukkan jumlah dokumen yang sudah diupload (0-4): ");
        jumlahDokumen = sc.nextByte();

        if (jumlahDokumen == 4) {
            
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
                jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
                jenisKegiatan.equalsIgnoreCase("Mandiri")) {
                
                System.out.print("Masukkan peringkat (1, 2, atau 3; isi 0 jika bukan juara): ");
                peringkat = sc.nextByte();

                if (peringkat >= 1 && peringkat <= 3) {
                    pesan += "Dana Penghargaan Diberikan (Juara " + peringkat + " " + jenisKegiatan.toUpperCase() + ").";
                } else {
                    pesan += "Dana Penghargaan Tidak Diberikan. (Hanya Juara 1, 2, atau 3 yang mendapat dana)";
                }

            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                
                System.out.print("Masukkan status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
                statusPendanaan = sc.nextInt();

                if (statusPendanaan == 1) {
                    pesan += "Dana Penghargaan Diberikan (Tim PKM Lolos Pendanaan).";
                } else {
                    pesan += "Dana Penghargaan Tidak Diberikan. (Tim PKM tidak lolos pendanaan)";
                }

            } else if (jenisKegiatan.equalsIgnoreCase("Lainnya")) {
                pesan += "Dana Penghargaan Tidak Diberikan. (Kegiatan di luar ketentuan utama)";
            } else {
                pesan += "Jenis kegiatan tidak valid.";
            }

        } else {
            int kekurangan = 4 - jumlahDokumen;
            pesan += "Data tidak lengkap. Dokumen yang diupload kurang " + kekurangan + " dokumen. Dana Penghargaan Tidak Diberikan.";
        }

        System.out.println("HASIL PENGECEKAN ");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jenis Kegiatan : " + jenisKegiatan);
        System.out.println(pesan);

        sc.close();
    }
}