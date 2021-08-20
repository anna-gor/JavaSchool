package never_use_switch;

public class WelcomeMailHandler implements MailHandler {
    @Override
    public void send(String context) {
        System.out.println("Welcome mail was sent " + context);
    }
}
