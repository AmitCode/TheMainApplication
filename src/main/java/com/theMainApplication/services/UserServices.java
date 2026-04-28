package com.theMainApplication.services;

import com.theMainApplication.dtos.UserDto;
import com.theMainApplication.dtos.response.UserServiceOprResponse;
import com.theMainApplication.entities.User;
import com.theMainApplication.exceptions.SuppliersOprException.UserNameAlreadyExist;
import com.theMainApplication.mapper.UserModelMapper;
import com.theMainApplication.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    private final UserRepository repository;
    private final UserServiceOprResponse response = new UserServiceOprResponse();
    UserServices(UserRepository repository){
        this.repository = repository;
    }

    public List<UserDto> getAllUsers(){
        List<User> users = repository.findAll();
        List<UserDto> userDtos = new ArrayList<>();
        for(User user : users){
            userDtos.add(UserModelMapper.mapToUserDTO(user));
        }
        return userDtos;
    }

    public String addNewUser(UserDto userDto){
        Optional<User> userOptional = repository.findByUserName(userDto.getUserName());
        if(userOptional.isPresent())
            throw new UserNameAlreadyExist("User already exists!...");
        User user = UserModelMapper.mapToUser(userDto);
        User newUser = repository.save(user);
        response.setStatusCode(HttpStatus.CREATED.toString())
                .setIsOprSuccess(true)
                .setResponseMsg("User has been added successfully with id : "+ user.getUserId() +"!...");
        return "User has been added successfully!...";
    }
}
