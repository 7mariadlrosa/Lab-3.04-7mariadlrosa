package com.ironhack.Lab3_04.repository;
import com.ironhack.Lab3_04.model.Customers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomersRepositoryTest {
    Customers customers;

    @Autowired
    private CustomersRepository customersRepository;

    @BeforeEach
    void setUp() {
        customers = new Customers("Alvaro", "Silver", 236734);
        customersRepository.save(customers);
    }

    @AfterEach
    void tearDown() {
        customersRepository.deleteAll();
    }

    @Test
    public void findAll_CustomersExist_Customers() {
        List<Customers> customersList = customersRepository.findAll();
        assertEquals(1, customersList.size());
    }

    @Test
    public void findCustomersByCustomerName_ValidCustomerName_RightCustomers() {
        Customers customers = customersRepository.findCustomersByCustomerName("Alvaro");
        assertEquals("Alvaro", customers.getCustomerName());
    }


}