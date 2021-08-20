package labDate;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("=yyyy~MM~dd=");

    public static Date convertStringToDate(String stringDate) throws ParseException {
        Date date=dateFormat.parse(stringDate);
        return date;

    }
    public static String convertDateToString(Date date) {
        String strDate = dateFormat.format(date);
        return strDate;
    }

}
