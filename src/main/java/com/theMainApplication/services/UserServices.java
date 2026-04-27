package com.theMainApplication.services;

import com.theMainApplication.dtos.UserDto;
import com.theMainApplication.entities.User;
import com.theMainApplication.mapper.UserModelMapper;
import com.theMainApplication.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    private final UserRepository repository;
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
        User user = UserModelMapper.mapToUser(userDto);

        return "Error";
    }
}
