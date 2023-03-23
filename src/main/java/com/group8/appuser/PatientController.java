package com.group8.appuser;

import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/patient")
@AllArgsConstructor
public class PatientController {
    private AppUserService appUserService;
    @GetMapping("/home")
    public String showHomePage(Authentication authentication, Model model) {
        // retrieve the user's information from the Authentication object
        String username = authentication.getName();

        UserDetails userDetails = appUserService.loadUserByUsername(username);
        AppUser appUser = (AppUser) userDetails;
        System.out.println(appUser.getClass().getSimpleName());
        // add the user's information to the model
        model.addAttribute("fName",appUser.getFirstName());

        return "patientHome"; // returns the name of your home page HTML template
    }
}