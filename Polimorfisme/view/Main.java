package view;
import model.*;

public class Main {
    public static void main(String[] args) {

        PegawaiTetap pegawaiTetap = new PegawaiTetap(
            "Heru Budi",
            "0123456789",
            2000000.0
        );

        PegawaiHarian pegawaiHarian = new PegawaiHarian(
            "Alfiansyah Komeng", //Uhuuy...
            "0987654321",
            8500.0,
            40
        );

        Sales sales = new Sales(
            "Sumaiyah",
            "0192837465",
            50,
            50000.0
        );

        PegawaiHarian pegawaiHarian2 = new PegawaiHarian(
            "Jundi Muhammad Fauzan",
            "01122334455",
            4000.0,
            50
        );

        System.out.println(pegawaiTetap.toString());
        System.out.println(pegawaiHarian.toString());
        System.out.println(sales.toString());
        System.out.println(pegawaiHarian2.toString());
    }
}
