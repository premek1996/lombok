package basiclombok;

public class BasicLombok {

    public static void main(String[] args) {

        var address = Address.builder()
                .street("street")
                .country("country")
                .zipCode("zipcode")
                .note("note")
                .build();

        var address2 = Address.builder()
                .street("street")
                .city("city")
                .country("country")
                .zipCode("zipcode")
                .note("note2")
                .build();

        System.out.println(address);
        System.out.println(address2);
        System.out.println(address.equals(address2));


        var metric = Pair.of("wzrost", 186);
        System.out.println(metric);


        var customer = Customer.builder()
                .name("name")
                .address(address)
                .address(address2)
                .build();

        System.out.println(customer);

        var immutableAddress = ImmutableAddress
                .builder()
                .city("city")
                .street("street")
                .zipCode("zipCode")
                .build();


        var immutableAddress2 = immutableAddress.withCity("new city")
                .withStreet("new street");

        System.out.println(immutableAddress);
        System.out.println(immutableAddress2);
        System.out.println(immutableAddress.equals(immutableAddress2));

    }

}
