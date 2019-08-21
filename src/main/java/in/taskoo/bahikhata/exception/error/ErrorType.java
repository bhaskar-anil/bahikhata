package in.taskoo.bahikhata.exception.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorType implements Message {
    NOT_FOUND("BK-1001", "The data you are looking for is not found");

    private String errorCode;
    private String message;
}