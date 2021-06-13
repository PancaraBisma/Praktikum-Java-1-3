package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {

    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630921";
        mahasiswa.nama = "Pancara";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("10-09-2001");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa("19630000", "Bisma", "10-09-2001");
        mahasiswa2.tampilkanAtribut();

    }

}