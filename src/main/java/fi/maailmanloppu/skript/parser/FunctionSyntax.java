package fi.maailmanloppu.skript.parser;

import java.util.List;


/**
 * Base syntax of function.
 * @author bensku
 *
 */
public interface FunctionSyntax {
    /**
     * Gets all tasks for this line.
     * @param line
     * @return
     */
    List<CallTask> getTasks(String line);
}
