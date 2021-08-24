package streams.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {

        LocalDate startDate = LocalDate.of(startYear, 1, 1);
        LocalDate endDate = LocalDate.of(endYear, 12, 31);

        Map<Object, Long> notSorted = Stream.iterate(startDate, d -> d.plusDays(1))
                .limit(ChronoUnit.DAYS.between(startDate, endDate) + 1)
                .filter(d -> d.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                .filter(d -> d.getDayOfMonth() == 13).collect(Collectors.groupingBy(d -> d.getYear(), Collectors.counting()));
        Map<Object, Long> finalResult = new LinkedHashMap<>();
        notSorted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(e -> finalResult.put(e.getKey(), e.getValue()));
        finalResult.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

        // 1972 - 3
        // 1984 - 3
        // 1986 - 3
        // 1902 - 3
        // 1901 - 2
        // 1917 - 2
        // 1915 - 2
        // 1911 - 1
    }

    public static void main(String[] args) {
        int startYear = 2012;
        int endYear = 2020;
        printBlackFridayPerYearSorted(startYear, endYear);
    }
}
