package com.theMainApplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "MAIN_APP_USERS_TABLE")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String userName;
    private String userFirstName;
    private String userMiddleName;
    private String userLastName;
    private String userEmail;
    private String userMobileNumber;
    private String userPassword;
    private String userConfirmPassword;
    private String userGender;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserAddress> userAddress;
}
