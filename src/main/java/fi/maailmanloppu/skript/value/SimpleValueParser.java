package fi.maailmanloppu.skript.value;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.objectweb.asm.MethodVisitor;

/**
 * A simple value parser, which calls for {@link ValueType}s.
 * @author bensku
 *
 */
public class SimpleValueParser implements ValueParser {
    
    private List<ValueType> valueTypes;
    
    public SimpleValueParser() {
        this.valueTypes = new ArrayList<ValueType>();
    }
    
    public void addValueType(ValueType type) {
        valueTypes.add(type);
    }

    @Override
    public Optional<ValueType> getValueType(String code) {
        for (ValueType type : valueTypes) {
            if (type.accepts(code)) {
                return Optional.of(type);
            }
        }
        
        return Optional.empty();
    }
    
}
