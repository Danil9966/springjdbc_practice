package lab.model.simple;

import lab.model.Contact;
import lab.model.Country;
import lab.model.Person;
import lombok.*;
import lombok.experimental.Wither;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class UsualPerson implements Person {
    String firstName;
    String lastName;
    @Autowired
    Country country;
    int age;
    float height;
    boolean isProgrammer;
    boolean broke;

    List<String> contacts;
}
