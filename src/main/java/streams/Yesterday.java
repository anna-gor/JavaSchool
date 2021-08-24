package streams;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Yesterday {
    @SneakyThrows
    public static void main(String[] args) {

        Stream<String> lineStream = Files.lines(Path.of("./data/song.txt"));
        int count = (int) lineStream.flatMap(x -> Arrays.stream(x.split("\\s+"))).count();
        System.out.println(count);

    }

}
