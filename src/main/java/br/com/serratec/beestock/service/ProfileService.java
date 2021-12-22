package br.com.serratec.beestock.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.beestock.model.Profile;
import br.com.serratec.beestock.repository.ProfileRepository;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository perfilRepository;

    public Profile find(Integer id){
        Optional<Profile> perfil = perfilRepository.findById(id);
        return perfil.get();
    }
}
