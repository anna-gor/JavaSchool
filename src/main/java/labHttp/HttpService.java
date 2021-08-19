package labHttp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HttpService {
    private int Code;
    private HttpCode httpCode;

    public static void handleHttpCode(int httpCode) {
        HttpCode response = HttpCode.determineCode(httpCode);
        System.out.println(httpCode + " " + response.httpToString());
        response.handle();
    }

    public static void main(String[] args) {
        HttpService service = new HttpService();
        service.handleHttpCode(399);
    }

}
