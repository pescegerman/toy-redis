package open.gpesce.toyredis.cli.model;

import lombok.Builder;
import lombok.Data;
import open.gpesce.toyredis.core.model.ToyRedisValue;

@Data
@Builder
public class ToyRedisCliValue implements ToyRedisValue {
    private Object value;

    public String toString(){
        return value.toString();
    }
}
