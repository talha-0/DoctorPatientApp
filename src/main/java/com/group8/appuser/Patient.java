package com.group8.appuser;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@Entity
public class Patient extends AppUser {
    public Patient(String firstName, String lastName, String email, String password) {
        super(firstName,lastName,email,password);
    }
}