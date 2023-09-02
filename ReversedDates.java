import java.text.SimpleDateFormat;
import java.util.Date;

public class ReversedDates {
    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        for (int year = fromYear; year < toYear; year++) {
            int reversedYear = reverseYear(year);

            String dateStr = String.format("%d%04d", year, reversedYear);

            try {
                Date date = sdf.parse(dateStr);
                if (dateStr.equals(sdf.format(date))) {
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
                }
            } catch (Exception e) {
                // Ignore parsing exceptions
            }
        }
    }

    public static int reverseYear(int year) {
        return Integer.parseInt(new StringBuilder(Integer.toString(year)).reverse().toString());
    }
}
