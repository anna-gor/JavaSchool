package never_use_switch;

public class BDayMailHandler implements MailHandler {
    @Override
    public void send(String context) {
        System.out.println("Happy Birthdate mail was sent "+context);
    }
}
