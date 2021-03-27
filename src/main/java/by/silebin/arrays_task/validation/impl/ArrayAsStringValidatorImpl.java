package by.silebin.arrays_task.validation.impl;

import by.silebin.arrays_task.validation.ArrayAsStringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayAsStringValidatorImpl implements ArrayAsStringValidator {

    private static final String ARRAY_PATTERN = "(-?\\d+\\s+)+-?\\d+(\\s+)?";
    public static final Logger LOGGER = LogManager.getLogger(ArrayAsStringValidatorImpl.class.getName());

    @Override
    public boolean isValid(String line) {
        LOGGER.info("Validating string");
        return line.matches(ARRAY_PATTERN);
    }
}
