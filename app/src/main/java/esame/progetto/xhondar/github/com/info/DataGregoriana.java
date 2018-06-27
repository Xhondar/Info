package esame.progetto.xhondar.github.com.info;

import android.icu.util.GregorianCalendar;
import android.text.format.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataGregoriana {
    Calendar calendar = Calendar.getInstance();


    public String domani(){
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd mmmm");


        String tomorrowAsString = sdf.format(tomorrow);
        return tomorrowAsString;
    }

    public String dopoDomani(){
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_YEAR, 2);
        Date tomorrow = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd mmmm");


        String tomorrowAsString = sdf.format(tomorrow);
        return tomorrowAsString;
    }

    public String dopoDomani2(){
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date tomorrow = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd mmmm");


        String tomorrowAsString = sdf.format(tomorrow);
        return tomorrowAsString;
    }


}
