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
        System.out.println("Usiaku \t\t\t : " +mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630000";
        mahasiswa2.nama = "Bisma";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("10-09-2000");

        mahasiswa2.tampilkanAtribut();
        mahasiswa2.menyapa();
        System.out.println("Usiaku \t\t\t : " +mahasiswa2.hitungUsia() + " tahun");

    }
}
