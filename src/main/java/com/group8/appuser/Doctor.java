package com.group8.appuser;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Doctor extends AppUser{
    public Doctor(String firstName, String lastName, String email, String password) {
        super(firstName,lastName,email,password);
    }
}
