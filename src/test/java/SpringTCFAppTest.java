import java.util.ArrayList;
import java.util.List;
import lab.model.simple.SimpleCountry;
import lab.model.simple.UsualPerson;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class SpringTCFAppTest {

    @Autowired
    private UsualPerson person;

    private UsualPerson expectedPerson;


    @Before
    public void setUp() throws Exception {
        expectedPerson = getExpectedPerson();
    }

    @Test
    public void testInitPerson() {
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
        country.setName("Russia");
        country.setCodeName("RU");

        person.setCountry(country);

        List<String> contacts = new ArrayList<>();
        contacts.add("asd@asd.ru");
        contacts.add("+55 11 99999-5555");

        person.setContacts(contacts);
        return person;
    }

}
