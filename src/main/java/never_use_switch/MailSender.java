package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailSender {

    public void send(MailInfo mailInfo) {
        //todo refactor this to beautiful code
        int mailType = mailInfo.getMailType();
        String mailContext = mailInfo.getContext();
        MailType.determineType(mailType).getMailHandler().send(mailContext);
    }
}
