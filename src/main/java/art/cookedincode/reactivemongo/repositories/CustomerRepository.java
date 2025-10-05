package art.cookedincode.reactivemongo.repositories;

import art.cookedincode.reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by Georgi Ivanov
 */
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
