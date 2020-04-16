package com.andronov.services;

import com.andronov.Customer;
import com.andronov.CustomerEvent;

import javax.annotation.Priority;
import javax.enterprise.event.ObservesAsync;

import static com.andronov.CustomerEvent.Type.ADD;
import static com.andronov.CustomerEvent.Type.REMOVE;

public class EmailService {

    public void sendWelcomeEmail(@ObservesAsync @Priority(1000) @CustomerEvent(ADD) Customer customer) {
        // send welcome email
    }

    public void sendGoodbyeEmail(@ObservesAsync @CustomerEvent(REMOVE) Customer customer) {
        // send goodbye email
    }

}
