public class Shoope_Model {
    String Username;
    String Nama;
    String Nama_Barang;
    String Order;
    String Checkout;
    private int Pembayaran;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNama_Barang() {
        return Nama_Barang;
    }

    public void setNama_Barang(String nama_Barang) {
        Nama_Barang = nama_Barang;
    }

    public String getOrder() {
        return Order;
    }

    public void setOrder(String order) {
        Order = order;
    }

    public String getCheckout() {
        return Checkout;
    }

    public void setCheckout(String checkout) {
        Checkout = checkout;
    }

    public int getPembayaran() {
        return Pembayaran;
    }

    public void setPembayaran(int pembayaran) {
        Pembayaran = pembayaran;
    }

    public Shoope_Model(String us, String nm, String nb, String or, String ck){
        this.Username = us;
        this.Nama = nm;
        this.Nama_Barang = nb;
        this.Order = or;
        this.Checkout = ck;
        this.Pembayaran = 0;
    }
    public int Pembayaran(int jumlah){
        Pembayaran = Pembayaran + jumlah;
        return Pembayaran;
    }
    public Shoope_Model(){

    }
}
