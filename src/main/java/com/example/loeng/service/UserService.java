package com.example.loeng.service;

import com.example.loeng.domain.User;
import com.example.loeng.repository.UserRepository;
import com.example.loeng.vo.UserRequestVo;
import com.example.loeng.vo.UserResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseVo saveUser(UserRequestVo userRequestVo) {
        User user = new User();
        user.setName(userRequestVo.getName());
        user.setEmail(userRequestVo.getEmail());

        User savedUsed = userRepository.save(user);

        UserResponseVo responseVo = new UserResponseVo();
        responseVo.setId(savedUsed.getId());
        responseVo.setName(savedUsed.getName());
        responseVo.setEmail(savedUsed.getEmail());

        return responseVo;
    }

}
