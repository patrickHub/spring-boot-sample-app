package de.codecentric.springbootsample.model;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by Patrick-PC on 18.06.2018.
 */

@Entity
@Table(name = "userAccount")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Email(message = "*Please provide a valid Email")
    @NotEmpty(message = "*Please privide an Email")
    @Column(name = "email")
    private String email;

    @Length(min=5, message = "*Your password must have at least 5 characteres")
    @NotEmpty(message="*Please private your password")
    @Transient
    @Column(name = "pass", unique = true)
    private String password;

    @NotEmpty(message = "*Please privide your first name")
    @Column(name = "firstName")
    private String firstName;

    @NotEmpty(message = "*Please privide your last name")
    @Column(name = "lastName")
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
