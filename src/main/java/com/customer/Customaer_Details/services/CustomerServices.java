package com.customer.Customaer_Details.services;



@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public Customer updateCustomer(Long id, Customer customer) {
        Customer existingCustomer = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
        existingCustomer.setFirstName(customer.getFirstName());
        existingCustomer.setLastName(customer.getLastName());
        existingCustomer.setStreet(customer.getStreet());
        existingCustomer.setAddress(customer.getAddress());
        existingCustomer.setCity(customer.getCity());
        existingCustomer.setState(customer.getState());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhone(customer.getPhone());
        return repository.save(existingCustomer);
    }

    public List<Customer> getCustomers(Pageable pageable) {
        return repository.findAll(pageable).getContent();
    }

    public Customer getCustomerById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
    }

    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }
}

