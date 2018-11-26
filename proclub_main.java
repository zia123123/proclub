
import java.util.Scanner;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.util.Random;

public class proclub_main{

    public static void main(String[] args) {
        Random rand = new Random();
        int a, b, c, pilihan, kereta, jalur, bahasa;
        String user, pass = null;
        boolean ulang, ulang2;
        ulang = true;
        ulang2 = true;
        String yt;
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (ulang == true) {
            System.out.print("Masukann Username :");
            user = scan.next();
            System.out.print("Masukkan Password :");
            pass = scan.next();
            String hasil1 = password.rot13(pass);
            if (hasil1.equals(password.input)) {
                System.out.println("Selamat datang di program Kami");
                System.out.println("Masukan Bahasa : \n" +
                        "1. Bahasa Indonesia \n" +
                        "2. Bahasa Germany \n" +
                        "3. Bahasa Francis");
                bahasa = scan.nextInt();
                if (bahasa == 1) {
                    waktu waktus = new waktu();
                    Date waktun = waktus.waktu1();
                }
                if (bahasa == 2) {
                    waktu waktus = new waktu();
                    Date waktun = waktus.waktu2();

                }
                if (bahasa == 3) {
                    waktu waktus = new waktu();
                    Date waktun = waktus.waktu3();

                }
                while (ulang2 == true) {
                    System.out.println("========= Menu ========");
                    System.out.println("1. Rumus Persegi");
                    System.out.println("2. Rumus Persegi Panjang");
                    System.out.println("3. Rumus Segitiga");
                    System.out.println("4. Terminal Bus Pt.Zia");
                    System.out.println("Pilihan anda : ");
                    pilihan = scan.nextInt();
                    if (pilihan == 1) {
                        System.out.println("Masukan sisi");
                        a = scan.nextInt();
                        persegi persegi = new persegi();
                        System.out.println("Luas Pesegi :" +persegi.persegi1(a));
                        System.out.println("Keliling Persegi :" + persegi.persegi2(a));
                    } else if (pilihan == 2) {
                        System.out.println("Masukan Panjang");
                        a = scan.nextInt();
                        System.out.println("Masukan Lebar");
                        b = scan.nextInt();
                        persegi persegi = new persegi();
                        System.out.println("Luas Pesegi Panjang :" +persegi.persegipjg(a, b));
                        System.out.println("Keliling Persegi Panjang :" + persegi.persegipjg2(a, b
                        ));

                    } else if (pilihan == 3) {
                        System.out.println("Masukan Panjang");
                        a = scan.nextInt();
                        System.out.println("Masukan tinggi ");
                        c = scan.nextInt();
                        System.out.println("Masukan Lebar");
                        b = scan.nextInt();
                        segitiga segitiga = new segitiga();
                        System.out.println("Luas segitiga :" +segitiga.segitiga(a, b, c));
                        System.out.println("Keliling segitiga :" +segitiga.segitiga2(a, b));
                    } else if (pilihan == 4) {
                        System.out.println("*********************************\n" +
                                "* Selamat Datang di Terminal Zia*\n" +
                                "*********************************\n" +
                                "* Tipe BIS :                **\n" +
                                "* 1. Bisnis                    **\n" +
                                "* 2. Ekonomi                   **\n" +
                                "*********************************");
                        System.out.print("Silahkan Pilih Tipe BIS :");
                        kereta = scan.nextInt();
                        if (kereta == 1) {
                            System.out.println("*********************************\n" +
                                    "* BIS Tipes Bisnis           *\n" +
                                    "*********************************\n" +
                                    "* Jalur BIS :                  **\n" +
                                    "* 1. Bandung - Purwakarta      **\n" +
                                    "* 2. Bandung - Bekas           **\n" +
                                    "* 3. Bandung - Jakarta         **\n" +
                                    "*********************************");
                            System.out.print("Silahkan Pilih Jalur BIS :");
                            jalur = scan.nextInt();
                            if (jalur == 1) {
                                for (int j = 0; j < 5; j++) ;
                                Locale lokal = null;
                                String pola = "HH:mm";
                                Date waktuPermulaan = new Date();
                                String satuan;
                                int jmlTambahanWaktu = 2;
                                satuan = "jam";
                                Calendar cal = MenambahMengurangDate.tambahWaktu(waktuPermulaan,
                                        jmlTambahanWaktu, satuan);
                                String tanggalStr = MenambahMengurangDate.tampilkanTanggalDanWaktu(
                                        cal.getTime(), pola, lokal);
                                System.out.print("Masukan Jumlah Penumpang :");
                                b = scan.nextInt();
                                TerminalFunction bdgpwt = new TerminalFunction();
                                int hasil = bdgpwt.BdgPwtB(b);
                                System.out.println("*********************************\n" +
                                        "* Tiket Pesanan Anda           **\n" +
                                        "*********************************\n" +
                                        "* ID Tiket : " + rand.nextInt(Integer.MAX_VALUE) + "        **\n" +
                                        "* Jalur :Bandung - Purwakarta  **\n" +
                                        "* Jumlah Penumpang : " + b + "         **\n" +
                                        "* Jarak Perjalanan : 20 Km     **\n" +
                                        "* Estimasi : " + waktu.getWaktu() + " ==> " + tanggalStr + "   **\n" +
                                        "* Harga    : Rp " + hasil + "            **\n" +
                                        "*********************************");

                            }
                            if (jalur == 2) {
                                for (int j = 0; j < 5; j++) ;
                                Locale lokal = null;
                                String pola = "HH:mm";
                                Date waktuPermulaan = new Date();
                                String satuan;
                                int jmlTambahanWaktu = 4;
                                satuan = "jam";
                                Calendar cal = MenambahMengurangDate.tambahWaktu(waktuPermulaan,
                                        jmlTambahanWaktu, satuan);
                                String tanggalStr = MenambahMengurangDate.tampilkanTanggalDanWaktu(
                                        cal.getTime(), pola, lokal);
                                System.out.print("Masukan Jumlah Penumpang :");
                                b = scan.nextInt();
                                TerminalFunction bdgbks = new TerminalFunction();
                                int hasil = bdgbks.BdgBksB(b);
                                System.out.println("*********************************\n" +
                                        "* Tiket Pesanan Anda           **\n" +
                                        "*********************************\n" +
                                        "* ID Tiket : " + rand.nextInt(Integer.MAX_VALUE) + "        **\n" +
                                        "* Jalur :Bandung - Bekasi      **\n" +
                                        "* Jumlah Penumpang : " + b + "         **\n" +
                                        "* Jarak Perjalanan : 40 Km     **\n" +
                                        "* Estimasi : " + waktu.getWaktu() + " ==> " + tanggalStr + "   **\n" +
                                        "* Harga    : Rp " + hasil + "            **\n" +
                                        "*********************************");

                            }
                            if (jalur == 3) {
                                for (int j = 0; j < 5; j++) ;
                                Locale lokal = null;
                                String pola = "HH:mm";
                                Date waktuPermulaan = new Date();
                                String satuan;
                                int jmlTambahanWaktu = 5;
                                satuan = "jam";
                                Calendar cal = MenambahMengurangDate.tambahWaktu(waktuPermulaan,
                                        jmlTambahanWaktu, satuan);
                                String tanggalStr = MenambahMengurangDate.tampilkanTanggalDanWaktu(
                                        cal.getTime(), pola, lokal);
                                System.out.print("Masukan Jumlah Penumpang :");
                                b = scan.nextInt();
                                TerminalFunction bdgjkt = new TerminalFunction();
                                int hasil = bdgjkt.BdgJktB(b);
                                System.out.println("*********************************\n" +
                                        "* Tiket Pesanan Anda           **\n" +
                                        "*********************************\n" +
                                        "* ID Tiket : " + rand.nextInt(Integer.MAX_VALUE) + "        **\n" +
                                        "* Jalur :Bandung - Jakarta      **\n" +
                                        "* Jumlah Penumpang : " + b + "         **\n" +
                                        "* Jarak Perjalanan : 60 Km     **\n" +
                                        "* Estimasi : " + waktu.getWaktu() + " ==> " + tanggalStr + "   **\n" +
                                        "* Harga    : Rp " + hasil + "            **\n" +
                                        "*********************************");
                            }

                        }
                        if (kereta == 2) {
                            System.out.println("*********************************\n" +
                                    "* BIS Tipe Ekonomi           *\n" +
                                    "*********************************\n" +
                                    "* Jalur Kereta :               **\n" +
                                    "* 1. Bandung - Purwakarta      **\n" +
                                    "* 2. Bandung - Bekas           **\n" +
                                    "* 3. Bandung - Jakarta         **\n" +
                                    "*********************************");
                            System.out.print("Silahkan Pilih Jalur BIS :");
                            jalur = scan.nextInt();
                            if (jalur == 1) {
                                for (int j = 0; j < 5; j++) ;
                                Locale lokal = null;
                                String pola = "HH:mm";
                                Date waktuPermulaan = new Date();
                                String satuan;
                                int jmlTambahanWaktu = 3;
                                satuan = "jam";
                                Calendar cal = MenambahMengurangDate.tambahWaktu(waktuPermulaan,
                                        jmlTambahanWaktu, satuan);
                                String tanggalStr = MenambahMengurangDate.tampilkanTanggalDanWaktu(
                                        cal.getTime(), pola, lokal);
                                System.out.print("Masukan Jumlah Penumpang :");
                                b = scan.nextInt();
                                TerminalFunction bdgpwt = new TerminalFunction();
                                int hasil = bdgpwt.BdgPwtE(b);
                                System.out.println("*********************************\n" +
                                        "* Tiket Pesanan Anda           **\n" +
                                        "*********************************\n" +
                                        "* ID Tiket : " + rand.nextInt(Integer.MAX_VALUE) + "        **\n" +
                                        "* Jalur :Bandung - Purwakarta  **\n" +
                                        "* Jumlah Penumpang : " + b + "         **\n" +
                                        "* Jarak Perjalanan : 20 Km     **\n" +
                                        "* Estimasi : " + waktu.getWaktu() + " ==> " + tanggalStr + "   **\n" +
                                        "* Harga    : Rp " + hasil + "            **\n" +
                                        "*********************************");

                            }
                            if (jalur == 2) {
                                for (int j = 0; j < 5; j++) ;
                                Locale lokal = null;
                                String pola = "HH:mm";
                                Date waktuPermulaan = new Date();
                                String satuan;
                                int jmlTambahanWaktu = 5;
                                satuan = "jam";
                                Calendar cal = MenambahMengurangDate.tambahWaktu(waktuPermulaan,
                                        jmlTambahanWaktu, satuan);
                                String tanggalStr = MenambahMengurangDate.tampilkanTanggalDanWaktu(
                                        cal.getTime(), pola, lokal);
                                System.out.print("Masukan Jumlah Penumpang :");
                                b = scan.nextInt();
                                TerminalFunction bdgbks = new TerminalFunction();
                                int hasil = bdgbks.BdgBksE(b);
                                System.out.println("*********************************\n" +
                                        "* Tiket Pesanan Anda           **\n" +
                                        "*********************************\n" +
                                        "* ID Tiket : " + rand.nextInt(Integer.MAX_VALUE) + "        **\n" +
                                        "* Jalur :Bandung - Bekasi      **\n" +
                                        "* Jumlah Penumpang : " + b + "         **\n" +
                                        "* Jarak Perjalanan : 40 Km     **\n" +
                                        "* Estimasi : " + waktu.getWaktu() + " ==> " + tanggalStr + "   **\n" +
                                        "* Harga    : Rp " + hasil + "            **\n" +
                                        "*********************************");

                            }
                            if (jalur == 3) {
                                for (int j = 0; j < 5; j++) ;
                                Locale lokal = null;
                                String pola = "HH:mm";
                                Date waktuPermulaan = new Date();
                                String satuan;
                                int jmlTambahanWaktu = 6;
                                satuan = "jam";
                                Calendar cal = MenambahMengurangDate.tambahWaktu(waktuPermulaan,
                                        jmlTambahanWaktu, satuan);
                                String tanggalStr = MenambahMengurangDate.tampilkanTanggalDanWaktu(
                                        cal.getTime(), pola, lokal);
                                System.out.print("Masukan Jumlah Penumpang :");
                                b = scan.nextInt();
                                TerminalFunction bdgjkt = new TerminalFunction();
                                int hasil = bdgjkt.BdgJktE(b);
                                System.out.println("*********************************\n" +
                                        "* Tiket Pesanan Anda           **\n" +
                                        "*********************************\n" +
                                        "* ID Tiket : " + rand.nextInt(Integer.MAX_VALUE) + "        **\n" +
                                        "* Jalur :Bandung - Jakarta      **\n" +
                                        "* Jumlah Penumpang : " + b + "         **\n" +
                                        "* Jarak Perjalanan : 60 Km     **\n" +
                                        "* Estimasi : " + waktu.getWaktu() + " ==> " + tanggalStr + "   **\n" +
                                        "* Harga    : Rp " + hasil + "            **\n" +
                                        "*********************************");
                            }


                        }
                    } else {
                        System.out.println(" Maaf input yang anda masukkan salah");

                    }


                    System.out.println(" Mau ulangi lagi  y/t ? ");

                    yt = scan.next();
                    if (yt.equals("y")) {
                        ulang2 = true;

                    } else {
                        ulang2 = false;

                    }
                }

            } else {
                System.out.println("Maaf Password salah");
                n++;
            }
            System.out.println();
            if (n >= 3) {
                ulang = false;
            }

        }
    }
    }

