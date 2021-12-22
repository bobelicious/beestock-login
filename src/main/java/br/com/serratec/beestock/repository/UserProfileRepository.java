package br.com.serratec.beestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.beestock.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile,Integer>{
    
}
