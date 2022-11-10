package advancedlombok;

import basiclombok.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Cleanup;
import lombok.NonNull;
import lombok.SneakyThrows;

public class AdvancedLombok {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void main(String[] args) {
        sneakyThrowsExample();
        cleanupExample();
        lazyGetterExample();
    }

    private static void sneakyThrowsExample() {
        var json = """             
                {
                        "name":"Adam",
                        "addresses":[]       
                }
                """;
        var customer = jsonToCustomer(json);
        System.out.println(customer);
    }

    @SneakyThrows
    private static Customer jsonToCustomer(@NonNull String json) {
        return OBJECT_MAPPER.readValue(json, Customer.class);
    }

    @SneakyThrows
    private static void cleanupExample() {
        @Cleanup var inputStream = AdvancedLombok.class.getClassLoader()
                .getResourceAsStream("customer.json");
        var customer = OBJECT_MAPPER.readValue(inputStream, Customer.class);
        System.out.println(customer);
    }

    private static void lazyGetterExample() {
        var crmContracts = new CrmContracts();
        System.out.println(crmContracts.getNumbers());
        System.out.println(crmContracts.getNumbers());
        System.out.println(crmContracts.getNumbers());
        System.out.println(crmContracts.getNumbers());
    }

}
