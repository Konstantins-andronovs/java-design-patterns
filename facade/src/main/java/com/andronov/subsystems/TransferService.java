package com.andronov.subsystems;

import com.andronov.Customer;

import javax.ejb.Stateless;


@Stateless
public class TransferService {
    public void makeTransfer(Double principle, Customer customer) {
        // Transfer principle to customer bank account
    }
}
