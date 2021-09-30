package com.example.demo.employee;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> getEmployees() {
        return List.of(
                new Employee(
                        1L,
                        "Princess Benido",
                        "benidoprincess@gmail.com",
                        LocalDate.of(1998, 03,28),
                        23
                )

        );
    }
}
