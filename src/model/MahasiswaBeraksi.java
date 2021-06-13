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

        System.out.println("Nama \t\t\t : " +mahasiswa.nama);
        System.out.println("NPM \t\t\t : " +mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.tanggalLahir));

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630000";
        mahasiswa2.nama = "Bisma";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("10-09-2000");

        System.out.println("Nama \t\t\t : " +mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " +mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));
    }
}
