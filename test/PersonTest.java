package isen.library;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
    }

    @Test
    public void testSetName() {
        person.setName("John");
        assertEquals("John", person.getName());
    }

    @Test
    public void testSetYears() {
        person.setYears(30);
        assertEquals(30, person.getYears());
    }
}
