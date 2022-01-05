package br.com.serratec.beestock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.beestock.model.Profile;
import br.com.serratec.beestock.service.ProfileService;

// @CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/profiles")
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @PostMapping
    public Profile add (@RequestBody Profile profile){
        return profileService.add(profile);
    }
}
