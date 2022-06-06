package basePackage.exceptions;

import org.springframework.http.HttpStatus;

public class ServiceException extends BaseException {

    public ServiceException(String mensagem) {
        super(mensagem);
    }

    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }
}
