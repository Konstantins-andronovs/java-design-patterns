package com.andronov.services;

import com.andronov.Customer;
import com.andronov.CustomerEvent;

import javax.annotation.Priority;
import javax.enterprise.event.ObservesAsync;

import static com.andronov.CustomerEvent.Type.ADD;
import static com.andronov.CustomerEvent.Type.REMOVE;

public class AuthenticationService {

    public void createAuthenticationCredentials(@ObservesAsync @Priority(100) @CustomerEvent(ADD) Customer customer) {
        // create authentication credentials
    }

    public void deleteAuthenticationCredentials(@ObservesAsync @CustomerEvent(REMOVE) Customer customer) {
        // delete authentication credentials
    }

}
