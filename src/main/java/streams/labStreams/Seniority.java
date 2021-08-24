package streams.labStreams;

import lombok.*;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Seniority {
    JUN(Integer.MIN_VALUE,9),MIDDLE(10,19),SENIOR(20,Integer.MAX_VALUE);
    //jun <10
    //middle >10  <20
    //senior >20
    int min;
    int max;

    public static Seniority determineSeniority(int salary) {
        return Arrays.stream(values())
                .filter(seniority -> seniority.min <= salary)
                .filter(seniority -> seniority.max >= salary)
                .findAny()
                .get();

    }

}
