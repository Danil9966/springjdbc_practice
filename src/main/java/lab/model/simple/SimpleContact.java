package lab.model.simple;

import lab.model.Contact;
import lombok.Data;

@Data
public class SimpleContact implements Contact {
    String type;
    String value;
}
