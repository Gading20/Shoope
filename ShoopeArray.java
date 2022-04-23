import java.util.ArrayList;
import java.util.Scanner;

public class ShoopeArray {
    public static void main(String[] args) {
        ArrayList<Shoope_Model> DaftarAkunUser = new ArrayList<Shoope_Model>();
        for (int i=0;i<3;i++){
            Shoope_Model Shoopeku = new Shoope_Model();

            Scanner inputdetail = new Scanner(System.in);

            System.out.println("Masukan Nama = ");
            Shoopeku.Nama = inputdetail.nextLine();

            System.out.println("Masukan Nama Barang = ");
            Shoopeku.Nama_Barang = inputdetail.nextLine();

            System.out.println("---------------------------------");

            DaftarAkunUser.add(Shoopeku);
        }
    }
}
