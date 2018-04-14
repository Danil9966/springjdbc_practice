package lab.model.simple;

import lab.model.Country;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class SimpleCountry implements Country {
    String name;
    String codeName;


}
