package pt.nmc.dictionary.exeptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pt.nmc.dictionary.exceptions.WordNotFoundException;

class WordNotFoundExceptionTest {

    private static final String ERROR = "Error";

    @Test
    @DisplayName("Create an instance without cause successfully")
    void testWordNotFoundException_createAnInstanceWithoutCause(){

        var instance = new WordNotFoundException(ERROR);

        Assertions.assertNull(instance.getCause(), "Exception is empty");
        Assertions.assertEquals(ERROR, instance.getMessage(), "Message equals to Error");
    }

    @Test
    @DisplayName("Create an instance with cause successfully")
    void testWordNotFoundException_createAnInstanceWithCause(){

        var exceptionMock = new Exception();
        var instance = new WordNotFoundException(ERROR, exceptionMock);

        Assertions.assertNotNull(instance.getCause(), "Exception contains a cause");
        Assertions.assertInstanceOf(Exception.class, instance.getCause(), "Cause must be an Exception.class");
        Assertions.assertEquals(ERROR, instance.getMessage(), "Message equals to Error");
    }
}
