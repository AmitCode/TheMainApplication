package com.theMainApplication.controllers;

import com.theMainApplication.dtos.UserDto;
import com.theMainApplication.services.UserServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userService")
public class UserController {
    private final UserServices userServices;
    UserController(UserServices userServices){
        this.userServices = userServices;
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return new ResponseEntity<>(userServices.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/addNewUser")
    public ResponseEntity<String> addNewUser(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userServices.addNewUser(userDto), HttpStatus.CREATED);
    }

//    @PutMapping("/updateUserDetails")
//    public ResponseEntity<String>

}
