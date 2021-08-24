package streams.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {

        LocalDate startDate = LocalDate.of(startYear, 1, 1);
        LocalDate endDate = LocalDate.of(endYear, 12, 31);


        Stream.iterate(startDate, d -> d.plusDays(1))
                .limit(ChronoUnit.DAYS.between(startDate, endDate) + 1)
                .filter(d -> d.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                .filter(d -> d.getDayOfMonth() == 13)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

    }

    public static void main(String[] args) {
        int startYear = 2012;
        int endYear = 2020;
        printBlackFridayPerYearSorted(startYear, endYear);
    }
}
