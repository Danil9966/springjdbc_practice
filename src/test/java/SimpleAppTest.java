import lab.model.simple.SimpleCountry;
import lab.model.simple.UsualPerson;
import lombok.experimental.FieldDefaults;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@FieldDefaults(level = PRIVATE)
public class SimpleAppTest {

    protected static final String APPLICATION_CONTEXT_XML_FILE_NAME = "classpath:application-context.xml";

    AbstractApplicationContext context;

    UsualPerson expectedPerson;

    @Before
    public void setUp() throws Exception {
        ArrayList<Object> d = new ArrayList<>();
        d.clear();
        context = new ClassPathXmlApplicationContext(
                APPLICATION_CONTEXT_XML_FILE_NAME);
        expectedPerson = getExpectedPerson();
    }

    @Test
    public void testInitPerson(){
        UsualPerson person = (UsualPerson) context.getBean("person");
        assertEquals(expectedPerson, person);
        System.out.println(person);
    }


    private UsualPerson getExpectedPerson() {
        UsualPerson person = new UsualPerson();
        person.setAge(35);
        person.setHeight(1.78F);
        person.setProgrammer(true);
        person.setFirstName("John");
        person.setLastName("Smith");
        person.setBroke(false);
        SimpleCountry country = new SimpleCountry();
        country.setCodeName("RU");
        country.setName("Russia");
        person.setCountry(country);
        List<String> contacts = new ArrayList<>();
        contacts.add("asd@asd.ru");
        contacts.add("+55 11 99999-5555");
        person.setContacts(contacts);

        return person;
    }
}
