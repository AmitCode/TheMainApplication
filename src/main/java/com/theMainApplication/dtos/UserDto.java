package com.theMainApplication.dtos;

import com.theMainApplication.entities.UserAddress;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDto {
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
}
