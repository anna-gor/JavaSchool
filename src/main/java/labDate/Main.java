package labDate;

import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String stringDate = "=2000~06~07=";
        Date date = DateUtils.convertStringToDate(stringDate);
        System.out.println(date);
        System.out.println(DateUtils.convertDateToString(date));

    }
}
