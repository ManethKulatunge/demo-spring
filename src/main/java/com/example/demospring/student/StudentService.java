package com.example.demospring.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        21,
                        LocalDate.of(2000, Month.JANUARY, 5)
                )
        );
    }
}
