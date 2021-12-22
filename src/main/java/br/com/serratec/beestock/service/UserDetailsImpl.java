package br.com.serratec.beestock.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.serratec.beestock.model.UserModel;
import br.com.serratec.beestock.repository.UserRepository;
import br.com.serratec.beestock.security.UserDetailsSecurity;

@Service
public class UserDetailsImpl implements UserDetailsService {
    @Autowired
    private UserRepository usuarioRepository;

    public UserDetailsImpl(UserRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String cpf) throws UsernameNotFoundException {
        Optional<UserModel> usuario = usuarioRepository.findByCpf(cpf);

        if(!usuario.isPresent()){
            throw new RuntimeException();
        }
        return new UserDetailsSecurity(usuario);
    }

}
