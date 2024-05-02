package model;
public class PegawaiHarian extends Pegawai{
    private Double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, Double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public Double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam){
        this.totalJam = totalJam;
    }

    @Override
    public String toString(){
        return 
            "========================================\n" +
            "Pegawai Harian  : "+ super.getNama() + "\n" +
            "No KTP          : "+ super.getNoKTP() + "\n" +
            "Upah/Jam        : Rp." + this.upahPerJam + "\n" +
            "Total Jam Kerja : " + this.totalJam + "\n" +
            "Pendapatan      : Rp."+ gaji() + "\n";
    }

    @Override
    public Double gaji(){
        if(this.totalJam <= 40){
            return this.upahPerJam * this.totalJam;
        } else {
            return (this.upahPerJam * this.totalJam) + ((this.totalJam - 40) * this.upahPerJam * 1.5);
        }
    }
}
