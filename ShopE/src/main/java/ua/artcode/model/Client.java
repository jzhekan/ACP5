package ua.artcode.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client extends AutoGeneratedIdentifier {


    @Enumerated(value = EnumType.STRING)
    @Column(name = "client_type")
    private ClientType clientType;

    private String login;
    private String pass;
    private String email;
    private String phone;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public Client() {
    }

    public Client(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public Client(String login, String pass, String email, String phone) {
        this.login = login;
        this.pass = pass;
        this.email = email;
        this.phone = phone;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + getId() +
                '}';
    }
}
