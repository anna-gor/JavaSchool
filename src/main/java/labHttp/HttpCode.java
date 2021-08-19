package labHttp;
import lombok.Getter;

/**
 * @author Evgeny Borisov
 */

@Getter
public enum HttpCode {
    REDIRECTION(300), CLIENT_ERROR(400), SERVER_ERROR(500);
    private final int bCode;

    HttpCode(int bCode) {
        this.bCode = bCode;
    }

    public void handle(){
        System.out.println("Some logic with " + this.toString());
    }

    public static HttpCode determineCode(int httpCode) {
        HttpCode[] statuses = values();
        for (HttpCode status : statuses) {
            if ((Math.abs(status.bCode - httpCode)) < 100) {
                return status;
            }
        }
        throw new IllegalStateException(httpCode + " not supported");

    }

    public String httpToString() {
        return super.toString();
    }

}
