package model;
public class PegawaiTetap extends Pegawai{
    private Double upah;

    public PegawaiTetap(String nama, String noKTP, Double upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(Double upah){
        this.upah = upah;
    }

    public Double getUpah() {
        return upah;
    }

    @Override
    public String toString(){
        return 
            "========================================\n" +
            "Pegawai Tetap   : "+ super.getNama() + "\n" +
            "No KTP          : "+ super.getNoKTP() + "\n" +
            "Upah            : Rp." + this.upah + "\n" +
            "Pendapatan      : Rp."+ gaji() + "\n";
    }

    @Override
    public Double gaji(){
        return upah;
    }
}
