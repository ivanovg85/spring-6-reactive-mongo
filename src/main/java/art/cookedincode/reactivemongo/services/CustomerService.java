package art.cookedincode.reactivemongo.services;

import art.cookedincode.reactivemongo.model.CustomerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Georgi Ivanov
 */
public interface CustomerService {

    Flux<CustomerDTO> listCustomers();

    Mono<CustomerDTO> getCustomerById(String customerId);

    Mono<CustomerDTO> saveCustomer(Mono<CustomerDTO> customerDTO);

    Mono<CustomerDTO> saveCustomer(CustomerDTO customerDTO);

    Mono<CustomerDTO> updateCustomer(String cutomerId, CustomerDTO customerDTO);

    Mono<CustomerDTO> patchCustomer(String cutomerId, CustomerDTO customerDTO);

    Mono<Void> deleteCustomerById(String customerId);
}
