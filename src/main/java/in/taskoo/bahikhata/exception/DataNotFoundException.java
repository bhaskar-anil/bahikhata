package in.taskoo.bahikhata.exception;

import in.taskoo.bahikhata.exception.error.BahiErrorResponse;
import in.taskoo.bahikhata.exception.error.ErrorType;

public class DataNotFoundException extends BahiBaseException {
	private static final long serialVersionUID = 1L;

    public DataNotFoundException() {
        super(new BahiErrorResponse(ErrorType.NOT_FOUND));
    }
}