package model;
public class Sales extends Pegawai {
    private int penjualan;
    private Double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(Double komisi){
        this.komisi = komisi;
    }

    public void setPenjualan(int penjualan){
        this.penjualan = penjualan;
    }

    @Override
    public String toString(){
        return 
            "========================================\n" +
            "Pegawai Harian  : "+ super.getNama() + "\n" +
            "No KTP          : "+ super.getNoKTP() + "\n" +
            "Total Penjualan : " + this.penjualan + "\n" +
            "Besaran Komisi  : Rp." + this.komisi + "\n" +
            "Pendapatan      : Rp."+ gaji() + "\n";
    }

    @Override
    public Double gaji(){
        return penjualan * komisi;
    }
}
