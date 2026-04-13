package com.theMainApplication.dtos;

import com.theMainApplication.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserAddressDto {
    private long addressId;
    private String addressType;
    private String houseNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private String emailAddress;
    private User user;
}

