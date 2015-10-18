package fi.maailmanloppu.skript.parser;

import java.util.Optional;

/**
 * Base of functions.
 * @author bensku
 *
 */
public interface Function {
    
    /**
     * Calls function. Remember, calling functions from Java is usually bad
     * idea, since it is pretty slow.
     * @param args Argument(s) for function
     * @return Result(s) from function
     */
    public Optional<Object> call(Object args);
    
    /**
     * Gets name of this function
     * @return Name of function or empty string
     */
    public String getName();
}
