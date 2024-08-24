package com.example.EmployeeManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type; // e.g., home, work
    private String address;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Address(long id)
    {
        this.id=id;
    }
}
