package advancedlombok;

import basiclombok.ImmutableAddress;

public class RecordLombok {

    public static void main(String[] args) {
        var address = new RecordAddress("city", "street", "zipCode");
        var address2 = ImmutableAddress.builder()
                .city("city")
                .street("street")
                .zipCode("zipCode")
                .build();
        System.out.println(address);
        System.out.println(address2);
    }

}
