package open.gpesce.toyredis.cli.converter;

import open.gpesce.toyredis.cli.model.ToyRedisCliValue;
import open.gpesce.toyredis.core.ToyRedisValue;
import org.springframework.core.convert.converter.Converter;

public class ValueConverter implements Converter<String, ToyRedisValue> {
    @Override
    public ToyRedisValue convert(String source) {
        return ToyRedisCliValue.builder().value(source).build();
    }

}