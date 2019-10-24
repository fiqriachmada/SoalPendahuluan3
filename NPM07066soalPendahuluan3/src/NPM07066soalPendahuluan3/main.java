package NPM07066soalPendahuluan3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<pegawai> pegawaiArr = new ArrayList<>();
    static ArrayList<pelanggan> pelangganArr = new ArrayList<>();
    static ArrayList<cucian> cucianArr = new ArrayList<>();

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("\n\n Sistem Informasi Laundry RPL!!!");
            main.tampilkanData();
            System.out.println("\n\n Menu         : ");
            System.out.println("1. Tambah Kasir     : ");
            System.out.println("2. Tambah Pelanggan : ");
            System.out.println("3. Tambah Transaksi : ");
            System.out.println("0. Selesai ");
            System.out.print("Masukkan nomer menu : ");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    main.tambahKasir();
                    break;
                case 2:
                    main.tambahPelanggan();
                    break;
                case 3:
                    main.tambahCucian();
                    break;
                default:
                    menu = 0;
                    System.out.println("Terima Kasih telah menggunakan Sistem Informasi Laundry RPL!!!");
            }
        } while (menu != 0);
    }

    static void tampilkanData() {
        System.out.println("\n\nData Pegawai : ");
        for (int i = 0; i < pegawaiArr.size(); i++) {
            System.out.println("ID Pegawai      : " + pegawaiArr.get(i).getId() + ", Nama : " + pegawaiArr.get(i).getNama() + ", No HP : " + pegawaiArr.get(i).getNoHp());
        }
        System.out.println("\n\nData Cucian     : ");
        for (int i = 0; i < pelangganArr.size(); i++) {
            System.out.println("ID Pegawai : " + pelangganArr.get(i).getId() + ", Nama : " + pelangganArr.get(i).getNama() + ", No HP : " + pelangganArr.get(i).getNoHp());

        }
        System.out.println("\n\nData Pegawai : ");
        for (int i = 0; i < cucianArr.size(); i++) {
            System.out.println("Nama Pegawai : " + cucianArr.get(i).getPegawai().getNama() + ", Nama Pelanggan : " + cucianArr.get(i).getPelanggan().getNama() + ", Berat Cucian : " + cucianArr.get(i).getHargaTotal());
        }
    }

    static void tambahKasir() {
        System.out.println("Tambah Data Pegawai!");
        pegawai pegawai = new pegawai();

        System.out.println("ID Pegawai         : " + String.valueOf(pegawaiArr.size() + 1));
        pegawai.setId(pegawaiArr.size() + 1);
        System.out.println("Kata Sandi Pegawai : ");
        pegawai.setNama(scan.next());
        System.out.println("Nomer HP Pegawai   : " + String.valueOf(pegawaiArr.size() + 1));
        pegawai.setNoHp(scan.next());

        pegawaiArr.add(pegawai);
    }

    static void tambahPelanggan() {
        System.out.println("Tambah Data Pelangga!");
        pelanggan pelanggan = new pelanggan();

        System.out.print("ID Pelanggan       : " + String.valueOf(pelangganArr.size() + 1));
        pelanggan.setId(pegawaiArr.size() + 1);
        System.out.print("Nama Pelanggan     : ");
        pelanggan.setNama(scan.next());
        System.out.print("Nomer HP Pelanggan : ");
        pelanggan.setNoHp(scan.next());

        pelangganArr.add(pelanggan);
    }

    static void tambahCucian() {
        System.out.println("Tambah Data Cucian!");
        cucian cucian = new cucian();

        System.out.print("ID Pegawai         : ");
        cucian.setPegawai(pegawaiArr.get(scan.nextInt() - 1));
        System.out.print("ID Pelanggan       : ");
        cucian.setPelanggan(pelangganArr.get(scan.nextInt() - 1));
        System.out.print("Berat Cucian (KG)  : ");
        cucian.setBerat(scan.nextFloat());
        System.out.print("Harga Totalnya     : " + cucian.getHargaTotal());
        cucianArr.add(cucian);

    }
}
