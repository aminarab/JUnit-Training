package com.tosan.junit.training.exceptions;

public class CustomerService {

    public Customer findByName(String name) throws NameNotFoundException {

        if ("".equals(name)) {
            throw new NameNotFoundException(666, "Name is empty!");
        }

        if ("2".equals(name)) {
            throw new NameNotFoundException(667, "Name is empty!2");
        }
        return new Customer(name);

    }

}
