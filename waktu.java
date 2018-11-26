import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Random;

public class waktu {

    public static String getWaktu(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }

    protected static String tampilkanTanggalDanWaktu(Date tanggalDanWaktu,
                                                     String pola, Locale lokal) {
        String tanggalStr = null;
        SimpleDateFormat formatter = null;
        if (lokal == null) {
            formatter = new SimpleDateFormat(pola);
        } else {
            formatter = new SimpleDateFormat(pola, lokal);
        }

        tanggalStr = formatter.format(tanggalDanWaktu);
        return tanggalStr;
    }

    static Date waktu1(){
        String pola = null;
        Locale lokal = new Locale("id", "ID");
        String hasil = null;
        Date tanggalDan  = new Date();
        pola = "EEEE, dd MMMM, yyyy";
        hasil = tampilkanTanggalDanWaktu(
                tanggalDan, pola, lokal);
        System.out.println("Waktu Sekarang " + "\t ---> " + hasil);
        return tanggalDan;
    }

    public Date waktu2() {
        String pola = null;
        Locale lokal = new Locale("de", "DE");
        String hasil = null;
        Date tanggalDan  = new Date();
        pola = "EEEE, dd MMMM, yyyy";
        hasil = tampilkanTanggalDanWaktu(
                tanggalDan, pola, lokal);
        System.out.println("Waktu Sekarang " + "\t ---> " + hasil);
        return tanggalDan;
    }

    public Date waktu3() {
        String pola = null;
        Locale lokal = new Locale("fr", "FR");
        String hasil = null;
        Date tanggalDan  = new Date();
        pola = "EEEE, dd MMMM, yyyy";
        hasil = tampilkanTanggalDanWaktu(
                tanggalDan, pola, lokal);
        System.out.println("Waktu Sekarang " + "\t ---> " + hasil);
        return tanggalDan;
    }

    public static void anyRandomInt(Random random) {
        int randomInt = random.nextInt();
        System.out.println("random integer:" + randomInt);
    }


}