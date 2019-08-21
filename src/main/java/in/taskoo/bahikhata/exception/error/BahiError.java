package in.taskoo.bahikhata.exception.error;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import lombok.Data;

@Data
public class BahiError implements Serializable {

    private static final long serialVersionUID = -5089213750918504980L;

    private String errorCode;

    private String message;

    private String placeholderMessage;

    private Map<String, String> messageFieldsMap;

    public BahiError(final String code, final String placeholderMessage, final MessageField... messageFields) {
        this.errorCode = code;
        this.message = getMessage(placeholderMessage, messageFields);
        this.placeholderMessage = placeholderMessage;
        this.messageFieldsMap = buildFieldsMap(messageFields);
    }

    private Map<String, String> buildFieldsMap(final MessageField... messageFields) {
        if (Objects.nonNull(messageFields)) {
            this.messageFieldsMap = new HashMap<>();
            for (MessageField messageField : messageFields) {
                this.messageFieldsMap.put(messageField.getField(), messageField.getValue().toString());
            }
        }
        return this.messageFieldsMap;
    }

    public String getMessage(String placeholderMessage, final MessageField... messageFields) {
        if (Objects.isNull(messageFields)) {
            return placeholderMessage;
        }
        for (final MessageField messageField : messageFields) {
            final String placeholderString = "{" + messageField.getField() + "}";
            placeholderMessage = placeholderMessage.replace(placeholderString,
                Objects.isNull(messageField.getValue()) ? "null" : messageField.getValue().toString());
        }
        return placeholderMessage;
    }

    @Override
    public String toString() {
        return "Error [" + errorCode + " : " + message + "]";
    }
}