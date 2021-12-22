package br.com.serratec.beestock.dto;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.serratec.beestock.model.Address;
import br.com.serratec.beestock.model.UserModel;
import br.com.serratec.beestock.model.UserProfile;
import br.com.serratec.beestock.repository.UserProfileRepository;
import br.com.serratec.beestock.service.ProfileService;

public class UserDTO {
    private Integer id;
    private String name;
    private String email;
    private String cpf;
    private String rg;
    private Address address;
    private String phone;
    private String cargo;

    @Autowired
    ProfileService perfilService;
    @Autowired
    UserProfileRepository usuarioPerfilRepository;

    


    public UserDTO() {
    }

    public UserDTO(UserModel usuario) {
        this.id = usuario.getId();
        this.name = usuario.getName();
        this.email =  usuario.getEmail();
        this.cpf =  usuario.getCpf();
        this.rg =  usuario.getRg();
        this.address =  usuario.getAddress();
        this.phone =  usuario.getPhone();
        this.cargo = getCargo(usuario);
    }

    private String getCargo(UserModel usuario){
        String cargo = "";
        for (UserProfile userProfile : usuario.getUserProfiles()) {
		     cargo =	userProfile.getProfile().getCargo();
		}
        return cargo;
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

    public Address getEndereco() {
        return address;
    }

    public void setEndereco(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}
