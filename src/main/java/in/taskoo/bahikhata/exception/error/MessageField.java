package in.taskoo.bahikhata.exception.error;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageField implements Serializable {
    private static final long serialVersionUID = 5196811248969569320L;
    
    private String field;
    private String value;    
}