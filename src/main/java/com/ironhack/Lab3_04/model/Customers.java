package com.ironhack.Lab3_04.model;
import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String customerName;
    private String customerStatus;
    private Integer customerTotalMileage;

    public Customers() {
    }

    public Customers(String customerName, String customerStatus, Integer customerTotalMileage) {
        setId();
        setCustomerName(customerName);
        setCustomerStatus(customerStatus);
        setCustomerTotalMileage(customerTotalMileage);
    }

    //SETTERS
    public void setId() {
        this.id = id;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }
    public void setCustomerTotalMileage(Integer customerTotalMileage) {
        this.customerTotalMileage = customerTotalMileage;
    }

    //GETTERS
    public Integer getId() {
        return id;
    }
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public Integer getCustomerTotalMileage() {
        return customerTotalMileage;
    }

}
