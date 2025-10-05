package art.cookedincode.reactivemongo.mappers;

import art.cookedincode.reactivemongo.domain.Customer;
import art.cookedincode.reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * Created by Georgi Ivanov
 */
@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
