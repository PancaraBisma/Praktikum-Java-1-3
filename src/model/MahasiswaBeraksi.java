package model;

import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630921";
        mahasiswa.nama = "Pancara";
        mahasiswa.tanggalLahir = new Date();
    }
}
