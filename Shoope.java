import java.util.Scanner;

public class Shoope {
    private static void PrintTitle(){
        System.out.println("==================================");
        System.out.println("|---------------------------------|");
        System.out.println("|---------------------------------|");
        System.out.println("|------ SHOOPE - INDONESIA -------|");
        System.out.println("|---------------------------------|");
        System.out.println("|---------------------------------|");
        System.out.println("===================================");
        System.out.println();
    }

    public static void main(String[] args) {
        String Username;
        String Nama;
        String Nama_Barang;
        String Order;
        String Checkout;
        String Password;

        Username ="GADING ILHAM SAPUTRA";
        Nama ="Gading";
        Nama_Barang ="Sepatu";
        Order ="1";
        Checkout ="Hari ini";

        Scanner inputuser = new Scanner(System.in);
        PrintTitle();
        System.out.println("SILAKAN LOGIN");
        System.out.println("Masukan Username = ");
        Username = inputuser.nextLine();
        System.out.println("Masukan Password = ");
        Password = inputuser.nextLine();
        if (Password.equals("12345")){
            Shoope_Model Gading = new Shoope_Model(Username,Nama,Nama_Barang,Order,Checkout);
            char Pilihan = 0;
            do {
                System.out.println();
                System.out.println("MENU");
                System.out.println("[1] Harga Barang");
                System.out.println("[2] Order");
                System.out.println("[0] Checkout");
                System.out.println("Pilihan Anda :");
                Pilihan = inputuser.next().charAt(0);
                System.out.println();
                switch (Pilihan){
                    case '1' -> {
                        int Sepatu = 150000;
                        int BarangPesanan = Gading.Pembayaran(Sepatu);
                        System.out.println("Harga Barang  : " + BarangPesanan);
                    }
                    case '2' ->{
                        System.out.println(" Siap Order !");
                    }
                    case '0' -> {
                        System.out.println(" Berhasil Di Checkout !");
                        System.out.println(" TERIMAKASIH");
                    }
                    default -> {
                    }
                }
            }while (Pilihan!='0');
        }
    }
}
