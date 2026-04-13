package com.theMainApplication.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "MAIN_APP_ADDRESS_TABLE")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addressId;
    private String addressType;
    private String houseNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private String emailAddress;
    @ManyToOne
    @JoinColumn(name = "userAddressId")
    private User user;
}
