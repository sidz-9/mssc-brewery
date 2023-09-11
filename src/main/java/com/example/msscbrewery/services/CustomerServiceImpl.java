package com.example.msscbrewery.services;

import com.example.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Harry Potter")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {

        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("HermioneGranger")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // todo - to update customer info in db
        log.info("Customer entry updated");
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        // todo - to delete a customer
        log.info(customerId.toString() + " Customer entry deleted");
    }
}
