package in.taskoo.bahikhata.order.constant;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderStatus {
    NEW(1),
    CREATED(2),
    PROCESSING(3),
    PROCESSED(4),
    EN_SERVICE(5),
    SERVICING(6),
    DONE(7);

    private Integer id;

    @JsonValue
    public Integer getId() {
        return this.id;
    }
}