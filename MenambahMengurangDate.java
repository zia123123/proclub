import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MenambahMengurangDate {
    // Method menambah dan mengurangi waktu
    protected static Calendar tambahWaktu(Date waktuPermulaan,
                                          int jmlTambahanWaktu, String satuan) {
        /*
         * Untuk mengurangi hari gunakan nilai minus (-) pada jmlTambahanWaktu
         */
        Calendar cal = Calendar.getInstance();
        cal.setTime(waktuPermulaan);
        switch (satuan) {
            case "jam":
                cal.add(Calendar.HOUR, jmlTambahanWaktu);
                break;
        }
        return cal;
    }

    // Menampilkan Date terformat
    protected static String tampilkanTanggalDanWaktu(Date tanggalDanWaktu,
                                                     String pola, Locale lokal) {
        String tanggalStr;
        SimpleDateFormat formatter;
        if (lokal == null) {
            formatter = new SimpleDateFormat(pola);
        } else {
            formatter = new SimpleDateFormat(pola, lokal);
        }
        tanggalStr = formatter.format(tanggalDanWaktu);
        return tanggalStr;
    }

}