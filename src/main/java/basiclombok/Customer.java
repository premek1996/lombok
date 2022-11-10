package basiclombok;

import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private String name;
    @Singular
    private Set<Address> addresses;

    public static class CustomerBuilder {

        public CustomerBuilder name(String name) {
            this.name = name.toUpperCase();
            return this;
        }

        public CustomerBuilder nameLowerCased(String name) {
            this.name = name.toLowerCase();
            return this;
        }

    }

}
