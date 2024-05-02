package model;
public abstract class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString(){
        return 
            "========================================\n" +
            "Pegawai    : "+ this.nama +"\n"+
            "No KTP     : "+ this.noKTP +"\n"+
            "Pendapatan : Rp."+ gaji() +"\n";
    }

    public abstract Double gaji();
}