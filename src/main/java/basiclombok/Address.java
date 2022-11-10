package basiclombok;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@Builder
@EqualsAndHashCode(exclude = "note")
public class Address {

    @Builder.Default
    private String city = "Warsaw";
    private String street;
    @NonNull
    private String zipCode;
    private String country;
    private String note;

}
