package DependencyInjection;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl(); // Concrete dependency
        CustomerService service = new CustomerService(repo);    // Injected via constructor

        service.displayCustomer("C530");
    }
}
