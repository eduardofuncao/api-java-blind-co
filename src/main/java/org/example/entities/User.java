package org.example.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class User {
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String role;
    private String company;

    public User(int id, String username, String password, String firstName, String lastName, String email, String phone, String role, String company) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.company = company;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", role='" + role + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public Map<Boolean, ArrayList<String>> validate() {
        // trabalhar com uma lista de erros ao invés de fazer o throw de exceção direto no primeiro erro
        // isso permite que o usuário veja todos os erros de uma vez
        // e não apenas o primeiro erro que ocorreu
        // assim ele pode corrigir todos os erros de uma vez
        var errors = new ArrayList<String>();
        if (username == null || username.isBlank())
            errors.add("Nome do User não pode ser vazio");
        if (this.password.length() > 15)
            errors.add("Senha não pode ter mais de 15 caracteres");

        return !errors.isEmpty() ?
                Map.of(false, errors) :
                Map.of(true, errors);
    }
}
