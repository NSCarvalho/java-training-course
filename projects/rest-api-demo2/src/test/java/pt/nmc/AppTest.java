package pt.nmc;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pt.nmc.dictionary.Dictionary;
import pt.nmc.dictionary.HashMapDictionary;
import pt.nmc.dictionary.exceptions.WordNotFoundException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */
@ExtendWith(MockitoExtension.class)
public class AppTest
{
    @Mock
    Dictionary<String, String> stringDictionaryMock;

    //@InjectMocks
    App app;

    @Test
    void testGetValue_returnOrange() throws WordNotFoundException {

        app = new App(stringDictionaryMock);

        doNothing().when(stringDictionaryMock).add(any(), any());
        when(stringDictionaryMock.get("ORANGE")).thenReturn("Orange is Fruit");

        var result = app.getValue("ORANGE");

        Assertions.assertEquals("Orange is Fruit", result);
        //when(stringDictionaryMock.add(any(), any())).;
    }

    @Test
    void testGetValue_returnNull() throws WordNotFoundException {

        app = new App(stringDictionaryMock);

        doNothing().when(stringDictionaryMock).add(any(), any());
        when(stringDictionaryMock.get("APPLE")).thenReturn(null);

        var result = app.getValue("APPLE");

        Assertions.assertNull(result);
        //when(stringDictionaryMock.add(any(), any())).;
    }

    @Test
    void testGetValue_userRealInstance() throws WordNotFoundException {

        app = new App(new HashMapDictionary<>());

        var result = app.getValue("APPLE");

        Assertions.assertNotNull(result);
        //when(stringDictionaryMock.add(any(), any())).;
    }
}
