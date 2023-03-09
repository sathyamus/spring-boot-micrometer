package com.snsystems.metrics.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Setter
@Getter
public class Employee {
    private String id;
    private String name;
    private String role;

    public Employee(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}
