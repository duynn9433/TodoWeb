package com.duynn.todoweb.entity;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    @Size(min = 2, message = "Name must be at least 2 character")
    private String name;
    @Past(message = "Birthday must be in the past")
    private LocalDate birthDate;
}
