package com.example.dragonflybackend.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomerTest {

    private EntityManager entityManager;

    @BeforeEach
    public void setUp() {
        entityManager = Persistence.createEntityManagerFactory("your-persistence-unit-name").createEntityManager();
    }

    @AfterEach
    public void tearDown() {
        entityManager.close();
    }

    @Test
    public void testCustomerCreation() {
        Customer customer = new Customer();
        assertNotNull(customer);
        customer.setFirstName("Danilo");
        customer.setLastName("Doe");
        customer.setFullName("John Doe");
        customer.setUserPassword("hashedPassword");
        customer.setCreatedAt(LocalDateTime.now());
    }
}
