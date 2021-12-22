package br.com.serratec.beestock.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;



@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_profile")
    private Integer id;

    @Column
    private String cargo;

    @OneToMany(mappedBy = "id.profile")
    private Set<UserProfile> userProfiles = new HashSet<>();

    public Profile() {
   
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setUserProfiles(Set<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }

    
}
