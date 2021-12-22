package br.com.serratec.beestock.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.com.serratec.beestock.dto.UserAddDTO;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user")
    private Integer id;

    @Column
    @NotBlank(message = "campo precisa ser preenchido")
    private String cpf;

    @Column
    private String rg;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String password;

    @OneToOne(mappedBy = "user", cascade=CascadeType.ALL)
    private Photo foto;

    @OneToMany(mappedBy = "id.user",fetch = FetchType.EAGER, cascade=CascadeType.REMOVE)
    private Set<UserProfile> userProfiles = new HashSet<>();

    @ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_address")
    @JsonBackReference
    private Address address;

    public UserModel() {
    }

    public UserModel(UserAddDTO usuarioDTO) {
        this.cpf = usuarioDTO.getCpf();
        this.rg = usuarioDTO.getRg();
        this.name = usuarioDTO.getName();
        this.email = usuarioDTO.getEmail();
        this.phone = usuarioDTO.getPhone();
        this.password = usuarioDTO.getPassword();
        this.userProfiles = usuarioDTO.getUserProfiles();
    }

    public Set<UserProfile> getUserProfiles() {
        return userProfiles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    

    public void setUserProfiles(Set<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }

    public Photo getFoto() {
        return null;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFoto(Photo foto) {
        this.foto = foto;
    }
}
