package com.group8.appuser;

public class AppUserFactory {
    public static AppUser createUser(String role, String firstName, String lastName, String email, String password) {
        if (role.equalsIgnoreCase("patient")) {
            return new Patient(firstName, lastName, email, password);
        } else if (role.equalsIgnoreCase("doctor")) {
            return new Doctor(firstName, lastName, email, password);
        } else {
            throw new IllegalArgumentException("Invalid role: " + role);
        }
    }
}
