package basiclombok;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@With
@Builder
public class ImmutableAddress {

    String city;
    String street;
    String zipCode;

}
