package lab2;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Client client = Client.builder()
                .bonus(30)
                .name("Vasya")
                .salary(200000)
                .debt(8)
                .build();

        System.out.println(client);

    }








































}

