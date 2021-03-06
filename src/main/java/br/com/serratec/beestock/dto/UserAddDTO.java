package br.com.serratec.beestock.dto;

import java.util.*;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import br.com.serratec.beestock.model.Address;
import br.com.serratec.beestock.model.Photo;
import br.com.serratec.beestock.model.UserProfile;

public class UserAddDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    @CPF
    private String cpf;

    @NotBlank
    private String rg;

    @NotBlank
    private String phone;

    @NotBlank
    private String password;

    private Address address;

    private Photo photo;

    private Set<UserProfile> userProfiles = new HashSet<>();

    public UserAddDTO() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<UserProfile> getUserProfiles() {
        return userProfiles;
    }

    public void setUserProfiles(Set<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

}
