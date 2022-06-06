package basePackage.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseException extends RuntimeException {

    private final String mensagem;

    public BaseException(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

}