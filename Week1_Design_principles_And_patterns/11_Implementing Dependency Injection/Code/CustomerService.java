package DependencyInjection;

public class CustomerService {
    private final CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(String id) {
        String cust = repository.findCustomerById(id);
        System.out.println("Retrieved: " + cust);
    }
}
