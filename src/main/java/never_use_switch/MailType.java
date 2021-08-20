package never_use_switch;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public enum MailType {
    TYPE_1(1, new WelcomeMailHandler()), TYPE_2(2, new BDayMailHandler());
    private final int type;
    private final MailHandler mailHandler;

    public static MailType determineType(int inputType) {
        MailType[] mails = values();
        for (MailType mail : mails) {
            if (mail.type == inputType) {
                return mail;
            }
        }
        throw new IllegalStateException(inputType + " not supported");

    }

    public String mailToString() {
        return super.toString();
    }
}
