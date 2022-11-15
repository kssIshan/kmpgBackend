package com.example.docWareBackend.service;


import com.example.docWareBackend.dto.UserDTO;
import com.example.docWareBackend.entity.User;
import com.example.docWareBackend.repo.UserRepo;
import org.apache.commons.codec.binary.Base64;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;



@Service
@Transactional
public class UserService {

    Base64 base64 = new Base64();



    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;



    public UserDTO  saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;

    }

    public List<UserDTO> getAllUsers(String authorization){
        String decodedString = new String(base64.decode(authorization.getBytes()));
        decodedString = decodedString.replaceAll("Basic", "");
//        decodedString = decodedString.split(":",);
        System.out.println(decodedString+ "//////////userService");
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());

    }
}
