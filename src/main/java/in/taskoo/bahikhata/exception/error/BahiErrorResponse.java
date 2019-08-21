package in.taskoo.bahikhata.exception.error;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BahiErrorResponse implements Serializable {

    private static final long serialVersionUID = 5053304434784799806L;

    private final List<BahiError> errors = new ArrayList<>();

    public BahiErrorResponse() {
    }

    public BahiErrorResponse(BahiError error) {
        errors.add(error);
    }

    public BahiErrorResponse(final Message message, final MessageField... messageFields) {
        errors.add(new BahiError(message.getErrorCode(), message.getMessage(), messageFields));
    }

    public BahiErrorResponse(final Message message) {
        errors.add(new BahiError(message.getErrorCode(), message.getMessage()));
    }

    public void addError(final Message message, final MessageField... messageFields) {
        errors.add(new BahiError(message.getErrorCode(), message.getMessage(), messageFields));
    }

    public void addError(final Message message) {
        errors.add(new BahiError(message.getErrorCode(), message.getMessage()));
    }

    public void addError(final BahiError error) {
        errors.add(error);
    }

    public void addAllErrors(final BahiErrorResponse errorz) {
        if (Objects.isNull(errorz) || !errorz.hasErrors()) {
            return;
        }
        errors.addAll(errorz.getErrors());
    }

    public void clear() {
        errors.clear();
    }

    public List<BahiError> getErrors() {
        return errors;
    }

    public Boolean hasErrors() {
        return !errors.isEmpty();
    }

    @Override
    public String toString() {
        return "Errors [errorMessages=" + errors + "]";
    }

    
}