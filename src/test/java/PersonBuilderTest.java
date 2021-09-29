import Persons.PersonBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonBuilderTest {

    private static PersonBuilder personBuilder;

    @BeforeEach
    public void createClass(){
        personBuilder = new PersonBuilder();
    }
    @Test
    public void setAge() {
        int age = -100;//throws IllegalArgumentException
        Throwable thrown = assertThrows(
                IllegalArgumentException.class,
                () -> personBuilder.setAge(age));

        assertNotNull(thrown.getMessage());
    }

    @Test
    public void build() {
        //throws IllegalStateException
        Throwable thrown = assertThrows(
                IllegalStateException.class,
                () -> personBuilder.build());

        assertNotNull(thrown.getMessage());
    }
}