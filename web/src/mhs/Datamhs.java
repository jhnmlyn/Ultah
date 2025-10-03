package mhs;

import java.util.Scanner;

public class Datamhs {
    public static void main(String[] args) {

        // deklarasi variabel
        String nama, jurusan;
        int umur;
        Double ipk;

        // membuat scanner baru
        Scanner input = new Scanner(System.in);

        // tampilkan output ke user
        System.out.println("::..Pendataan Mahasiswa Widyatama..::");
        System.out.print("Nama Mahasiswa:");

        // menggunakan scanner dan menyimpan apa yang diketik ke dalam variabel

        nama = input.nextLine();

        // tampilkan output lagi
        System.out.print("Jurusan:");
        jurusan = input.nextLine();

        System.out.print("Umur:");
        umur = input.nextInt();

        System.out.print("ipk:");
        ipk = input.nextDouble();

        // Tampilkan apa yang disimpan dalam variabel
        System.out.println("---------------------------------");
        System.out.println("Nama Mahasiswa:" + nama);
        System.out.println("Jurusan:" + jurusan);
        System.out.println("Umur:" + umur + "tahun");
        System.out.println("IPK:" + ipk);

        input.close();
    }
}
