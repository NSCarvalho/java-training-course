package pt.nmc.dictionary;

import org.junit.jupiter.api.*;
import pt.nmc.dictionary.exceptions.WordNotFoundException;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HashMapDictionaryTest {

    private static final String ORANGE = "Orange";
    private static final String APPLE = "Apple";
    private static final String APPLE_IS_A_FRUIT = "Apple is a fruit";
    public static final String KEY_DOES_NOT_EXISTS = "key does not exists";
    //private Dictionary<String, String> stringStringDictionary;

    @BeforeAll
    static void init(){
        // stringStringDictionary = new HashMapDictionary<>();
    }

    @Test
    @DisplayName("Add a new element (APPLE) successfully")
    void testAdd_addAppleSuccessfully(){
        var stringStringDictionary = new HashMapDictionary<>();

        stringStringDictionary.add(APPLE, APPLE_IS_A_FRUIT);

        Assertions.assertDoesNotThrow(() -> stringStringDictionary.get(APPLE));
    }

    @Test
    @DisplayName("Throw WordNotFoundException because ORANGE does not exists")
    void testGet_throwWordNotFoundException(){
        var stringStringDictionary = new HashMapDictionary<>();

        var exception = Assertions.assertThrows(WordNotFoundException.class,
                () -> stringStringDictionary.get(ORANGE));

        Assertions.assertEquals(KEY_DOES_NOT_EXISTS, exception.getMessage(), "Expected error message");
    }

    @Test
    @DisplayName("Remove APPLE successfully")
    void testRemove_elementSuccessfully(){
        var stringStringDictionary = new HashMapDictionary<>();
        stringStringDictionary.add(APPLE, APPLE_IS_A_FRUIT);

        Assertions.assertDoesNotThrow(() -> stringStringDictionary.remove(APPLE));

        var exception = Assertions.assertThrows(WordNotFoundException.class,
                () -> stringStringDictionary.get(APPLE));
        Assertions.assertEquals(KEY_DOES_NOT_EXISTS, exception.getMessage(), "Expected error message");
    }

}
