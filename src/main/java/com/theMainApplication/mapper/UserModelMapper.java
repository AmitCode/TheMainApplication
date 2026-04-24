package com.theMainApplication.mapper;

import com.theMainApplication.dtos.UserDto;
import com.theMainApplication.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserModelMapper {

    /**
     * This method maps a {@link UserDto} object to a {@link User} entity object.
     *
     * @param userDTO The {@link UserDto} object to be mapped.
     * @return The mapped {@link User} entity object.
     */
    public static User mapToUser(UserDto userDTO){

        User users = new User();
        users.setUserFirstName(userDTO.getUserFirstName());
        users.setUserMiddleName(userDTO.getUserMiddleName());
        users.setUserLastName(userDTO.getUserLastName());
        users.setUserContactNumber(userDTO.getUserContactNumber());
        users.setUserEmailId(userDTO.getUserEmailId());
        users.setIsEmailVerified(userDTO.getIsEmailVerified());
        users.setIsMobileVerified(userDTO.getIsMobileVerified());
        users.setPassword(userDTO.getUserPassword());
        users.setConfirmPassword(userDTO.getConfirmPassword());

//        List<Address> addresses = userDTO.getAddresses().stream()
//                //.map(addressDTO -> AddressModelMapper.mapToAddress(addressDTO))writing it to method reference
//                .map(AddressModelMapper::mapToAddress)//Method reference
//                .collect(Collectors.toList());
//
//        addresses.forEach(address -> address.setUserInfo(users));
//        users.setAddresses(addresses);

        return users;
    }

    /**
     * This method maps a {@link User} entity object to a {@link UserDto} object.
     *
     * @param users The {@link User} entity object to be mapped.
     * @return The mapped {@link UserDto} object.
     */
    public static UserDto mapToUserDTO(User users){

        UserDto userDTO = new UserDto();
        userDTO.setUserId(users.getUserId());
        userDTO.setUserFirstName(users.getUserFirstName());
        userDTO.setUserMiddleName(users.getUserMiddleName());
        userDTO.setUserLastName(users.getUserLastName());
        userDTO.setIsUserActive(users.getIsUserActive());
        userDTO.setUserEmailId(users.getUserEmailId());
        userDTO.setUserContactNumber(users.getUserContactNumber());
        userDTO.setIsMobileVerified(users.getIsMobileVerified());
        userDTO.setIsEmailVerified(users.getIsEmailVerified());
        userDTO.setUserPassword(users.getPassword());
        userDTO.setConfirmPassword(users.getConfirmPassword());

//        List<AddressDTO> addresses = users.getAddresses().stream()
//                .map(AddressModelMapper::mapToAddressDTO)
//                .collect(Collectors.toList());
//
//        //addresses.forEach(address -> address.setUserInfo(users));
//
//        userDTO.setAddresses(addresses);

        return userDTO;
    }

    /**
     * This method maps a list of {@link User} entity objects to a list of {@link UserDto} objects.
     *
     * @param users The list of {@link User} entity objects to be mapped.
     * @return The mapped list of {@link UserDto} objects.
     */
    public ArrayList<UserDto> mapToListOfUserDTO(List<User> users){
        ArrayList<UserDto> userDTOS = new ArrayList<>();
        for (User user : users){
            userDTOS.add(mapToUserDTO(user));
        }
        return userDTOS;
    }
}
