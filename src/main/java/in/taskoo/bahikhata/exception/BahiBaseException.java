package in.taskoo.bahikhata.exception;

import in.taskoo.bahikhata.exception.error.BahiErrorResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
public abstract class BahiBaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private BahiErrorResponse errorResponse;
}