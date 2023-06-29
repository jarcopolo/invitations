package jarcopolo.invitations.logic;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Locale;

public class DateAndTime {

    private static HashMap<String, LocalDate> days = new HashMap<String, LocalDate>();


    public static String getDayName(int daysFromToday)
    {
        LocalDate day = LocalDate.now().plusDays(daysFromToday);
        String dayName = day.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());


        String label = switch (daysFromToday)
        {
            case 0 -> "dzisiaj ("+dayName+")";
            case 1 -> "jutro ("+dayName+")";
            case 2,3,4,5,6 -> dayName;
            default -> "brak";
        };
        days.put(label, day);

        return label;
    }




}
