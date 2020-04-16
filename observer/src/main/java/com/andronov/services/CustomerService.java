package com.andronov.services;

import com.andronov.Customer;
import com.andronov.CustomerEvent;

import javax.annotation.Priority;
import javax.enterprise.event.ObservesAsync;

import static com.andronov.CustomerEvent.Type.ADD;
import static com.andronov.CustomerEvent.Type.REMOVE;

public class CustomerService {

    public void createCustomer(@ObservesAsync @Priority(10) @CustomerEvent(ADD) Customer customer) {
        // add new customer
    }

    public void deleteCustomer(@ObservesAsync @CustomerEvent(REMOVE) Customer customer) {
        // delete customer
    }


}
